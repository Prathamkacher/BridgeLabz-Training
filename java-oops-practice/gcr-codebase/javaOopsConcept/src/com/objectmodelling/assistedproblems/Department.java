package com.objectmodelling.assistedproblems;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String deptName;
    private List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(int id, String name) {
        employees.add(new Employee(id, name));
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}
