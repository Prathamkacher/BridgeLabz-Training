package com.collections.shoppingcart;

import java.util.*;

public class Cart {

  
    HashMap<String, Double> priceMap = new HashMap<>();

    LinkedHashMap<String, Double> cartOrder = new LinkedHashMap<>();

    // Add item
    public void addItem(Product product) {
        priceMap.put(product.name, product.price);
        cartOrder.put(product.name, product.price);
    }

    // Display cart in insertion order
    public void displayCartOrder() {
        System.out.println("Cart Items (Insertion Order):");
        cartOrder.forEach((k, v) -> System.out.println(k + " : ₹" + v));
    }

    // Display items sorted by price
    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Items Sorted by Price:");
        sortedMap.forEach((k, v) -> System.out.println(v + " : ₹" + k));
    }
}
