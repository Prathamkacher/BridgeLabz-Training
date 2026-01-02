package com.inheritance.singleinheritance.librarymanagement;

public class LibraryMain {
    public static void main(String[] args) {

        Book book = new Author(
            "Clean Code",
            2008,
            "Robert C. Martin",
            "Known for writing about software craftsmanship"
        );

        book.displayInfo();
    }
}
