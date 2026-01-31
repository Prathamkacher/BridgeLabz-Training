package com.stream.eventattendee;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Attendee> attendees = Arrays.asList(
                new Attendee("Pratham Kacher", "VIP"),
                new Attendee("Riya Mehta", "Premium"),
                new Attendee("Kunal Verma", "Standard"),
                new Attendee("Krishna Gangrade", "VIP")
        );

        attendees.stream()
                 .forEach(attendee ->
                         System.out.println("Welcome, "
                                 + attendee.getName()
                                 + " | Ticket Type: "
                                 + attendee.getTicketType())
                 );
    }
}
