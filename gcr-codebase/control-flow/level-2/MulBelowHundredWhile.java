//Create a class MulBelowHundredWhile to print all multiples of a number below 100.
import java.util.*;
public class MulBelowHundredWhile {
    public static void main(String args[]) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Check if number is positive and less than 100
        if (number >= 0 || number <= 100) {
		
			//initalize the counter.
			int i = 100;
            //while loop backward from 100 to 1
            while (i >= 1) {

                //Check if i is a multiple of number
                if (i % number == 0) {
                    System.out.println(i);
                }
				i--;
            }
        } else {
			System.out.println("Please enter a positive integer less than 100");
        }
    }
}