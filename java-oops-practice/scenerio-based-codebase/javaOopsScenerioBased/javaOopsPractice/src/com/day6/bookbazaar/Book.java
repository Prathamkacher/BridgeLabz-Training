package com.day6.bookbazaar;

abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;
    private int stock;   // inventory protected

    // Basic constructor
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Optional offer constructor
    public Book(String title, String author, double price) {
        this(title, author, price, 0);
    }

    public int getStock() {
        return stock;
    }

    // Inventory update only via method
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Insufficient stock for " + title);
        }
    }

    public double getPrice() {
        return price;
    }

    public abstract double applyDiscount(double price);
}
