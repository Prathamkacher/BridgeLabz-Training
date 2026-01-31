package com.collectors.orderrevenuesummary;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("ORD101", "Aman Sharma", 2500.50),
                new Order("ORD102", "Riya Mehta", 3200.75),
                new Order("ORD103", "Aman Sharma", 1999.99),
                new Order("ORD104", "Sneha Kapoor", 4500.00),
                new Order("ORD105", "Riya Mehta", 3999.25)
        );

        Map<String, Double> revenueSummary =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                Order::getCustomerName,
                                Collectors.summingDouble(Order::getTotalAmount)
                        ));

        System.out.println("=== Customer Revenue Summary Report ===\n");

        revenueSummary.forEach((customer, total) ->
                System.out.printf("Customer: %-15s | Total Revenue: ₹%.2f%n",
                        customer, total));
    }
}
