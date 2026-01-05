package com.day4.groceryshoppingapp;

abstract class Product {

    protected String name;
    protected double price;
    protected int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }

    abstract double getDiscount();
}

