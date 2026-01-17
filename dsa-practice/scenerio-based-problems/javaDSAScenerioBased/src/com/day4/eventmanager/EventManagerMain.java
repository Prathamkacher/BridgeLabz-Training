/*
 * 4. EventManager – Ticket Price Optimizer (Quick Sort)
Story: An event booking portal sorts millions of tickets by price before showing the top 50
cheapest or most expensive. Since speed is crucial and data is unsorted, Quick Sort is used for
its average-case performance.
Key Concepts:
● Fast average time
● Recursive partitioning
● Ideal for large, random datasets
 */

package com.day4.eventmanager;

public class EventManagerMain {

    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(1200),
            new Ticket(450),
            new Ticket(999),
            new Ticket(2000),
            new Ticket(350),
            new Ticket(1500)
        };

        System.out.println("Before Sorting:");
        for (Ticket t : tickets) {
            System.out.print(t + "  ");
        }

        EventManager.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\n\nAfter Sorting (by Price):");
        for (Ticket t : tickets) {
            System.out.print(t + "  ");
        }

        // Top 3 cheapest
        System.out.println("\n\nTop 3 Cheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            System.out.println(tickets[i]);
        }

        // Top 3 expensive
        System.out.println("\nTop 3 Most Expensive Tickets:");
        for (int i = tickets.length - 1; i >= tickets.length - 3; i--) {
            System.out.println(tickets[i]);
        }
    }
}
