package com.objectmodelling.assistedproblems;

class Employee {
    private int empId;
    private String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}
