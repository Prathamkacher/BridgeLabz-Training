//Create a class FindBmi to count the number of digits in an integer.
import java.util.*;
public class FindBmi {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
		double heightCm = input.nextDouble();
		
		//convert height from cm to meter
		double heightMeter = heightCm / 100;
		
		//calculate BMI using formula.
		double bmi = weight / (heightMeter * heightMeter);
		
		//calculate weight status
		String status;
		
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal weight";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Print statement for output (same style as previous)
        System.out.println(
            "The BMI of the person is " + bmi + " and the weight status is " + status
        );
    }
}