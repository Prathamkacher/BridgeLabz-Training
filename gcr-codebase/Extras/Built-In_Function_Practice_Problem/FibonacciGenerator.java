//Create a class FibonacciGenerator to generate Fibonacci Series
import java.util.*;

public class FibonacciGenerator{

    //Method to generate and print Fibonacci sequence
    public static void generateFibonacci(int terms){

        int first=0;
        int second=1;

        System.out.print("Fibonacci Sequence: ");

        for(int i=1;i<=terms;i++){
            System.out.print(first+" ");

            int next=first+second;
            first=second;
            second=next;
        }
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms=input.nextInt();

        if(terms<=0){
            System.out.println("Please enter a positive number.");
        }else{
            generateFibonacci(terms);
        }

    }
}
