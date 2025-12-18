//Create a class OddEvenNumbers to print odd and even numbers up to a given number.
import java.util.*;
public class OddEvenNumbers {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Check if number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            //Iterate from 1 to the number using for loop and print the output
            for (int i = 1; i <= number; i++) {
                //Check odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        }
    }
}