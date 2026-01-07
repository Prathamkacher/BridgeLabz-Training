package com.day6.bookbazaar;

class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double price) {
        // Flat ₹50 off if price > ₹500
        return price > 500 ? price - 50 : price;
    }
}
