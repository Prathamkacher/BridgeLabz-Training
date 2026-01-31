package com.stream.transformnames;

import java.util.List;
import java.util.stream.Collectors;

public class NameTransformers {

    public static void main(String[] args) {

        List<String> customerNames = List.of(
                "prashant",
                "ananya",
                "vikram",
                "neha",
                "rahul",
                "arjun"
        );

        List<String> transformedNames = customerNames.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Customer Names (Uppercase & Sorted)");
        System.out.println("-----------------------------------");

        for (String name : transformedNames) {
            System.out.println(name);
        }
    }
}
