package com.day1.officesystem;

import java.util.*;

public class OfficeMain {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Aryaman", 100000, 5),
                new Employee("Aryan", 31000, 4),
                new Employee("Hemant", 25000, 1),
                new Employee("Gaurav", 29000, 2)
        );

        System.out.println("---- Bonus Calculation ----");
        list.forEach(e ->
                System.out.println(e.getName() + " Bonus: " +
                        EmployeeService.calculateBonus.apply(e)));

        System.out.println("\n---- Sorted by Salary ----");
        list.stream()
            .sorted(EmployeeService.sortBySalary)
            .forEach(EmployeeService.employeeDetail);

        System.out.println("\n---- Promotion Eligibility ----");
        list.stream()
            .filter(EmployeeService.promotionEligible)
            .forEach(e -> System.out.println(e.getName() + " is eligible"));

        System.out.println("\n---- Compare Salaries ----");
        System.out.println(EmployeeService.compareSalary.apply(list.get(1), list.get(3)));
    }
}
