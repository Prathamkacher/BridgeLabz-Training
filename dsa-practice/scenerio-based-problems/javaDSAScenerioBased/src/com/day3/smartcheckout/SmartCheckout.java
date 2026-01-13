package com.day3.smartcheckout;

import java.util.*;

public class SmartCheckout {

    private Queue<Customer> queue = new LinkedList<>();

    // Price and stock maps
    private HashMap<String, Integer> priceMap = new HashMap<>();
    private HashMap<String, Integer> stockMap = new HashMap<>();

    public SmartCheckout() {
        // Preload items
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 40);
        priceMap.put("Eggs", 10);

        stockMap.put("Milk", 5);
        stockMap.put("Bread", 3);
        stockMap.put("Eggs", 12);
    }

    // Add customer to queue
    public void addCustomer(Customer c) {
        queue.add(c);
        System.out.println(c.name + " added to queue.");
    }

    // Process customer billing
    public void processCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer c = queue.poll();
        System.out.println("\nProcessing bill for: " + c.name);

        int total = 0;

        for (String item : c.items) {

            // Check stock
            if (!stockMap.containsKey(item) || stockMap.get(item) <= 0) {
                System.out.println(item + " is out of stock!");
                continue;
            }

            int price = priceMap.get(item);
            total += price;

            // Reduce stock
            stockMap.put(item, stockMap.get(item) - 1);

            System.out.println(item + " - ₹" + price);
        }

        System.out.println("Total Bill: ₹" + total);
    }

    // Display stock
    public void displayStock() {
        System.out.println("\nCurrent Stock:");
        for (String item : stockMap.keySet()) {
            System.out.println(item + " → " + stockMap.get(item));
        }
    }
}
