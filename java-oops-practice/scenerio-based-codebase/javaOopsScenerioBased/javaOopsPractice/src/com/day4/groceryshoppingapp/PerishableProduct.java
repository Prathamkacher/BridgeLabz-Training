package com.day4.groceryshoppingapp;

class PerishableProduct extends Product {

    PerishableProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double getDiscount() {
        return getTotalPrice() * 0.10;
    }
}
