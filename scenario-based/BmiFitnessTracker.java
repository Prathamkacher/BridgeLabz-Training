//create class BmiFitnessTracker that takes height and weight as input, calculates BMI.

import java.util.Scanner;
public class BmiFitnessTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take height input (in meters)
        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();

        // Take weight input (in kilograms)
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        // Calculate BMI using formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display BMI value
        System.out.println("\nYour BMI is: " + bmi);

        // Determine BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

        scanner.close();
    }
}