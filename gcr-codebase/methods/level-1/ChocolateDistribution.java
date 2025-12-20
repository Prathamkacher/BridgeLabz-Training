//Create a class ChocolateDistribution to divide chocolates among children.
import java.util.*;
public class ChocolateDistribution {

    //Method to find remainder and quotient.
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        //Return remainder and quotient
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Get input values
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();

        //validate input
        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than 0");
            return;
        }

        //Call method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        //Display result
        System.out.println(
            "Each child will get " + result[1] + " chocolates and the remaining chocolates are " + result[0]
        );
    }
}
