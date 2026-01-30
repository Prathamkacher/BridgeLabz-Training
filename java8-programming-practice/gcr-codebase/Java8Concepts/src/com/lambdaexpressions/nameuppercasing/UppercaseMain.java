package com.lambdaexpressions.nameuppercasing;

import java.util.*;

public class UppercaseMain {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Aryan"),
                new Employee("Neha"),
                new Employee("Rohit"),
                new Employee("Simran")
        );

        employees.stream()
                 .map(Employee::getName)
                 .map(String::toUpperCase)      // convert to uppercase
                 .forEach(System.out::println);
    }
}
