package com.collectors.employeesalary;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Aman Sharma", "IT", 85000),
                new Employee("Riya Mehta", "IT", 75000),
                new Employee("Kunal Verma", "HR", 50000),
                new Employee("Sneha Kapoor", "HR", 60000),
                new Employee("Rahul Singh", "Finance", 70000),
                new Employee("Neha Joshi", "Finance", 66000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.printf("Department: %-10s | Average Salary: ₹%.2f%n",
                        dept, avgSalary));
    }
}
