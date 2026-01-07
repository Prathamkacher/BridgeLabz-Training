package com.day6.bookbazaar;

import java.util.*;

class Order {

    private String user;
    private Map<Book, Integer> items = new HashMap<>();
    private String orderStatus = "CREATED";

    public Order(String user) {
        this.user = user;
    }

    public void addBook(Book book, int quantity) {
        items.put(book, quantity);
    }

    public double calculateTotal() {
        double total = 0;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int quantity = entry.getValue();

            double discountedPrice = book.applyDiscount(book.getPrice());
            total += discountedPrice * quantity; // operators used
            book.reduceStock(quantity);
        }
        return total;
    }

    // Status update restricted
    protected void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
