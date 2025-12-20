//Create a class EmployeeBonusArray to calculate bonus and salary details for 10 employees.
import java.util.*;
public class EmployeeBonusArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        //arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        //variables for totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        //Input salary and years of service
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter salary for employee " + (i + 1) + ":");
            double sal = input.nextDouble();

            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            double years = input.nextDouble();

            //validation
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        //calculate bonus and new salary.
        for (int i = 0; i < 10; i++) {

            //Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            //Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            //calculate totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        //Print final results
        System.out.println("Total old salary of all employees is " + totalOldSalary);
        System.out.println("Total bonus payout by Zara is " + totalBonus);
        System.out.println("Total new salary of all employees is " + totalNewSalary);
    }
}
