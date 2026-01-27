package com.csvdatahandling.writecsv;

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

    String toCSV() {
        return id + "," + name + "," + department + "," + salary;
    }
}
