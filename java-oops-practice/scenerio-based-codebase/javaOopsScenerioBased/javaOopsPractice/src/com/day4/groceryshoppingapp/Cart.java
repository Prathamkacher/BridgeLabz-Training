package com.day4.groceryshoppingapp;

import java.util.*;

class Cart implements ICheckout {

    private ArrayList<Product> items;
    private double totalPrice;

    Cart() {
        items = new ArrayList<>();
    }

    void addProduct(Product p) {
        items.add(p);
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : items) {
            totalPrice += p.getTotalPrice();
        }
    }

    @Override
    public void applyDiscount(double coupon) {
        double discount = 0;
        for (Product p : items) {
            discount += p.getDiscount(); // polymorphism
        }
        totalPrice = totalPrice - discount - coupon;
    }

    @Override
    public void generateBill() {
        System.out.println("---- SwiftCart Bill ----");
        for (Product p : items) {
            System.out.println(p.name + " | Qty: " + p.quantity + " | ₹" + p.getTotalPrice());
        }
        System.out.println("Payable Amount: ₹" + totalPrice);
    }
}
