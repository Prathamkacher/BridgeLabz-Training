package com.conversionlogicalquestions.objectcollection;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aryan", "IT", 60000),
                new Employee(2, "Rahul", "HR", 50000),
                new Employee(3, "Neha", "IT", 70000),
                new Employee(4, "Simran", "Finance", 65000)
        );

        // List<Employee> -> Map<Id, Employee>
        Map<Integer, Employee> map1 = employees.stream()
                .collect(Collectors.toMap(Employee::getId, e -> e));
        System.out.println("1. Id -> Employee: " + map1);

        // List<Employee> -> Map<Dept, List<Employee>>
        Map<String, List<Employee>> map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("2. Dept -> Employees: " + map2);

        // List<Employee> -> Set of departments
        Set<String> depts = employees.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toSet());
        System.out.println("3. Departments: " + depts);

        // List<Employee> -> List of names
        List<String> names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("4. Names: " + names);

        // Grouping by salary range (example)
        Map<Boolean, List<Employee>> map5 = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getSalary() > 60000));
        System.out.println("5. Grouped by salary > 60k: " + map5);

        // Map<EmployeeId, Employee> -> List of names
        Map<Integer, Employee> empMap = map1;
        List<String> nameList = empMap.values().stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("6. Names from Map: " + nameList);

        // List<Employee> -> Map<Name, Salary>
        Map<String, Double> salaryMap = employees.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println("7. Name -> Salary: " + salaryMap);

        // Nested object list to flat List
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );
        List<String> flat = nested.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("8. Flat List: " + flat);

        // List<Order> -> Map<Customer, TotalAmount>
        List<Order> orders = Arrays.asList(
                new Order("Aryan", 200),
                new Order("Rahul", 300),
                new Order("Aryan", 150)
        );
        Map<String, Double> totalByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomer,
                        Collectors.summingDouble(Order::getAmount)
                ));
        System.out.println("9. Customer -> Total Amount: " + totalByCustomer);

        // Composite key (Dept+Name) -> Salary
        Map<String, Double> compositeKeyMap = employees.stream()
                .collect(Collectors.toMap(
                        e -> e.getDepartment() + "-" + e.getName(),
                        Employee::getSalary
                ));
        System.out.println("10. Composite Key Map: " + compositeKeyMap);
    }
}