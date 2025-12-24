//Create a class BasicCalculator to calculate addition, subtraction, division, multiplication
import java.util.*;

public class BasicCalculator{

    //Addition
    public static double add(double a, double b){
        return a+b;
    }

    //Subtraction
    public static double subtract(double a, double b){
        return a-b;
    }

    //Multiplication
    public static double multiply(double a, double b){
        return a*b;
    }

    //Division
    public static double divide(double a, double b){
        if(b==0){
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a/b;
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose an operation (1-4): ");
        int choice=input.nextInt();

        System.out.print("Enter first number: ");
        double num1=input.nextDouble();

        System.out.print("Enter second number: ");
        double num2=input.nextDouble();

        double result;

        switch (choice){
            case 1:
                result=add(num1, num2);
                System.out.println("Result: "+result);
                break;

            case 2:
                result=subtract(num1, num2);
                System.out.println("Result: "+result);
                break;

            case 3:
                result=multiply(num1, num2);
                System.out.println("Result: "+result);
                break;

            case 4:
                result=divide(num1, num2);
                System.out.println("Result: "+result);
                break;

            default:
                System.out.println("Invalid choice!");
        }
		
    }
}
