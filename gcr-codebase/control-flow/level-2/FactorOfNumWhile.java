//Create a class FactorOfNumWhile to check if number is positive and print factors of number using while loop.
import java.util.*;
public class FactorOfNumWhile {
    public static void main(String args[]) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
			//initialize the counter.
			int i = 1;
            //while Loop from 1 to the given number
            while (i < number) {
			
                //Check conditions for factors
                if (number % i == 0) {
                    System.out.println(i);
                }
				i++;
            }
        }
    }
}