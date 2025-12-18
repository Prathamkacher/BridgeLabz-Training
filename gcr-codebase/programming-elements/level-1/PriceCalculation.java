//Create a class PriceCalculation to calculate total price of the purchase.
import java.util.*;
public class PriceCalculation {
    public static void main(String[] args) {

        //Create variable to read perimeter and calculate side of square
        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();
		double quantity = input.nextDouble();
        double totalPrice = unitPrice * quantity;

        // Print statement for output
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity + " and unit price is INR " + unitPrice
        );
    }
}