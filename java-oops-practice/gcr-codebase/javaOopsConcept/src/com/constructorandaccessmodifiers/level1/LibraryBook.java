package com.constructorandaccessmodifiers.level1;

public class LibraryBook {
	
	// Attributes
    String title;
    String author;
    double price;
    boolean availability;

    // Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; // book is available by default
    }

    // Method to borrow the book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Method to return the book
    public void returnBook() {
        availability = true;
        System.out.println("You have returned \"" + title + "\".");
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : ₹" + price);
        System.out.println("Availability : " + (availability ? "Available" : "Borrowed"));
    }

    // Main method for testing
	public static void main(String[] args) {
		LibraryBook book = new LibraryBook("Effective Java", "Joshua Bloch", 650.0);
		
		System.out.println("First time borrow:");
        book.displayBookInfo();
        System.out.println();

        book.borrowBook();   // borrow the book
        System.out.println();
        System.out.println("Second time borrowing the same book:");
        System.out.println();
        book.borrowBook();   // try borrowing again
        System.out.println();

        book.returnBook();   // return the book
        book.displayBookInfo();
	}

}