/*
 * 1. BookShelf – Library Organizer (HashMap + Linked List)
Story: In a library system, books are arranged based on genre and author. A HashMap maps genre → list of books (LinkedList). Each list is dynamically updated when books are borrowed or returned.
Requirements:
● Maintain genre-wise catalog.
● Efficient insert, delete using LinkedList.
● Avoid duplication using HashSet (optional).
 */

package com.day1.bookshelf;

public class BookShelfMain {

    public static void main(String[] args) {

        LibraryCatalog library = new LibraryCatalog();

        library.addBook("Fantasy", "Harry Potter");
        library.addBook("Fantasy", "Hobbit");
        library.addBook("Programming", "Clean Code");

        library.addBook("Fantasy", "Harry Potter"); // duplicate test

        library.displayCatalog();

        library.borrowBook("Fantasy", "Hobbit");

        library.displayCatalog();

        library.returnBook("Fantasy", "Hobbit");

        library.displayCatalog();
    }
}