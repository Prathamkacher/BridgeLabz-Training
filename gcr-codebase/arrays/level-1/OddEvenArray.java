//create a class OddEvenArray to store odd and even numbers in separate arrays.
import java.util.*;
public class OddEvenArray {
    public static void main(String[] args) {

        //user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //check for natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {

			//Create arrays for odd and even numbers
			int[] even = new int[number / 2 + 1];
			int[] odd = new int[number / 2 + 1];

			//create variables to store index.
			int evenIndex = 0;
			int oddIndex = 0;

			//Store odd and even numbers
			for (int i = 1; i <= number; i++) {
				if (i % 2 == 0) {
					even[evenIndex] = i;
					evenIndex++;
				} else {
					odd[oddIndex] = i;
					oddIndex++;
				}
			}

			//Print odd numbers
			System.out.println("Odd Numbers:");
			for (int i = 0; i < oddIndex; i++) {
				System.out.print(odd[i] + " ");
			}
			System.out.println();

			//Print even numbers
			System.out.println("Even Numbers:");
			for (int i = 0; i < evenIndex; i++) {
				System.out.print(even[i] + " ");
			}
		}
    }
}
