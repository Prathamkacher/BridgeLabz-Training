package com.day4.smartshelf;

public class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
