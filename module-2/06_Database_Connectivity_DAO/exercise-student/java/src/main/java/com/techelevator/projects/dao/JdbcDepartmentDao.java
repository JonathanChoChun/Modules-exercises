package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final NamedParameterJdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(Long id) {

		String sql = "select department_id, name from department where department_id= :department_id";
		Map<String,Object> params= new HashMap<>();
		params.put("department_id",id);
		//Department department = this.jdbcTemplate.queryForObject(sql,params);

		SqlRowSet rowSet = this.jdbcTemplate.queryForRowSet(sql,params);

		if(rowSet.next()){
				return mapRowToDepartment(rowSet);
		}

		return null;
	}

	@Override
	public List<Department> getAllDepartments() {

		List<Department> departments = new ArrayList<>();
		String sql="select department_id, name from department";
		Map<String, Object> params = new HashMap<>();
		SqlRowSet rowset = this.jdbcTemplate.queryForRowSet(sql,params);
		while (rowset.next()){
			departments.add(mapRowToDepartment(rowset));
		}
		return departments;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {

		String sql = "update department set name=:name where department_id=:department_id";
		Map<String, Object> params = new HashMap<>();
		params.put("name",updatedDepartment.getName());
		params.put("department_id",updatedDepartment.getId());
		this.jdbcTemplate.update(sql,params);

	}

	private Department mapRowToDepartment(SqlRowSet rowSet){
		Department department = new Department();
		department.setName(rowSet.getString("name"));
		department.setId(rowSet.getLong("department_id"));
		return department;
	}

}
