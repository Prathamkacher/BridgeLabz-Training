import java.util.Scanner;
public class BMICalculator {

    	// Method to calculate BMI and Status for one person
    	public static String[] calculateBMIStatus(double weightKg, double heightCm) {

        	double heightMeter = heightCm / 100.0;
        	double bmi = weightKg / (heightMeter * heightMeter);

        	// Round BMI to 2 decimal places
        	bmi = Math.round(bmi * 100.0) / 100.0;

        	String status;

        	if (bmi < 18.5)
            		status = "Underweight";
        	else if (bmi >= 18.5 && bmi <= 24.9)
            		status = "Normal";
        	else if (bmi >= 25.0 && bmi <= 39.9)
            		status = "Overweight";
        	else
            		status = "Obese";

        	return new String[] {
                	String.valueOf(weightKg),
                	String.valueOf(heightCm),
                	String.valueOf(bmi),
                	status
        	};
    	}

    	// Method to generate BMI report for all persons
    	public static String[][] generateBMIReport(double[][] data) {

        	String[][] report = new String[data.length][4];

        	for (int i = 0; i < data.length; i++) {
            		String[] result = calculateBMIStatus(data[i][0], data[i][1]);
            		report[i] = result;
        	}

        	return report;
    	}

    	// Method to display BMI report in tabular format
    	public static void displayReport(String[][] report) {

        	System.out.println("\nBMI REPORT");
        	System.out.println("------------------------------------------------------------");
        	System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        	System.out.println("------------------------------------------------------------");

        	for (int i = 0; i < report.length; i++) {
            		System.out.println((i + 1) + "\t" +
                    	report[i][0] + "\t\t" +
                    	report[i][1] + "\t\t" +
                    	report[i][2] + "\t\t" +
                    	report[i][3]);
        	}
    	}

    	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);

        	int persons = 10;
        	double[][] inputData = new double[persons][2]; // weight, height

        	// Taking input
        	for (int i = 0; i < persons; i++) {
            		System.out.print("\nEnter weight (kg) of person " + (i + 1) + ": ");
            		inputData[i][0] = sc.nextDouble();
	
            		System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            		inputData[i][1] = sc.nextDouble();
        	}

        	// Generate BMI report
        	String[][] bmiReport = generateBMIReport(inputData);

        	// Display result
        	displayReport(bmiReport);

        	sc.close();
    	}
}
