//Create a class SumOfNaturalNumFor to find sum using For loop and formula.
import java.util.*;
public class SumOfNaturalNumFor {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
		
		//check if n is Natural number
		if (n <= 0){
			System.out.println("n is not a Natural number");
		} else {
			//compute using for loop
			int counter = 1;
			int sumByLoop = 0;
			
			for (int i=counter; i<=n; i++){
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
