//Create a class BmiCalculationArray to calculate BMI and weight status of multiple persons using array.
import java.util.*;
public class BmiCalculationArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //take input for number of persons
        int n = input.nextInt();

        //create arrays for weight, height, BMI, and status
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        //Take input for weight and height.
        for (int i = 0; i < n; i++) {
            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();
        }

        //Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            //calculate weight status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        //Print height, weight, BMI, and status of each person
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Person " + (i + 1) +" | Height: " + height[i] + " | Weight: " + weight[i] +
                " | BMI: " + bmi[i] + " | Status: " + status[i]
            );
        }
    }
}
