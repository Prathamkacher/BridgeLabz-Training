package com.day3.parceltracker;

public class ParcelTrackerMain {

    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        tracker.trackParcel();

        // Add custom checkpoint
        tracker.addCheckpointAfter("Shipped", "Customs Check");
        tracker.trackParcel();

        // Loss detection
        tracker.detectLoss();
    }
}
