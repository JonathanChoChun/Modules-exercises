package com.techelevator.projects.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final NamedParameterJdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(Long projectId) {

		String sql = "select project_id, name, from_date, to_date from project where project_id=:project_id";

		Map<String,Object> params=new HashMap<>();
		params.put("project_id",projectId);
		SqlRowSet rowSet=this.jdbcTemplate.queryForRowSet(sql,params);
		if(rowSet.next()){
			Project project;
			project=mapRowToProject(rowSet);
			return project;
		}
		return  null;
	}

	@Override
	public List<Project> getAllProjects() {
		String sql = "select project_id, name, from_date, to_date from project";
		Map<String,Object> params=new HashMap<>();
		SqlRowSet rowSet=this.jdbcTemplate.queryForRowSet(sql,params);
		List<Project> projects = new ArrayList<>();
		while(rowSet.next()){

			projects.add(mapRowToProject(rowSet));

		}
		return projects;
	}

	@Override
	public Project createProject(Project newProject) {


		// you can return after an insert statement
		String sql="insert into project(name, from_date, to_date) values (:name, :from_date, :to_date) returning project_id";

		Map<String,Object> params = new HashMap<>();
		params.put("from_date", newProject.getFromDate());
		params.put("name", newProject.getName());
		params.put("to_date",newProject.getToDate());


		Long id=this.jdbcTemplate.queryForObject(sql,params,Long.class);


		return getProject(id);
	}

	@Override
	public void deleteProject(Long projectId) {
		Map<String ,Object>params=new HashMap<>();
		params.put("project_id",projectId);
		this.jdbcTemplate.update("delete from project_employee where project_id=:project_id",params);
		this.jdbcTemplate.update("delete from project where project_id=:project_id",params);

	}

	private Project mapRowToProject(SqlRowSet rowSet){
		Project project = new Project();
		project.setName(rowSet.getString("name"));

		project.setId(rowSet.getLong("project_id"));

		try {
			project.setFromDate(rowSet.getDate("from_date").toLocalDate());
		}
		catch(NullPointerException e){
			System.out.println("from_date is null");
			project.setFromDate(null);
		}
		//
		try{
			project.setToDate(rowSet.getDate("to_date").toLocalDate());
		}catch (NullPointerException e){
			System.out.println("to_date is null");
			project.setToDate(null);
		}
		return project;
	}
}
