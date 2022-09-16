package com.techelevator.dao;

import com.techelevator.model.Customer;
import java.util.List;

/**
 * CustomerDao
 */
public interface CustomerDao {
    List<Customer> searchAndSortCustomers(String search, String sort);
}