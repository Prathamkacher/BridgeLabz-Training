//Create a class LargestAndSecondLargestArray to find largest and second largest number.
import java.util.*;
public class LargestAndSecondLargestArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		int number = input.nextInt();

        //array to store digits.
        int maxDigit = 10;
        int[] digit = new int[maxDigit];
		int index = 0;
		
		//store digits in the array
		while (number != 0){
			if (index == maxDigit){
				break;
			}
			
			digit[index] = number % 10;
			number /= 10;
			index++;
		}

		//initialize largest and second largest.
		int largest = 0;
		int secondLargest = 0;
		
		//find largest and second largest value;
		for (int i = 0; i < index; i++){
			if (digit[i] > largest){
				secondLargest = largest;
				largest = digit[i];
			} else if (digit[i] > secondLargest && digit[i] != largest){
				secondLargest = digit[i];
			}
		}
		
		//print result
        System.out.println("Largest digit is " + largest);
        System.out.println("Second largest digit is " + secondLargest);
	}
}