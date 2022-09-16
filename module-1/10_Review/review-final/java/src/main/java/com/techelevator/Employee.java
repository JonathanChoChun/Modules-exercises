package com.techelevator;

public class Employee {

    /*
    Static constants
The default starting salary for all employees is $60,000 and is stored in a static constant variable of type double.
     */
    private static final double STARTING_SALARY = 60000;

    /*
    employeeId	long	x	x
firstName	String	x	x
lastName	String	x	x
email	String	x	x
salary	double	x	x
department	Department	x	x
hireDate	String	x	x
     */
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;


    /*
    The first one accepts all the arguments needed to create a new Employee: employeeID, firstName, lastName, email, department, and hireDate.
     */

    public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = STARTING_SALARY;
    }

    //default constructor

    public Employee() {
        this.salary = STARTING_SALARY;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }


    /*
    Method Name	Description
getFullName()	A derived property that returns the employee's full name in the following format: "Last, First"
raiseSalary(double percent)	A method that raises the employee's salary by x percent
     */

    public String getFullName(){
        return this.lastName + ", " + this.firstName;
    }

    public void raiseSalary(double percent){
        double raiseAmount = (this.salary * (percent/100));
        //log raiseAmount = , init salary was
        this.salary += raiseAmount;

    }


}
