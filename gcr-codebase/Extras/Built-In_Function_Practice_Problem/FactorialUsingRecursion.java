//Create a class FactorialUsingRecursion to find the factorial of number using recursion
import java.util.*;

public class FactorialUsingRecursion{

    //Method to take input
    public static int takeInput(Scanner input){
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    //Recursive method to calculate factorial
    public static long factorial(int number){

        //Base condition
        if(number==0 || number==1){
            return 1;
        }

        //Recursive call
        return number*factorial(number-1);
    }

    //Method to display result
    public static void displayResult(int number, long result){
        System.out.println("Factorial of "+number+" is: "+result);
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        int number=takeInput(input);

        if(number<0){
            System.out.println("Factorial is not defined for negative numbers.");
        }else{
            long result=factorial(number);
            displayResult(number, result);
        }
		
    }
}
