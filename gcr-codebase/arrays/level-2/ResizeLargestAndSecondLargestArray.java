//Create a class ResizeLargestAndSecondLargestArray to find largest and second largest number using array.
import java.util.*;
public class ResizeLargestAndSecondLargestArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Handle negative numbers
        number = Math.abs(number);

        //Initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        //Store digits
        while (number != 0) {

            //If array is full, increase size by 10
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                //Copy old digits to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            //Store digit
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        //initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        //Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //Print result
        System.out.println("Largest digit is " + largest);
        System.out.println("Second largest digit is " + secondLargest);
    }
}
