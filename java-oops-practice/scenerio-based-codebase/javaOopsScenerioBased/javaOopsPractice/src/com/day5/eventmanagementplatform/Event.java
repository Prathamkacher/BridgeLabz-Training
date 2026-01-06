package com.day5.eventmanagementplatform;

abstract class Event implements ISchedulable {

    private final int eventId;  // cannot be modified
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private double venueCost;
    private double serviceCost;
    private double discount;

    protected Event(int eventId, String eventName, String location,
                    String date, int attendees, double venueCost) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
    }

    // Constructor with services
    protected Event(int eventId, String eventName, String location,
                    String date, int attendees, double venueCost,
                    double serviceCost, double discount) {

        this(eventId, eventName, location, date, attendees, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    protected double calculateCost() {
        return venueCost + serviceCost - discount; // operators used
    }

    public int getEventId() {
        return eventId;
    }
}
