//Create a class LeapYearLogic to check whether a year is a Leap Year or not using logical condition.
import java.util.*;
public class LeapYearLogic {
    public static void main(String[] args) {

        //Create variable to read year
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        //Check for Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Year should be greater than or equal to 1582");
        } else {

            //Using a single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }
    }
}
