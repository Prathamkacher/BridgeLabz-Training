package com.csvdatahandling.sortcsv;

public class Employee {
    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void print() {
        System.out.println(
            "Name: " + name +
            ", Department: " + department +
            ", Salary: " + salary
        );
    }
}
