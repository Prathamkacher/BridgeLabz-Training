//Create a class SpringSeason to check the season is spring or not.
import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {

        //Create variables to read input
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
		int day = input.nextInt();

        //Check if the season is spring or not and print the output.
        if (month == 3 || month == 4 && day < 21 ) {
            System.out.println("Its a Spring Season");
        }
        else {
            System.out.println("Not a Spring Season");
        }
    }
}