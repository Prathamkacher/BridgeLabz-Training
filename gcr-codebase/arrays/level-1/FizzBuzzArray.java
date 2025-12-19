//create a class FizzBuzzArray to store FizzBuzz results in an array and display them
import java.util.*;
public class FizzBuzzArray {
    public static void main(String[] args) {

        //user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {

			//Create String array to store results from 1 to number
			String[] results = new String[number + 1];

			//save FizzBuzz results in array
			for (int i = 1; i <= number; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					results[i] = "FizzBuzz";
				} else if (i % 3 == 0) {
					results[i] = "Fizz";
				} else if (i % 5 == 0) {
					results[i] = "Buzz";
				} else {
					results[i] = String.valueOf(i);
				}
			}

			//Print array results with position
			for (int i = 1; i <= number; i++) {
				System.out.println("Position " + i + " = " + results[i]);
			}
		}
    }
}
