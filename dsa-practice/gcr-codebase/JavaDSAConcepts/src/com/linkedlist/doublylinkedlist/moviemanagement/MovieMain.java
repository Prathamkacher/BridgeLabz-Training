package com.linkedlist.doublylinkedlist.moviemanagement;

public class MovieMain {

    public static void main(String[] args) {

        MovieList movies = new MovieList();

        movies.addAtBeginning("Inception", "Nolan", 2010, 8.8);
        movies.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        movies.addAtPosition(2, "Avatar", "Cameron", 2009, 7.8);

        System.out.println("Forward Display:");
        movies.displayForward();

        System.out.println("\nReverse Display:");
        movies.displayReverse();

        movies.searchByDirector("Nolan");
        movies.updateRating("Avatar", 8.0);

        movies.removeByTitle("Inception");

        System.out.println("\nAfter Deletion:");
        movies.displayForward();
    }
}
