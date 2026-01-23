package com.day9.ecommerceapp;

import java.util.*;

public class InventoryManager {

    private TreeMap<Integer, Product> inventory = new TreeMap<>();

    // Add product
    public void addProduct(Product p) {
        inventory.put(p.sku, p);
        System.out.println("Product added.");
    }

    // Scenario 1: Lookup
    public void searchProduct(int sku) {
        Product p = inventory.get(sku);
        if (p != null)
            System.out.println("Found: " + p);
        else
            System.out.println("Product not found.");
    }

    // Scenario 2: Update price
    public void updatePrice(int sku, double newPrice) {
        Product p = inventory.get(sku);
        if (p != null) {
            p.price = newPrice;
            System.out.println("Price updated: " + p);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Scenario 3: Sorted display
    public void displaySorted() {
        System.out.println("\nProducts in Sorted SKU Order:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
