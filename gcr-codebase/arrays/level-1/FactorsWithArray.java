//Create a class FactorsWithArray to find and store factors of a number using array.
import java.util.*;
public class FactorsWithArray {
    public static void main(String[] args) {

        //take input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }

        //initialize array and variables.
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        //Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    //assign new array to factors
                    factors = temp;
                }

                //store factor and increment index.
                factors[index] = i;
                index++;
            }
        }

        //print factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
