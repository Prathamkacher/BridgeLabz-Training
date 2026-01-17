package com.day6.smartlibrary;

import java.util.*;

public class SmartLibrary {

    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    // Add book and keep list alphabetically sorted
    public void issueBook(String title) {

        Book newBook = new Book(title);
        borrowedBooks.add(newBook);

        int i = borrowedBooks.size() - 1;

        // Insertion sort logic
        while (i > 0 &&
               borrowedBooks.get(i - 1).title
               .compareToIgnoreCase(borrowedBooks.get(i).title) > 0) {

            // swap
            Book temp = borrowedBooks.get(i);
            borrowedBooks.set(i, borrowedBooks.get(i - 1));
            borrowedBooks.set(i - 1, temp);

            i--;
        }

        System.out.println(title + " issued.");
    }

    public void displayBorrowedBooks() {
        System.out.println("\nBorrowed Books (Sorted):");
        for (Book b : borrowedBooks) {
            System.out.println(b);
        }
    }
}
