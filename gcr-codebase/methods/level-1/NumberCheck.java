//Create a class NumberCheck to check whether a number is positive, negative, or zero.
import java.util.*;
public class NumberCheck {

    //Method to check the number
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Call method
        int result = checkNumber(number);

        //Display result
        if (result == 1) {
            System.out.println("The number is Positive");
        } else if (result == -1) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}
