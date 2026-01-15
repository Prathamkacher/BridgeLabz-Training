package com.day2.bookshelf;

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
