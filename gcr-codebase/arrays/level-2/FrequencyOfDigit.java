//Create a class FrequencyOfDigit to find the frequency of each digit in a number using arrays.
import java.util.*;
public class FrequencyOfDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Find count of digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        //Array to store digits
        int[] digits = new int[count];
        int index = 0;

        //store digits in array.
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
		//Find frequency of each digit
        int[] frequency = new int[10];      
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        //print frequency
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time");
            }
        }
    }
}

