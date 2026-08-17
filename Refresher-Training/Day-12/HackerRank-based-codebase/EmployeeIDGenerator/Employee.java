package EmployeeIDGenerator;

public class Employee {
    private String name;
    private static int nextId = 1001;
    private int employeeId;

    public Employee(String name) {
        this.name = name;
        this.employeeId = nextId;
        nextId++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
