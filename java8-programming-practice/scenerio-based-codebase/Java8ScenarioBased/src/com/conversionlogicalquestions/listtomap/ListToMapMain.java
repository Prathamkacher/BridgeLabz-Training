package com.conversionlogicalquestions.listtomap;

import java.util.*;
import java.util.stream.*;

public class ListToMapMain {

    public static void main(String[] args) {

        // String -> Length
        List<String> list = Arrays.asList("apple", "bat", "cat");
        Map<String, Integer> map1 = list.stream()
                .collect(Collectors.toMap(s -> s, String::length));
        System.out.println("1. " + map1);

        // Number -> Square
        List<Integer> nums = Arrays.asList(2, 3, 4);
        Map<Integer, Integer> map2 = nums.stream()
                .collect(Collectors.toMap(n -> n, n -> n * n));
        System.out.println("2. " + map2);

        // Employee Id -> Name
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aryan"),
                new Employee(2, "Rahul"),
                new Employee(3, "Neha")
        );
        Map<Integer, String> map3 = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println("3. " + map3);

        // Word Frequency
        List<String> words = Arrays.asList("java", "is", "java", "fast");
        Map<String, Long> map4 = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println("4. " + map4);

        // Index -> Element
        List<String> letters = Arrays.asList("A", "B", "C");
        Map<Integer, String> map5 = IntStream.range(0, letters.size())
                .boxed()
                .collect(Collectors.toMap(i -> i, letters::get));
        System.out.println("5. " + map5);

        // Product Code -> Product
        List<Product> products = Arrays.asList(
                new Product("P101", "Laptop"),
                new Product("P102", "Mouse")
        );
        Map<String, Product> map6 = products.stream()
                .collect(Collectors.toMap(Product::getCode, p -> p));
        System.out.println("6. " + map6);

        // Handle Duplicates (keep first)
        List<String> dupList = Arrays.asList("apple", "bat", "apple");
        Map<String, Integer> map7 = dupList.stream()
                .collect(Collectors.toMap(s -> s, String::length, (oldVal, newVal) -> oldVal));
        System.out.println("7. " + map7);

        // Keep FIRST Duplicate
        Map<String, Integer> map8 = dupList.stream()
                .collect(Collectors.toMap(s -> s, String::length, (first, second) -> first));
        System.out.println("8. " + map8);

        // Keep LAST Duplicate
        Map<String, Integer> map9 = dupList.stream()
                .collect(Collectors.toMap(s -> s, String::length, (first, second) -> second));
        System.out.println("9. " + map9);

        // Group by Length
        Map<Integer, List<String>> map10 = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("10. " + map10);
    }
}