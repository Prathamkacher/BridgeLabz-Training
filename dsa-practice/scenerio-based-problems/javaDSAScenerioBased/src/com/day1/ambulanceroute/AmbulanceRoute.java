package com.day1.ambulanceroute;

public class AmbulanceRoute {

    private Node head = null;

    // Add new unit
    public void addUnit(String unit, boolean available) {
        Node newNode = new Node(unit, available);

        if (head == null) {
            head = newNode;
            head.next = head; // circular link
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Find nearest available unit (rotation simulation)
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        Node temp = head;
        do {
            System.out.println("Checking: " + temp.unit);

            if (temp.available) {
                System.out.println("Patient sent to: " + temp.unit);
                return;
            }

            temp = temp.next;
        } while (temp != head);

        System.out.println("No unit available currently.");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        Node current = head;
        Node prev = null;

        do {
            if (current.unit.equals(unitName)) {

                // If only one node
                if (current == head && current.next == head) {
                    head = null;
                }
                // If head to be removed
                else if (current == head) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // Middle node
                else {
                    prev.next = current.next;
                }

                System.out.println(unitName + " removed (under maintenance).");
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println(unitName + " not found.");
    }

    // Display all units
    public void displayUnits() {
        if (head == null) return;

        Node temp = head;
        System.out.println("\nHospital Units:");
        do {
            System.out.println(temp.unit + " (Available: " + temp.available + ")");
            temp = temp.next;
        } while (temp != head);
    }
}
