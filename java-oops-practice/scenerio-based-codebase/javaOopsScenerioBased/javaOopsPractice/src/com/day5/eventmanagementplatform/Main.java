/*
 * 13. "EventEase – Event Management Platform"
Story: EventEase helps users organize events like birthdays, weddings, and conferences.
You’re responsible for the booking and scheduling module.
Requirements:
● Event class: eventName, location, date, attendees.
● User class to represent the organizer.

Scenario-based Problems
● Constructors to create events with or without catering/decoration packages.
● ISchedulable interface with methods schedule(), reschedule(), cancel().
● Use access modifiers to restrict editing of eventId once assigned.
● Use operators to calculate costs (venue + services – discounts).
● Inheritance: BirthdayEvent, ConferenceEvent extend Event.
● Polymorphism: schedule() behaves differently based on event type.
● Apply encapsulation to protect pricing and sensitive user data.
 */

package com.day5.eventmanagementplatform;

public class Main {

    public static void main(String[] args) {

        User organizer = new User("Pratham", "pratham@gmail.com");

        Event birthday = new BirthdayEvent(
                101,
                "Riya's Birthday",
                "Mumbai",
                "10-02-2026",
                80,
                20000,
                8000,
                2000
        );

        Event conference = new ConferenceEvent(
                201,
                "Tech Conference",
                "Pune",
                "25-03-2026",
                300,
                50000
        );

        birthday.schedule();
        conference.schedule();

        birthday.reschedule("12-02-2026");
        conference.cancel();
    }
}
