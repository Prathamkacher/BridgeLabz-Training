//Create a class PrimeNumberChecker to find the input number is prime or not
import java.util.*;

public class PrimeNumberChecker{

    //Method to check whether a number is prime
    public static boolean isPrime(int number){

        //Prime numbers must be greater than 1
        if(number<=1){
            return false;
        }

        //Check divisibility
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number=input.nextInt();

        boolean result=isPrime(number);

        if(result){
            System.out.println(number+" is a Prime Number");
        }else{
            System.out.println(number+" is Not a Prime Number");
        }
		
    }
}
