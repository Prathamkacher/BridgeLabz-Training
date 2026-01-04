package com.linkedlist.doublylinkedlist.moviemanagement;

public class MovieList {

    private MovieNode head;
    private MovieNode tail;

    // Add at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Add at end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode node = new MovieNode(title, director, year, rating);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    // Remove by Movie Title
    public void removeByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head)
                    head = temp.next;
                if (temp == tail)
                    tail = temp.prev;
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;

                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // Search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director))
                displayMovie(temp);
            temp = temp.next;
        }
    }

    // Search by Rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating)
                displayMovie(temp);
            temp = temp.next;
        }
    }

    // Update Rating by Title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // Display forward
    public void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    private void displayMovie(MovieNode m) {
        System.out.println(
            "Title: " + m.title +
            ", Director: " + m.director +
            ", Year: " + m.year +
            ", Rating: " + m.rating
        );
    }
}
