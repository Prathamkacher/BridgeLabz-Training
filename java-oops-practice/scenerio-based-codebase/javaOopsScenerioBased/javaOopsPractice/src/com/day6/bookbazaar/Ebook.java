package com.day6.bookbazaar;

class EBook extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE); // unlimited stock
    }

    @Override
    public double applyDiscount(double price) {
        // Flat 20% discount on ebooks
        return price * 0.80;
    }
}
