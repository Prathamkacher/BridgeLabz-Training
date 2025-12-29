/*6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/

import java.util.*;
public class ParkingGate {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int capacity = 3;
		int occupied = 0;
		
		String choice;
		
		while(true) {
			if (occupied == capacity){
				System.out.println("The Parking lot is FULL !!!");
			}
			
			System.out.println("\n --- Menu for Parking ---");
			System.out.println("option1: Park");
			System.out.println("option2: Exit");
			System.out.println("option3: Show Occupancy");
			System.out.println("option4: Close - to exit the system");
			System.out.println("Enter your choice :");
			choice = input.nextLine().toLowerCase();
		
			switch(choice){
				case "park" :
					occupied++;
					System.out.println("Car Parked Successfully");
					break;
				
				case "exit":
					if (occupied > 0){
						occupied--;
						System.out.println("Car Exited the Parking");
					}
					else{
						System.out.println("Parking Lot is already empty!!!");
					}
					break;
				
				case "show occupancy":
					System.out.println("Occupied Slot: " + occupied + "/" + capacity);
					break;
					
				case "close":
					System.out.println("Parking System Closed.");
					input.close();
					return;
				
				default:
					System.out.println("Invalid option. Try again.");
			}
		}
	}
}