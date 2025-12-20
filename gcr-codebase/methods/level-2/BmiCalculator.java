//Create a class BmiCalculator to calculate BMI and status of 10 persons
import java.util.*;
public class BmiCalculator {

    //Method to calculate BMI and populate the 3rd column of the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightMeter = heightCm / 100;

            double bmi = weight / (heightMeter * heightMeter);
            data[i][2] = bmi;
        }
    }

    //Method to calculate BMI status.
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[][] personData = new double[10][3];

        //input for weight and height
        for (int i = 0; i < 10; i++) {

            double weight;
            while (true) {
                weight = input.nextDouble();
                if (weight > 0) break;
                System.out.println("Enter valid positive weight");
            }

            double height;
            while (true) {
                height = input.nextDouble();
                if (height > 0) break;
                System.out.println("Enter valid positive height");
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        //calculate BMI
        calculateBMI(personData);
        String[] bmiStatus = getBMIStatus(personData);

        //print result
        for (int i = 0; i < 10; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " | Weight: " + personData[i][0] + " kg" + " | Height: " + personData[i][1] + " cm" +
                " | BMI: " + personData[i][2] + " | Status: " + bmiStatus[i]
            );
        }
    }
}
