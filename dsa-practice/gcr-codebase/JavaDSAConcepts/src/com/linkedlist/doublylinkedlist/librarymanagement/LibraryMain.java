package com.linkedlist.doublylinkedlist.librarymanagement;

public class LibraryMain {

    public static void main(String[] args) {

        LibraryList library = new LibraryList();

        library.addAtBeginning(1, "Java Basics", "James", "Programming", true);
        library.addAtEnd(2, "Data Structures", "Mark", "CS", true);
        library.addAtPosition(2, 3, "DBMS", "Navathe", "Database", false);

        System.out.println("Forward Display:");
        library.displayForward();

        System.out.println("\nReverse Display:");
        library.displayReverse();

        library.searchByAuthor("James");
        library.updateAvailability(3, true);

        library.removeById(2);

        library.countBooks();
    }
}
