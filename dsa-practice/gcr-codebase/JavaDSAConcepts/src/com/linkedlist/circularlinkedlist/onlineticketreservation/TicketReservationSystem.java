package com.linkedlist.circularlinkedlist.onlineticketreservation;

public class TicketReservationSystem {

    private TicketNode head;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {
        TicketNode node = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    // Remove ticket by Ticket ID
    public void removeTicket(int id) {
        if (head == null) return;

        TicketNode temp = head, prev = null;

        do {
            if (temp.ticketId == id) {
                if (temp == head) {
                    TicketNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Customer Name
    public void searchByCustomer(String name) {
        if (head == null) return;

        TicketNode temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(name))
                displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Movie Name
    public void searchByMovie(String movie) {
        if (head == null) return;

        TicketNode temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movie))
                displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Count total tickets
    public void countTickets() {
        if (head == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Tickets: " + count);
    }

    private void displayTicket(TicketNode t) {
        System.out.println(
            "ID: " + t.ticketId +
            ", Customer: " + t.customerName +
            ", Movie: " + t.movieName +
            ", Seat: " + t.seatNumber +
            ", Time: " + t.bookingTime
        );
    }
}
