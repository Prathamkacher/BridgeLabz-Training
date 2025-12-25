/*create class CoffeeCounter for The Coffee Counter Chronicles that asks 
coffe-type and quantity and calculate total bill after gst.*/

import java.util.Scanner;
public class CoffeeCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String coffeeType;

        while (true) {
            System.out.print("\nEnter coffee type (espresso/latte/cappuccino) or type 'exit' to stop: ");
            coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                break;
            }

            double price = 0;

            //switch for coffee selection.
            switch (coffeeType) {
                case "espresso":
                    price = 180;
                    break;
                case "latte":
                    price = 200;
                    break;
                case "cappuccino":
                    price = 230;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double total = price * quantity;
            double gst = total * 0.05; // 5% GST
            double finalBill = total + gst;

            System.out.println("\n----- Bill Details -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Total Price : Rs " + total);
            System.out.println("GST (5%)    : Rs " + gst);
			System.out.println("------------------------");
            System.out.println("Final Bill  : Rs " + finalBill);
			System.out.println("------------------------");
        }

        sc.close();
    }
}
