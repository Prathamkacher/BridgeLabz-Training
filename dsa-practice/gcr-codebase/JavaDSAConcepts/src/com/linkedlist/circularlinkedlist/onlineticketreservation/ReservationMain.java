package com.linkedlist.circularlinkedlist.onlineticketreservation;

public class ReservationMain {

    public static void main(String[] args) {

        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(1, "Aryaman", "Inception", "A1", "10:00 AM");
        system.addTicket(2, "Ravi", "Avatar", "B3", "10:05 AM");
        system.addTicket(3, "Aman", "Inception", "A2", "10:10 AM");

        System.out.println("All Tickets:");
        system.displayTickets();

        System.out.println("\nSearch by Movie:");
        system.searchByMovie("Inception");

        system.removeTicket(2);

        System.out.println("\nAfter Removal:");
        system.displayTickets();

        system.countTickets();
    }
}
