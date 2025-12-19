//Create a class LeapYear to check whether a year is a leap year.
import java.util.*;
public class LeapYear {
	public static void main (String args[]){
		//Create variable to read year
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        //Check for Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Year should be greater than or equal to 1582");
        } else {

            //Using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }
	}
}