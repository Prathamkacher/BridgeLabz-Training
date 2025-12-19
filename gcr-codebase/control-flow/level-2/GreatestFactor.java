//Create a class GreatestFactor to find the greatest factor of a number besides itself using for loop.
import java.util.*;
public class GreatestFactor {
    public static void main(String args[]) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Initialize greatest factor to 1
        int greatestFactor = 1;

        //Check if number is greater than 1
        if (number < 1) {
            System.out.println("Number should be greater than 0");
        } else {
            //for Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                //Check if i is a factor
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

            //print the greatest factor
            System.out.println(
                "The greatest factor of " + number + " besides itself is " + greatestFactor
            );
        }
    }
}
