package com.techelevator.dao;

import com.techelevator.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class CustomerDaoJdbc implements CustomerDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDaoJdbc(DataSource dataSource) {
        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<Customer> searchAndSortCustomers(String search, String sort) {

        //String sql="select first_name, last_name, email,active from customer where first_name ilike :search or last_name ilike :search order by :sort;";
        String sql="select first_name, last_name, email,active from customer where first_name ilike :search or last_name ilike :search";

        switch (sort){
            case "last_name":
                sql+= " order by last_name;";
                break;

            case "first_name":
                sql+= " order by first_name;";
                break;
            case "active":
                sql+= " order by active;";
                break;


        }


        Map<String,Object>params=new HashMap<>();
        params.put("search","%"+search+"%");
     /*   params.put("sort",sort);*/
        List<Customer>customers = new ArrayList<>();
        SqlRowSet rowSet = this.jdbcTemplate.queryForRowSet(sql,params);
        while(rowSet.next()){
            customers.add(mapRowSetToCustomer(rowSet));
        }
        return customers;
    }

    private Customer mapRowSetToCustomer(SqlRowSet rowSet){
        Customer customer = new Customer();
        customer.setFirstName(rowSet.getString("first_name"));
        customer.setLastName(rowSet.getString("last_name"));
        customer.setEmail(rowSet.getString("email"));
        customer.setActive((rowSet.getInt("active")==1)?true:false);
        return customer;
    }
}