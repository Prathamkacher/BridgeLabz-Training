package com.objectmodelling.assistedproblems;

import java.util.ArrayList;

class Library {
    String libraryName;
    ArrayList<Book> books;

    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book book : books) {
            book.displayBook();
        }
    }
}
