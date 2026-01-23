package com.day9.ecommerceapp;

public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(105, "Phone", 15000));
        manager.addProduct(new Product(101, "Laptop", 55000));
        manager.addProduct(new Product(110, "Headphones", 2000));

        // Scenario 1: Lookup
        manager.searchProduct(101);

        // Scenario 2: Update price
        manager.updatePrice(105, 14000);

        // Scenario 3: Sorted list
        manager.displaySorted();
    }
}
