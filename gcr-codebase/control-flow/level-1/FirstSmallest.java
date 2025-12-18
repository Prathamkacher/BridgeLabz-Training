//Create a class FirstSmallest to check if the first number is the smallest among three numbers.
import java.util.*;
public class FirstSmallest {
    public static void main(String[] args) {

        //Create variables to read three numbers
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        //Check if first number is the smallest
        boolean isFirstSmallest = false;
		if (n1 < n2 && n1 < n3) {
            isFirstSmallest = true;
        }

        // Print statement for output
        System.out.println(
            "Is the first number the smallest? " + isFirstSmallest
        );
    }
}
