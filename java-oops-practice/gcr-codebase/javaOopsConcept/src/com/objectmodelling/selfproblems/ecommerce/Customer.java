package com.objectmodelling.ecommerce;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Order> orders;

    public Customer(String customerName) {
        this.customerName = customerName;
        orders = new ArrayList<>();
    }

    // Association: customer places order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(customerName + " placed an order.\n");
    }

    // View customer orders
    public void viewOrders() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Orders:");

        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}
