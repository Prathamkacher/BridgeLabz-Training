//Create a class BmiCalculation2DArray to calculate BMI and weight status of multiple persons using array.
import java.util.*;
public class BmiCalculation2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //take input for number of persons
        int n = input.nextInt();
		
		//2D array to store .
        double[][] personData = new double[n][3]; 
		String[] weightStatus = new String[n];
		
		//take input for weight and height.
		for (int i=0; i<n; i++){
			System.out.println("Please enter a weight value");
			double weight;
			while (true){
				
				weight = input.nextDouble();
				if (weight > 0){
					break;
				}
				System.out.println("Please enter a positive weight value");
			}
			
			double height;
			while (true){
				System.out.println("Please enter a height value");
				height = input.nextDouble();
				if (height > 0){
					break;
				}
				System.out.println("Please enter a positive height value");
			}
			
			//Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;
		}

        //Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            double bmi = personData[i][0];
			personData[i][2] = bmi;

            //calculate weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        //Print height, weight, BMI, and status of each person
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Person " + (i + 1) +" | weight: " + personData[i][0] + " | height: " +
				personData[i][1] + " | BMI: " + personData[i][2] + " | Status: " + weightStatus[i]
            );
        }
    }
}