package com.day8.foodloop;

import java.util.ArrayList;

class Order implements IOrderable {

    private ArrayList<FoodItem> items;
    private double total;

    public Order(ArrayList<FoodItem> items) {
        this.items = items;
        this.total = 0;
    }

    private void calculateTotal() {
        total = 0;
        System.out.println("\nItems in your order:");
        System.out.println("------------------------------");

        for (FoodItem item : items) {
            if (item.isAvailable()) {
                System.out.println(item.name + " - ₹" + item.getPrice());
                total += item.getPrice();   // operator
                item.reduceStock();
            }
        }
        applyDiscount();
    }

    // Polymorphic discount logic
    private void applyDiscount() {
        if (total > 1000) {
            total -= 200;
            System.out.println("------------------------------");
            System.out.println("Discount Applied: ₹200");
        } else if (total > 500) {
            total -= 100;
            System.out.println("------------------------------");
            System.out.println("Discount Applied: ₹100");
        }
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Final Bill Amount: ₹" + total);
        System.out.println("------------------------------");
        System.out.println("Order placed successfully!");
        System.out.println("------------------------------");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
    }
}
