//Create a class FeeDiscount to calculate the discounted amount student will pay.
import java.util.*;
public class FeeDiscount {
    public static void main(String[] args) {

        //Create variable to store and calculate discount and final fee after discount.
        Scanner input = new Scanner(System.in);
		int fee = input.nextInt();
        int discountPercent = 10;
        int discount = fee/discountPercent;
		int discountedFee = fee - discount;
		
        // Print statement for output
        System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR " + discountedFee);
	}
}