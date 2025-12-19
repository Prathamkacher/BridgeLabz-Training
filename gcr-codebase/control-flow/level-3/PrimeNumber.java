//Create a class PrimeNumber to check if a number is prime or not.
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a Prime Number");
        } else {

            boolean isPrime = true;

            //Check divisibility from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            //Print result
            if (isPrime) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is not a Prime Number");
            }
        }
    }
}