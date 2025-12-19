//Create a class YoungestAndTallest to find the youngest and tallest friend among 3.
import java.util.*;
public class YoungestAndTallest {
    public static void main(String[] args) {

        //Create variable to read age and height of 3 friends.
        Scanner input = new Scanner(System.in);
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();
        double heightAmar = input.nextDouble();
        double heightAkbar = input.nextDouble();
        double heightAnthony = input.nextDouble();

        //Find youngest friend
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        //Find tallest friend
        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        // Print statement for output
        System.out.println(
            "The youngest friend is " + youngest +
            " and the tallest friend is " + tallest
        );
    }
}