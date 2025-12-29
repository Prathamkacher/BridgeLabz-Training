/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;
public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 0;
        String operator;
        double amount;
        char choice = 'Y';

        System.out.println("====================================");
        System.out.println("      PHONE RECHARGE SIMULATOR      ");
        System.out.println("====================================");

        do {
            System.out.print("\nEnter Mobile Operator (Jio/Airtel/Vi): ");
            operator = input.nextLine().toLowerCase();

            System.out.print("Enter Recharge Amount (Rs): ");
            amount = input.nextDouble();
            input.nextLine(); // next line

            if (amount <= 0) {
                System.out.println("Invalid recharge amount!");
                continue;
            }

            balance += amount;

            System.out.println("\n--------- RECHARGE DETAILS ---------");
            System.out.println("Operator : " + operator.toUpperCase());
            System.out.println("Amount   : Rs" + amount);

            // Offer logic using switch-case
            switch (operator) {

                case "jio":
                    System.out.println("🎁 Offer: Extra 10% off on recharge above 349");
                    break;

                case "airtel":
                    if (amount >= 349) {
                        System.out.println("🎁 Offer: ₹20 Cashback Applied");
                        balance += 20;
                    } else {
                        System.out.println("🎁 Offer: No Cashback");
                    }
                    break;

                case "vi":
                    if (amount >= 149) {
                        System.out.println("🎁 Offer: Unlimited Calls for 1 Day");
                    } else {
                        System.out.println("🎁 Offer: No Extra Benefits");
                    }
                    break;

                default:
                    System.out.println("⚠️ Unknown Operator! No Offer Applied");
            }

            System.out.println("------------------------------------");
            System.out.println("💰 Current Balance: ₹" + balance);
            System.out.println("------------------------------------");

            System.out.print("\nDo you want to recharge again? (Y/N): ");
            choice = input.next().toUpperCase().charAt(0);
            input.nextLine(); //next line

        } while (choice == 'Y');

        System.out.println("\n====================================");
        System.out.println("✅ Recharge Session Completed");
        System.out.println("💰 Final Balance: ₹" + balance);
        System.out.println("====================================");

        input.close();
    }
}
