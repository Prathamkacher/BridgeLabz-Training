//Create a class FizzBuzz to check if number is positive and print according to it.
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {

            //for Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {

                //Check conditions for FizzBuzz
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}