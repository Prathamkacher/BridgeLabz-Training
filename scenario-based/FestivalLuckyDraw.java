/*
20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char choice = 'Y';

        System.out.println("====================================");
        System.out.println("      FESTIVAL LUCKY DRAW         ");
        System.out.println("====================================");

        while (choice == 'Y') {

            System.out.print("\nEnter your lucky number: ");

            // Check for non-integer input
            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                input.next(); // clear invalid input
                continue;     // ask next visitor
            } 

            int number = input.nextInt();

            // Invalid number check
            if (number <= 0) {
                System.out.println("Invalid number! Enter a positive number.");
                continue;
            }

            // Lucky draw logic
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You WON a gift!");
            } else {
                System.out.println("Sorry! Better luck next time.");
            }

            System.out.print("\nNext visitor? (Y/N): ");
            choice = input.next().toUpperCase().charAt(0);
        }

        System.out.println("\n==================================");
        System.out.println("Thank You for Visiting Diwali Mela");
        System.out.println("==================================");

        input.close();
    }
}