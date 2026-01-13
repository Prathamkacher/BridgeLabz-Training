package com.day3.parceltracker;

public class ParcelTracker {

    private Node head = null;

    // Add stage at end
    public void addStage(String stage) {
        Node newNode = new Node(stage);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        System.out.println(stage + " stage added.");
    }

    // Add custom checkpoint after a stage
    public void addCheckpointAfter(String afterStage, String newStage) {
        Node temp = head;

        while (temp != null) {
            if (temp.stage.equals(afterStage)) {
                Node newNode = new Node(newStage);
                newNode.next = temp.next;
                temp.next = newNode;

                System.out.println(newStage + " added after " + afterStage);
                return;
            }
            temp = temp.next;
        }

        System.out.println(afterStage + " stage not found.");
    }

    // Track parcel forward
    public void trackParcel() {
        if (head == null) {
            System.out.println("No tracking data available.");
            return;
        }

        Node temp = head;
        System.out.print("Tracking: ");
        while (temp != null) {
            System.out.print(temp.stage + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Detect missing/lost parcel
    public void detectLoss() {
        if (head == null) {
            System.out.println("Parcel is lost. No stages found.");
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        if (!temp.stage.equals("Delivered")) {
            System.out.println("⚠ Parcel may be lost after: " + temp.stage);
        } else {
            System.out.println("Parcel successfully delivered.");
        }
    }
}
