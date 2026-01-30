package com.lambdaexpressions.customsorting;

class Product {
    String name;
    double price;
    double rating;
    double discount; 

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | ₹" + price + " | ⭐" + rating + " | " + discount + "% off";
    }
}
