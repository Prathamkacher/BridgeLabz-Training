//Create a class SumUntilZero to find the sum of numbers until user enters 0.
import java.util.*;
public class SumUntilZero {
    public static void main(String[] args) {

        //Create variables to store total sum and user input
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double user = input.nextDouble();

        //Continue sum using loop until user enters 0
        while (user != 0) {
            total = total + user;
            user = input.nextDouble();
        }

        //Print statement for output
        System.out.println("The total sum is " + total);
    }
}