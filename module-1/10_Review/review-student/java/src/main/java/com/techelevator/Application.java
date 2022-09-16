package com.techelevator;

import sun.util.resources.LocaleData;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Application {

    /**
     * The main entry point in the application
     * @param args
     */

    List<Department> departments;
    List<Employee> employees;
    Map<String,Project> projects;

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

        if (departments==null){
            departments= new ArrayList<>();
        }
        departments.add(new Department(1,"Marketing"));
        departments.add(new Department(2,"Sales"));
        departments.add(new Department(3,"Engineering"));
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");

        for (Department item: departments){
            System.out.println(item.getName());
        }

    }

    private Department getDepartmentByName(String name){
        for (Department item : departments){
            //System.out.println("loop");
            //System.out.println(item.getName());
            if(item.getName().equalsIgnoreCase(name)){

                //System.out.println(name);
                return item;
            }
        }
        return null;
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {

        if (employees==null){
            employees = new ArrayList<>();
        }
        Employee deanJohnson= new Employee();
        deanJohnson.setFirstName("Dean");
        deanJohnson.setLastName("Johnson");
        //System.out.println(getDepartmentByName("Marketing").getName());
        deanJohnson.setDepartment(getDepartmentByName("Engineering"));
        deanJohnson.setEmployeeId(1);
        deanJohnson.setEmail("djohnson@teams.com");
        LocalDate today = LocalDate.now();
        deanJohnson.setHireDate(today);
        Employee angieSmith = new Employee(2, "Angie", "Smith", "asmith@teams.com", getDepartmentByName("Engineering"), today,60_000);
        Employee margaretThompson = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", getDepartmentByName("Marketing"), today,60_000);
        employees.add(deanJohnson);
        employees.add(angieSmith);
        employees.add(margaretThompson);

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CHINA);
        for (Employee item: employees){
            //System.out.println("1");
            System.out.println(item.getFullName()+" ("+currency.format(item.getSalary())+") "+item.getDepartment().getName());
        }

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

        Project project1 = new Project("TEams","Project Management Software", LocalDate.now(),LocalDate.now().plusDays(30));
        List<Employee> teamMembers = new ArrayList<>();
        for (Employee item: employees){
            if(item.getDepartment().getName().equalsIgnoreCase("Engineering")){
                teamMembers.add(item);
            }
        }
        if (projects==null){
            projects= new HashMap<>();
        }
        project1.setTeamMembers(teamMembers);
        projects.put(project1.getName(), project1);

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        LocalDate startDate = LocalDate.now().plusDays(31);
        LocalDate dueDate = startDate.plusDays(7);
        Project project2 = new Project("Marketing Landing Page","Lead Capture Landing Page for Marketing", startDate,dueDate);
        List<Employee> teamMembers = new ArrayList<>();
        for (Employee item: employees){
            if(item.getDepartment().getName().equalsIgnoreCase("Marketing")){
                teamMembers.add(item);
            }
        }
        if (projects==null){
            projects= new HashMap<>();
        }
        project2.setTeamMembers(teamMembers);
        projects.put(project2.getName(), project2);
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

        //DateTimeFormatter fmt = DateTimeFormatter.ISO_DATE;
        for (Map.Entry<String, Project> item : projects.entrySet()) {

            System.out.println(item.getKey() + ": " + item.getValue().getTeamMembers().size()+ " "+ item.getValue().getDueDate());
        }
    }

}
