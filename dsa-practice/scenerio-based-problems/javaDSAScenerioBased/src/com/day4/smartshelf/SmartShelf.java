package com.day4.smartshelf;

import java.util.*;

public class SmartShelf {

    private ArrayList<Book> books = new ArrayList<>();

    // Add book and keep list sorted
    public void addBook(String title) {
        Book newBook = new Book(title);
        books.add(newBook);

        // Insertion sort (only last element moves)
        int i = books.size() - 1;

        while (i > 0 && books.get(i - 1).title.compareToIgnoreCase(books.get(i).title) > 0) {
            // swap
            Book temp = books.get(i);
            books.set(i, books.get(i - 1));
            books.set(i - 1, temp);

            i--;
        }

        System.out.println(title + " added.");
    }

    public void displayShelf() {
        System.out.println("\nReading List (Sorted):");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
