//Create a class CalculatorSwitch to perform calculator operations using switch-case.
import java.util.*;
public class CalculatorSwitch {
    public static void main(String[] args) {

        //Create variables to read two numbers and operator
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();

        //Perform operation using switch-case
        switch (op) {
            case "+":
                System.out.println(
                    "The result of " + first + " + " + second + " is " + (first + second)
                );
                break;
            case "-":
                System.out.println(
                    "The result of " + first + " - " + second + " is " + (first - second)
                );
                break;
            case "*":
                System.out.println(
                    "The result of " + first + " * " + second + " is " + (first * second)
                );
                break;
            case "/":
                if (second != 0) {
                    System.out.println(
                        "The result of " + first + " / " + second + " is " + (first / second)
                    );
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
