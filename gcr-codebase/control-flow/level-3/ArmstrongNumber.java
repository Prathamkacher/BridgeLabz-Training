//Create a class ArmstrongNumber to check if a number is an Armstrong number or not.
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Initialize sum and original number
        int sum = 0;
        int originalNum = number;

        //Use while loop
        while (originalNum != 0) {
            //create variable to find, add and remove the last digit
            int digit = originalNum % 10;
            sum = sum + (digit * digit * digit);
            originalNum /= 10;
        }

        //Check if number is Armstrong or not
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}

