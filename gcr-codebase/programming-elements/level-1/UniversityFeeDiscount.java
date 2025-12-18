//Create a class UniversityFeeDiscount to calculate the discounted amount student will pay.
import java.util.*;
public class UniversityFeeDiscount {
    public static void main(String[] args) {

        //Create variable to store and calculate discount and final fee after discount.
        int fee = 125000;
        int discountPercent = 10;
        int discount = fee/discountPercent;
		int discountedFee = fee - discount;
		
        // Print statement for output
        System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR " + discountedFee);
	}
}