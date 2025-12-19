//Create a class FizzBuzz to check if number is positive and print according to it using while loop.
import java.util.*;
public class FizzBuzzWhile {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
			//initialize counter
			int i = 1;
            //while Loop from 1 to the given number
            while (i <= number) {

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
				i++;
            }
        }
    }
}