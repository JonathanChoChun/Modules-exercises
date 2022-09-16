package com.techelevator;

public class Department {
    /*
    Name	Type	Getter	Setter
departmentId	int	x	x
name	String	x	x
     */
    private int departmentId;
    private String name;

    /*
    departmentID and name
     */
    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
