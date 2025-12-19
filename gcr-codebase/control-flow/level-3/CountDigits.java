//Create a class CountDigits to count the number of digits in an integer.
import java.util.*;
public class CountDigits {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Initialize count
        int count = 0;
		
		//check condition
        if (number == 0) {
            count = 1;
        } else {
            //Loop to count digits
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        //Print the number of digits
        System.out.println("The number of digits is " + count);
    }
}