package com.linkedlist.doublylinkedlist.texteditor;

public class TextEditor {

    private TextNode head;
    private TextNode tail;
    private TextNode current;
    private int size;
    private final int MAX_HISTORY = 10;

    // Add new text state (typing or action)
    public void addState(String text) {
        TextNode node = new TextNode(text);

        // If undo was used, remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = countNodes();
        }

        if (head == null) {
            head = tail = current = node;
            size = 1;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            current = node;
            size++;
        }

        // Limit history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo");
        }
    }

    // Display current text state
    public void displayCurrent() {
        if (current != null)
            System.out.println("Current Text: " + current.content);
        else
            System.out.println("No text available");
    }

    // Count nodes (used when clearing redo history)
    private int countNodes() {
        int count = 0;
        TextNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
