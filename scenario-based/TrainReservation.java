/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break)
*/

import java.util.*;
public class TrainReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int totalSeats = 10;
		int maxSeats = 10;
		int choice;
		
		System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        Railway Ticket Booking        ║");
        System.out.println("╚══════════════════════════════════════╝\n");
		
		while(true){
			if (totalSeats == 0){
				System.out.println("\n All seats are Booked!");
				System.out.println("Booking Closed");
				break;
			} 
		
			System.out.println("------------Menu-------------");
			System.out.println("Press 1 for: Book Ticket");
			System.out.println("Press 2 for: Check Available Seats");
			System.out.println("Press 3 for: Cancellation");
			System.out.println("Press 4 for: Exit");
		
			System.out.println("\nEnter your choice: ");
		
			choice = input.nextInt();
		
			switch (choice) {
			
				case 1:
					System.out.println("\nEnter number of tickets to book:");
					int book = input.nextInt();
				
					if(book <= totalSeats){
						totalSeats -= book;
						System.out.println("Booking Successful!!!");
						System.out.println("Remaining Seats: " + totalSeats+"\n");
					}
					else {
						System.out.println("Not enough seats available!!!");
						System.out.println("Available Seats: " + totalSeats+"\n");
					}
					break;
				
				case 2:
					System.out.println("Available Seats: " + totalSeats+"\n");
					break;
				
				case 3:
					System.out.println("\nEnter number of tickets to Cancel:");
					int cancel = input.nextInt();
				
					if (cancel > 0 && totalSeats + cancel <= maxSeats){
						totalSeats += cancel;
						System.out.println("Cancellation Successful!!!");
						System.out.println("Total Seats: " + totalSeats+"\n");
					}
					else {
						System.out.println("Invalid cancellation Request!!!\n");
					}
					break;
	
				case 4:
					System.out.println("\n Thank you for using Train Reservation System!");
                    System.out.println(" Have a safe journey!\n");
                    return;

                default:
                    System.out.println(" Invalid Choice! Try again.\n");
				
			}
		}
	}
}