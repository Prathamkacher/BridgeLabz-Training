package com.collections.shoppingcart;

public class ShoppingCartMain {

    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addItem(new Product("Laptop", 80000));
        cart.addItem(new Product("Mouse", 800));
        cart.addItem(new Product("Keyboard", 1500));
        cart.addItem(new Product("Headphones", 2500));

        cart.displayCartOrder();
        System.out.println();
        cart.displaySortedByPrice();
    }
}
