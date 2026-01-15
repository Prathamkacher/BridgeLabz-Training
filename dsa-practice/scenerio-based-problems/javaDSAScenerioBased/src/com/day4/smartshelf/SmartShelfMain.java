/*
 * 
2. SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title
 */

package com.day4.smartshelf;

public class SmartShelfMain {

    public static void main(String[] args) {

        SmartShelf shelf = new SmartShelf();

        shelf.addBook("Java Basics");
        shelf.addBook("Python Guide");
        shelf.addBook("Data Structures");
        shelf.addBook("Algorithms");
        shelf.addBook("Android Development");

        shelf.displayShelf();
    }
}
