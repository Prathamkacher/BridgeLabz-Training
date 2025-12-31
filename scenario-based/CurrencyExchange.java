/*
18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.*;

public class CurrencyExchange {
	public static void main(String[] args){
		
		System.out.println("\nWelcome to Currency Exchange Kiosk\n");
		//input from user
		Scanner input = new Scanner(System.in);
		char choice = 'Y';
		//using do while loop for continueous currecy exchange.
		do{
			System.out.print("Enter amount in INR (Rs):");
			double inrAmount = input.nextDouble();
			input.nextLine();
			
			if (inrAmount <= 0){
				System.out.println("Invalid amount! Please enter positive amount.");
				continue;
			}
			
			System.out.print("Convert to (USD / EUR / GBP / JPY): ");
			String currency = input.nextLine().toUpperCase();
			
			double convertedAmount = 0;
			boolean validCurrency = true;
			
			// Conversion using switch-case
            switch (currency) {
                case "USD":
                    convertedAmount = inrAmount / 83;
                    break;

                case "EUR":
                    convertedAmount = inrAmount / 90;
                    break;

                case "GBP":
                    convertedAmount = inrAmount / 105;
                    break;

                case "JPY":
                    convertedAmount = inrAmount / 0.55;
                    break;

                default:
                    System.out.println("Invalid currency selected!");
                    validCurrency = false;
            }
			if (validCurrency) {
                System.out.println("\n--------- CONVERSION DETAILS -----------");
                System.out.println("INR Amount      : Rs" + inrAmount);
                System.out.println("Target Currency : " + currency);
                System.out.println("Converted Value : " + convertedAmount + " " + currency);
                System.out.println("----------------------------------------");
            }

            System.out.print("\nDo you want another conversion? (Y/N): ");
            choice = input.next().toUpperCase().charAt(0);
            input.nextLine(); // clear buffer

        } while (choice == 'Y');

        System.out.println("\n=================================");
        System.out.println("Thank You for Using Exchange Kiosk");
        System.out.println("==================================");

        input.close();
	}
}