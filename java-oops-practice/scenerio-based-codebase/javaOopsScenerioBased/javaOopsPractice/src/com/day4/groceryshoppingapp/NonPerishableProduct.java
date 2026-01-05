package com.day4.groceryshoppingapp;

class NonPerishableProduct extends Product {

    NonPerishableProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double getDiscount() {
        return getTotalPrice() * 0.05;
    }
}
