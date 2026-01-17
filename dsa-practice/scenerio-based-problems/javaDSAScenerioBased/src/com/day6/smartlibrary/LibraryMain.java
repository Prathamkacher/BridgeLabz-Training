/*
 *  2. SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data
 */

package com.day6.smartlibrary;

public class LibraryMain {

    public static void main(String[] args) {

        SmartLibrary library = new SmartLibrary();

        library.issueBook("Java Basics");
        library.issueBook("Python Guide");
        library.issueBook("Data Structures");
        library.issueBook("Algorithms");
        library.issueBook("Android Development");

        library.displayBorrowedBooks();
    }
}
