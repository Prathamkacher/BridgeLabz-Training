package com.lambdaexpressions.customsorting;

import java.util.*;

public class ECommerceSorting {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 60000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.8, 15));
        products.add(new Product("Headphones", 2000, 4.2, 25));
        products.add(new Product("Smart Watch", 5000, 4.6, 20));

        
        String campaign = "RATING";

        Comparator<Product> comparator;

        switch (campaign) {
            case "PRICE":
                comparator = (p1, p2) -> Double.compare(p1.price, p2.price);
                break;

            case "RATING":
                comparator = (p1, p2) -> Double.compare(p2.rating, p1.rating);
                break;

            case "DISCOUNT":
                comparator = (p1, p2) -> Double.compare(p2.discount, p1.discount);
                break;

            default:
                comparator = (p1, p2) -> 0;
        }

        // Sorting dynamically
        products.sort(comparator);

        System.out.println("Products sorted for " + campaign + " campaign:\n");
        products.forEach(System.out::println);
    }
}
