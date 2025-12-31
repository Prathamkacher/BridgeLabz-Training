/*
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;

public class DistanceTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int stopNumber = 1;
        double distancePerStop = 5.0; // km
        double totalDistance = 0.0;
        char choice = 'N';

        System.out.println("     BUS ROUTE DISTANCE TRACKER     ");

        while (true) {

            totalDistance += distancePerStop;

            System.out.println("\nReached Stop " + stopNumber);
            System.out.println("Distance added : " + distancePerStop + " km");
            System.out.println("Total Distance : " + totalDistance + " km");

            System.out.print("Do you want to get off here? (Y/N): ");
            choice = input.next().toUpperCase().charAt(0);

            if (choice == 'Y') {
                System.out.println("\nPassenger got off at Stop " + stopNumber);
                break;
            }

            stopNumber++;
        }

        System.out.println("------------------------------------");
        System.out.println("         Journey Summary");
        System.out.println("       Stops Travelled :  " + stopNumber);
        System.out.println("     Total Distance  : " + totalDistance + " km");
        System.out.println("====================================");

        input.close();
    }
}
