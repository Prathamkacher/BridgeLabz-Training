//Create a class MaxHandshake to find the maximum number of handshakes.
import java.util.*;
public class MaxHandshake {

    //Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //input for number of students
        int students = input.nextInt();

        //Check for valid input
        if (numberOfStudents < 0) {
            System.out.println("Please enter a valid number of students");
            return;
        }

        //calculate handshakes using method.
        int handshakes = calculateHandshakes(students);

        //print result
        System.out.println(
            "The maximum number of possible handshakes among " +
            students + " students is " + handshakes
        );
    }
}
