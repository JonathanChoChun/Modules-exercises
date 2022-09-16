package com.techelevator;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Application {

    /*
    Create an instance variable in the Application class called departments to hold a List<Department>.
Create an instance variable in the Application class called employees to hold a List<Employee>.
Create an instance variable in the Application class called projects to hold a collection of projects.
The variable must be of type Map<String,Project> where the key is the name of the project.
     */

    private List<Department> departments;
    private List<Employee> employees;
    private Map<String,Project> projects;

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        /*
        departmentId	name
        1	Marketing
        2	Sales
        3	Engineering
         */
        if (departments==null){
            departments = new ArrayList<Department>();
        }
        departments.add(new Department(1	,"Marketing"));
        departments.add(new Department(2	,"Sales"));
        departments.add(new Department(3	,"Engineering"));
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department department: departments) {
            System.out.println(department.getName());
        }

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        /*
        Dean Johnson: Create this employee using the no-argument constructor and call setter methods to set each instance variable.
        Angie Smith: Create this employee using the all-argument constructor.
        Margaret Thompson: Create this employee using the all-argument constructor.
         */
        if (employees==null) {
            employees = new ArrayList<Employee>();
        }
        /*
        employeeId	firstName	lastName	email	salary	department	hireDate
        1	Dean	Johnson	djohnson@teams.com	60000	Engineering	08/21/2020
        2	Angie	Smith	asmith@teams.com	60000	Engineering	08/21/2020
        3	Margaret	Thompson	mthompson@teams.com	60000	Marketing	08/21/2020
         */
        Employee emp1 = new Employee();
        emp1.setEmployeeId(1);
        emp1.setFirstName("Dean");
        emp1.setLastName("Johnson");
        emp1.setEmail("djohnson@teams.com");
        emp1.setSalary(60000); //not needed but is fine to set explicitly
        emp1.setHireDate("08/21/2020");
        emp1.setDepartment(getDepartmentByName("Engineering"));
        this.employees.add(emp1);
        this.employees.add(new Employee(2, "Angie", "Smith", "asmith@teams.com", getDepartmentByName("Engineering"), "08/21/2020"));
        this.employees.add(new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", getDepartmentByName("Marketing"), "08/21/2020"));

        //Before printing the list of Employees, give Angie a 10% raise.
        Employee angie = this.employees.get(1);
        angie.raiseSalary(10);

    }

    private Department getDepartmentByName(String nameOfDepartment) {
        for (Department department : this.departments) {
            if (nameOfDepartment.equalsIgnoreCase(department.getName())) {
                return department;
            }
        }
        return null;
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        //print out their name, salary, and department. Use the derived property getFullName
        //Johnson, Dean (60000.0) Engineering
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        for (Employee employee : this.employees) {
            System.out.println(employee.getFullName() + " ("
                    + currency.format(employee.getSalary())
                    + ") " + employee.getDepartment().getName());
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        /*
        name: TEams
        description: Project Management Software
        startDate: 10/10/2020
        dueDate: 11/10/2020

        Add all the employees from the engineering department to this project.
        Add the project to the projects map.
         */

        Project project = new Project("TEams", "Project Management Software",
                LocalDate.now(),
                LocalDate.now().plusDays(30));
        List<Employee> projectEmployees = new ArrayList<>();
        for (Employee employee : this.employees) {
            if (employee.getDepartment().getName().equalsIgnoreCase("Engineering")){
                projectEmployees.add(employee);
            }
        }
        project.setTeamMembers(projectEmployees);
        this.projects = new HashMap<>();
        this.projects.put(project.getName(),project);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        /*
        name: Marketing Landing Page
        description: Lead Capture Landing Page for Marketing
        startDate: 10/10/2020
        dueDate: 10/17/2020
        After you create this project, follow these steps:

        Add all the employees from the marketing department to this project.
        Add the project to the projects map.

        start date: today + 31 days
due date: start date + 7 days

         */
        Project project = new Project("Marketing Landing Page","Lead Capture Landing Page for Marketing",
                LocalDate.now().plusDays(31),
                LocalDate.now().plusDays(31).plusDays(7));
        List<Employee> projectEmployees = new ArrayList<>();
        for (Employee employee : this.employees) {
            if (employee.getDepartment().getName().equalsIgnoreCase("Marketing")){
                projectEmployees.add(employee);
            }
        }
        project.setTeamMembers(projectEmployees);
        this.projects.put(project.getName(),project);
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        /*
        TEams: 2
        Marketing Landing Page: 1
         */
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Map.Entry<String,Project> project : this.projects.entrySet()) {
            System.out.println(project.getKey() + ": " + project.getValue().getTeamMembers().size()
                    + " - " + project.getValue().getDueDate().format(fmt));
        }

    }

}
