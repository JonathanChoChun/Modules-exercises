package com.techelevator.controller;

import com.techelevator.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping(value = "/customerForm", method = RequestMethod.GET)
    public String showCustomerSearchForm(){
        return "customerList";
    }

    @RequestMapping(value = "/customerSearch", method = RequestMethod.GET)
    public String searchCustomers(
            @RequestParam String nameSearch,
            @RequestParam String sort,
            ModelMap modelHolder
    ){
        modelHolder.put("customers",customerDao.searchAndSortCustomers(nameSearch,sort));
        return "customerList";
    }

}