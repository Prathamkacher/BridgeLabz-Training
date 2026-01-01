package com.objectmodelling.assistedproblems;

public class Aggregation{
    public static void main(String[] args) {

        Book b1 = new Book("Atomic Habits", "James Clear");
        Book b2 = new Book("Clean Code", "Robert C. Martin");

        Library centralLibrary = new Library("Central Library");
        Library collegeLibrary = new Library("College Library");

        centralLibrary.addBook(b1);
        centralLibrary.addBook(b2);

        collegeLibrary.addBook(b2); // Same book in another library

        centralLibrary.showBooks();
        System.out.println();
        collegeLibrary.showBooks();
    }
}
