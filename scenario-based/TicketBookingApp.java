/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.*;
public class TicketBookingApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		char continueBooking = 'y';
		
		System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║       Movie Ticket Booking App       ║");
        System.out.println("╚══════════════════════════════════════╝\n");
		
		do {
            double totalAmount = 0;

            // Movie Genre/type
            System.out.println("\nSelect Movie Genre:");
            System.out.println("1: Action/ 2: Comedy/ 3: Drama/ 4: Horror");
            System.out.print("Enter choice: ");
            int genre = input.nextInt();

            switch (genre) {
                case 1:
                    System.out.println("Genre Selected: Action");
                    break;
                case 2:
                    System.out.println("Genre Selected: Comedy");
                    break;
                case 3:
                    System.out.println("Genre Selected: Drama");
                    break;
                case 4:
                    System.out.println("Genre Selected: Horror");
                    break;
                default:
                    System.out.println("Invalid genre!");
                    continue;
            }

            // Seat Type
            System.out.println("\nSelect Seat Type:");
            System.out.println("Enter 1 for : Silver (Rs200)");
            System.out.println("Enter 2 for : Gold   (Rs280)");
            System.out.print("Enter choice: ");
            int seatType = input.nextInt();

            if (seatType == 1) {
                totalAmount += 200;
            } else if (seatType == 2) {
                totalAmount += 280;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            // Snacks
            System.out.print("\nDo you want snacks? (y/n): ");
            char snacksChoice = input.next().charAt(0);

            if (snacksChoice == 'y' || snacksChoice == 'Y') {
                totalAmount += 120;
            }

            // Bill Summary
            System.out.println("\n═════════  BOOKING SUMMARY  ═════════");
            System.out.println("        Genre      : " +
                    (genre == 1 ? "Action" :
                     genre == 2 ? "Comedy" :
                     genre == 3 ? "Drama"  : "Horror"));
            System.out.println("        Seat Type  : " + (seatType == 1 ? "Silver" : "Gold"));
            System.out.println("        Snacks     : " + (snacksChoice == 'y' || snacksChoice == 'Y' ? "Yes" : "No"));
            System.out.println("-------------------------------------");
            System.out.println("        Total Bill : Rs" + totalAmount);
            System.out.println("═════════════════════════════════════");

            // Continue
            System.out.print("\nBook for next customer? (y/n): ");
            continueBooking = input.next().charAt(0);

        } while (continueBooking == 'y' || continueBooking == 'Y');

        System.out.println("\nThank you for using Movie Ticket Booking App!!!");
        System.out.println("Enjoy your movie!");
    }
}