//Create a class GreatestFactorWhile to find the greatest factor of a number besides itself using while loop.
import java.util.*;
public class GreatestFactorWhile {
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
			//initialize the counter.
			int i = number - 1;
            //for Loop from number-1 down to 1
            while (i >= 1) {
                //Check if i is a factor
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
				i--;
            }

            //print the greatest factor
            System.out.println(
                "The greatest factor of " + number + " besides itself is " + greatestFactor
            );
        }
    }
}