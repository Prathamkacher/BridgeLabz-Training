//Create a class HarshadNumber to check if a number is a Harshad Number.
import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Store original number
        int originalNumber = number;

        //Initialize sum of digits
        int sum = 0;

        //Use while loop to calculate sum of digits
        while (number != 0) {
            //create variable to find, add and remove the last digit
            int digit = number % 10;            
            sum += digit;
            number /= 10;
        }

        //Check Harshad condition and print the output
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }
    }
}
