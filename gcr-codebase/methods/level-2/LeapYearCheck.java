//create a class LeapYearCheck to check whether a year is a Leap Year or not.
import java.util.*;
public class LeapYearCheck {

    //Method to check Leap Year
    public static boolean isLeapYear(int year) {

        //Condition for Gregorian calendar
        if (year < 1582) {
            return false;
        }

        //Leap Year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        //method to check leap year
        boolean result = isLeapYear(year);

        //Display result
        if (result) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
