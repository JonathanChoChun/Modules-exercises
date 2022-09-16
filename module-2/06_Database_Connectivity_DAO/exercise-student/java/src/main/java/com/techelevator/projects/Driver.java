package com.techelevator.projects;

import com.techelevator.projects.view.EmployeeProjectsCLI;
import org.apache.commons.dbcp2.BasicDataSource;

public class Driver {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/EmployeeProjects");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        EmployeeProjectsCLI application = new EmployeeProjectsCLI(dataSource);
        application.run();
    }
}
