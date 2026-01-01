package com.objectmodelling.ecommerce;

public class Main {

    public static void main(String[] args) {

        // Products (independent)
        Product p1 = new Product("Laptop", 65000);
        Product p2 = new Product("Wireless Mouse", 1200);
        Product p3 = new Product("Keyboard", 1800);

        // Customer
        Customer customer = new Customer("Rahul");

        // Order
        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(102);
        order2.addProduct(p3);

        // Communication
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // View details
        customer.viewOrders();
    }
}
