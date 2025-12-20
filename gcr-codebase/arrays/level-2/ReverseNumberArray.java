//Create a class ReverseNumberArray to reverse a number using arrays.
import java.util.*;
public class ReverseNumberArray {
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

        //array to store digits
        int[] digits = new int[count];
        int index = 0;

        //Store digits in array
        while (number != 0){
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        //array to store reversed digits
        int[] reversed = new int[count];

        //Reverse the digits array
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        //print reversed number
        System.out.print("Reversed number is ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
        }
    }
}
