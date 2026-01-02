package com.encapsulationandpolymorphism.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class ManagementMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Aryaman", 50000);
        Employee e2 = new PartTimeEmployee(102, "Rohit", 80, 300);

        e1.assignDepartment("IT");
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        // Polymorphism: Employee reference, different implementations
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
