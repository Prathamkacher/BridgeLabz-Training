//Create a class SumOfNaturalNumbers to find sum using while loop and formula.
import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
		
		//check if n is Natural number
		if (n <= 0){
			System.out.println("n is not a Natural number");
		} else {
			//compute using while loop
			int counter = 1;
			int sumByLoop = 0;
			
			while (counter <= n){
				sumByLoop += counter;
				counter++;
			}
			
			//compute using formula
			int sumByFormula = (n*(n+1))/2;
			
			//print statement for output
			System.out.println(
                "Sum using while loop is " + sumByLoop +
                " and sum using formula is " + sumByFormula +
                ". Both computations are correct? " + (sumByLoop == sumByFormula)
            );
		}
	}
}