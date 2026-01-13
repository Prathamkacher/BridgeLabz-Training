package com.day2.bookshelf;

import java.util.*;

public class LibraryCatalog {

    private HashMap<String, LinkedList<String>> catalog = new HashMap<>();

    // Add book
    public void addBook(String genre, String book) {

        // Create list if genre not present
        catalog.putIfAbsent(genre, new LinkedList<>());

        LinkedList<String> books = catalog.get(genre);

        // Avoid duplicates
        if (!books.contains(book)) {
            books.add(book);
            System.out.println(book + " added to " + genre);
        } else {
            System.out.println("Duplicate not allowed: " + book);
        }
    }

    // Borrow book
    public void borrowBook(String genre, String book) {
        if (catalog.containsKey(genre) && catalog.get(genre).remove(book)) {
            System.out.println(book + " borrowed from " + genre);
        } else {
            System.out.println("Book not available.");
        }
    }

    // Return book
    public void returnBook(String genre, String book) {
        addBook(genre, book);
    }

    // Display catalog
    public void displayCatalog() {
        System.out.println("\nLibrary Catalog:");
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " → " + catalog.get(genre));
        }
    }
}
