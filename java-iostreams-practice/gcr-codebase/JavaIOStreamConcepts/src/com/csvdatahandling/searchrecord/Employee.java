package com.csvdatahandling.searchrecord;

public class Employee {
    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void print() {
        System.out.println(
            "Department: " + department +
            ", Salary: " + salary
        );
    }
}
