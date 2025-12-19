//Create a class FactorOfNum to check if number is positive and print factors of number using for loop.
import java.util.*;
public class FactorOfNum {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {

            //for Loop from 1 to the given number
            for (int i = 1; i < number; i++) {
			
                //Check conditions for factors
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
