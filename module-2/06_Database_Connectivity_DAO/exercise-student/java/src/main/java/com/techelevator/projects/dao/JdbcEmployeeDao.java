package com.techelevator.projects.dao;

import java.util.*;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final NamedParameterJdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {

		String sql="select employee_id, department_id, first_name, last_name, birth_date, hire_date from employee";
		Map<String, Object>params = new HashMap<>();
		SqlRowSet rowSet = this.jdbcTemplate.queryForRowSet(sql,params);
		List<Employee>employees=new ArrayList<>();
		while(rowSet.next()){
			employees.add(mapRowToEmployee(rowSet));
		}

		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		String sql;
		Map<String, Object>params=new HashMap<>();
		List<Employee>employees= new ArrayList<>();
		if((firstNameSearch=="") && (lastNameSearch=="")){
			return getAllEmployees();
		}else if ((firstNameSearch!="")&&(lastNameSearch!="")){
			sql ="select employee_id, department_id, first_name, last_name, birth_date, hire_date from employee where lower(last_name) like :last_name and lower(first_name) like :first_name ";
			// java layer
			params.put("last_name","%"+lastNameSearch.toLowerCase()+"%");
			params.put("first_name","%"+firstNameSearch.toLowerCase()+"%");
		}
		else if (lastNameSearch!=""){
			sql ="select employee_id, department_id, first_name, last_name, birth_date, hire_date from employee where lower(last_name) like :last_name";
			// java layer
			params.put("last_name","%"+lastNameSearch.toLowerCase()+"%");
		}
		else {
			sql ="select employee_id, department_id, first_name, last_name, birth_date, hire_date from employee where lower(first_name) like :first_name";
			// java layer
			params.put("first_name","%"+firstNameSearch.toLowerCase()+"%");
		}

		SqlRowSet rowSet = this.jdbcTemplate.queryForRowSet(sql,params);
		while(rowSet.next()){
			employees.add(mapRowToEmployee(rowSet));
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {

		String sql = "select e.employee_id, department_id, first_name, last_name , hire_date,birth_date\n" +
				"from employee e\n" +
				"    join project_employee as pe on e.employee_id = pe.employee_id\n " +
				"where pe.project_id=:project_id";

		Map<String,Object> params = new HashMap<>();
		params.put("project_id",projectId);
		List<Employee> employees = new ArrayList<>();
		SqlRowSet rowSet = this.jdbcTemplate.queryForRowSet(sql,params);
		while (rowSet.next()){
			employees.add(mapRowToEmployee(rowSet));
		}
		return employees;
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {

		String sql = "insert into project_employee(project_id, employee_id) values(:project_id,:employee_id)";
		Map<String,Object>params=new HashMap<>();
		params.put("project_id",projectId);
		params.put("employee_id",employeeId);
		this.jdbcTemplate.update(sql,params);
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {


		String sql = "delete from project_employee where project_id=:project_id and employee_id=:employee_id ";
		Map<String,Object>params=new HashMap<>();
		params.put("project_id",projectId);
		params.put("employee_id",employeeId);
		this.jdbcTemplate.update(sql,params);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {

		String sql="select e.employee_id, department_id, first_name, last_name , hire_date,birth_date\n"+
				"from employee e\n" +
				"    left join project_employee pe on e.employee_id = pe.employee_id\n" +
				"where project_id is null";

		Map<String ,Object>params=new HashMap<>();
		SqlRowSet rowSet = this.jdbcTemplate.queryForRowSet(sql,params);
		List<Employee> employees=new ArrayList<>();
		while(rowSet.next()){
			employees.add(mapRowToEmployee(rowSet));
		}
		return employees;
	}


	private Employee mapRowToEmployee(SqlRowSet rowSet){
		Employee employee = new Employee();
		employee.setBirthDate(rowSet.getDate("birth_date").toLocalDate());
		employee.setId(rowSet.getLong("employee_id"));
		employee.setDepartmentId(rowSet.getLong("department_id"));
		employee.setFirstName(rowSet.getString("first_name"));
		employee.setLastName(rowSet.getString("last_name"));
		employee.setHireDate(rowSet.getDate("hire_date").toLocalDate());
		return employee;
	}


}
