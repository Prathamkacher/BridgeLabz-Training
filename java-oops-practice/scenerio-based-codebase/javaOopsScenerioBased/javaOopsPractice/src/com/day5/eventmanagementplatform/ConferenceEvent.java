package com.day5.eventmanagementplatform;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String name, String location,
                            String date, int attendees, double venueCost) {

        super(eventId, name, location, date, attendees, venueCost);
    }

    @Override
    public void schedule() {
        System.out.println("📊 Conference Event Scheduled!");
        System.out.println("Total Cost: ₹" + calculateCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}

