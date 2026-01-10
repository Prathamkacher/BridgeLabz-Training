package com.day1.bookshelf;

import java.util.*;

class LibraryCatalog {

    private HashMap<String, LinkedList<String>> catalog = new HashMap<>();

    // Add book
    public void addBook(String genre, String bookName) {

        // Create list if genre not present
        if (!catalog.containsKey(genre)) {
            catalog.put(genre, new LinkedList<>());
        }

        LinkedList<String> books = catalog.get(genre);

        // Avoid duplication
        if (!books.contains(bookName)) {
            books.add(bookName);
            System.out.println(bookName + " added to " + genre);
        } else {
            System.out.println("Duplicate not allowed: " + bookName + "(Already Exits)");
        }
    }

    // Borrow book (remove)
    public void borrowBook(String genre, String bookName) {
        if (catalog.containsKey(genre) && catalog.get(genre).remove(bookName)) {
            System.out.println(bookName + " borrowed from " + genre);
        } else {
            System.out.println("Book not available.");
        }
    }

    // Return book (add again)
    public void returnBook(String genre, String bookName) {
        addBook(genre, bookName);
    }

    // Display catalog
    public void displayCatalog() {
        System.out.println("\nLibrary Catalog:");
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " → " + catalog.get(genre));
        }
    }
}
