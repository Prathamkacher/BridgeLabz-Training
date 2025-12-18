//Create a class SalaryBonus to print odd and even numbers up to a given number.
import java.util.*;
public class SalaryBonus {
    public static void main(String[] args) {

        //Create variable to read input
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
		int year = input.nextInt();
		
		//check if year is more than 4.
		if (year < 5){
			System .out.println("Employe is not Eligible for Bonus");
		} else {
			//calculate the bonus amount and print the bonus amount.
			int bonus = (salary*5)/100;
			System .out.println("The amount of bonus is: " + bonus);
		}
	}
}