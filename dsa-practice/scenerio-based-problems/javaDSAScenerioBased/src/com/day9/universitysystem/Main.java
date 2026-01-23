package com.day9.universitysystem;

public class Main {

    public static void main(String[] args) {

        StudentBST bst = new StudentBST();

        // Insertion
        bst.insert(50, "Pratham");
        bst.insert(30, "Priya");
        bst.insert(70, "Sonalii");
        bst.insert(20, "Riya");
        bst.insert(40, "Sakshi");

        // Display sorted
        bst.displaySorted();

        // Search
        bst.search(30);
        bst.search(99);

        // Delete
        bst.delete(30);
        bst.displaySorted();
    }
}
