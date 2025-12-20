//Create a class SICalculator to calculate Simple Interest using a method.
import java.util.*;
public class SICalculator {

    //Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //take user input.
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        //Calculate simple interest using method
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        //Display result
        System.out.println(
            "The Simple Interest is " + simpleInterest + " for Principal " + principal +
            ", Rate of Interest " + rate + " and Time " + time
        );
    }
}
