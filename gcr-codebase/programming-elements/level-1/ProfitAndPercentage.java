//Create a program to calculate the profit and loss
import java.util.*;
public class ProfitAndPercentage {
    public static void main(String[] args) {

        //Create variable to store and calculate profit in number and in percentage
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;
		
        // Single print statement with multiline output
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%"
        );
    }
}
