package com.day2.trafficmanager;

import java.util.*;

public class TrafficManager {

    private Node head = null;     // circular linked list
    private Queue<String> queue = new LinkedList<>();

    private int maxQueueSize = 3; // for overflow demo

    // Add vehicle to waiting queue
    public void addToQueue(String vehicle) {
        if (queue.size() >= maxQueueSize) {
            System.out.println("Queue Overflow! " + vehicle + " cannot enter now.\n");
        } else {
            queue.add(vehicle);
            System.out.println(vehicle + " added to waiting queue.");
        }
    }

    // Move vehicle from queue to roundabout
    public void enterRoundabout() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting.\n");
            return;
        }

        String vehicle = queue.poll();
        Node newNode = new Node(vehicle);

        if (head == null) {
            head = newNode;
            head.next = head; // circular
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }

        System.out.println(vehicle + " entered the roundabout.");
    }

    // Remove a vehicle from roundabout
    public void exitRoundabout(String vehicle) {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Node current = head;
        Node prev = null;

        do {
            if (current.vehicle.equals(vehicle)) {

                // only one vehicle
                if (current == head && current.next == head) {
                    head = null;
                }
                // removing head
                else if (current == head) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // middle or last
                else {
                    prev.next = current.next;
                }

                System.out.println("\n" + vehicle + " exited the roundabout.\n");
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println(vehicle + " not found in roundabout.");
    }

    // Print current roundabout state
    public void displayRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.vehicle + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
