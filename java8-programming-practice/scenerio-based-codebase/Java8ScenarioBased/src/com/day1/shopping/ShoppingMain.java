package com.day1.shopping;

import java.util.*;

public class ShoppingMain {

    public static void main(String[] args) {

        List<Product> cart = Arrays.asList(
                new Product("Laptop", 600, 1),
                new Product("Mouse", 200, 2),
                new Product("Keyboard", 400, 1),
                new Product("Controller", 400, 1)
        );

        System.out.println("---- Discounted Prices ----");
        cart.forEach(p -> System.out.println(p.getName() + " after discount: " +
                ProductService.applyDiscount.apply(p)));

        System.out.println("\n---- Sorted by Price ----");
        cart.stream()
            .sorted(ProductService.sortByPrice)
            .forEach(System.out::println);

        System.out.println("\n---- Final Bill Amount ----");
        double totalBill = cart.stream()
                .map(ProductService.productTotal)
                .reduce(0.0, Double::sum);

        System.out.println("Total Bill = " + totalBill);

        System.out.println("\nFree Delivery? " +
                ProductService.freeDeliveryEligible.test(totalBill));

        System.out.println("\n---- Product Names ----");
        cart.forEach(ProductService.printProductName);
    }
}
