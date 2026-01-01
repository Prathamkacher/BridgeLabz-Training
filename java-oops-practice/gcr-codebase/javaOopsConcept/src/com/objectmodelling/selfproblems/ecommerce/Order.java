package com.objectmodelling.ecommerce;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    // Aggregation: add existing product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Communication: calculate total
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Display order details
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");

        for (Product product : products) {
            System.out.println("- " + product.getProductName() + " : ₹" + product.getPrice());
        }

        System.out.println("Total Amount: ₹" + calculateTotal());
        System.out.println();
    }
}
