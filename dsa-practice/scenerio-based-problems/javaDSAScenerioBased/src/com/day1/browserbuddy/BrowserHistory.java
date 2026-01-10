package com.day1.browserbuddy;

public class BrowserHistory {

    private Node current;

    // Visit new page
    public void visit(String page) {
        Node newNode = new Node(page);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }

        current = newNode;
        System.out.println("Visited: " + page);
    }

    // Go back
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.page);
        } else {
            System.out.println("No previous page.");
        }
    }

    // Go forward
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.page);
        } else {
            System.out.println("No next page.");
        }
    }

    public String getCurrentPage() {
        return current != null ? current.page : null;
    }
}
