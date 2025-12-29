/*
8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.*;
public class DiscountDashboard {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of items: ");
		int itemCount = input.nextInt();
		input.nextLine();
		
		String[] itemName = new String[itemCount];
		double[] itemPrice =new double[itemCount];
		
		double totalBill = 0.0;
		
		for (int i=0; i<itemCount; i++){
			System.out.println("Enter name of item " + (i+1) + ": ");
			itemName[i] = input.nextLine();
			
			System.out.println("Enter price of " + itemName[i] + ": ");
			itemPrice[i] = input.nextDouble();
			System.out.println("====================================");
			input.nextLine();
			
			totalBill += itemPrice[i];
		}
		
		double discount;
		
		if (totalBill >= 3000){
			discount = totalBill * 0.20;
		}
		else if (totalBill >= 2000){
			discount = totalBill * 0.15;
		}
		else if (totalBill >= 1000){
			discount = totalBill * 0.10;
		}
		else if (totalBill >= 500){
			discount = totalBill * 0.05;
		}
		else {
			discount = 0.0;
		}
		
		double finalBill = totalBill - discount;
		
		System.out.println("\n================== SHOP BILL ==================");
        System.out.printf("%-5s %-20s %-10s%n", "No", "Item Name", "Price");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < itemCount; i++) {
            System.out.printf("%-5d %-20s Rs%-10.2f%n",
                    (i + 1), itemName[i], itemPrice[i]);
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("%-25s Rs%.2f%n", "Total Amount:", totalBill);
        System.out.printf("%-25s Rs%.2f%n", "Discount:", discount);
        System.out.printf("%-25s Rs%.2f%n", "Amount to Pay:", finalBill);
        System.out.println("===============================================");

        input.close();
	}
}