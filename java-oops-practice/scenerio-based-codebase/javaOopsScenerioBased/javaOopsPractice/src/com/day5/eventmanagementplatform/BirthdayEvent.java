package com.day5.eventmanagementplatform;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String name, String location,
                         String date, int attendees, double venueCost,
                         double serviceCost, double discount) {

        super(eventId, name, location, date, attendees, venueCost,
              serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("🎉 Birthday Event Scheduled!");
        System.out.println("Total Cost: ₹" + calculateCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled.");
    }
}
