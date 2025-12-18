//Create a class Handshakes to find maximum number of handshakes among students.
import java.util.*;
public class Handshakes {
    public static void main(String[] args) {

        //Create variable to read number of students and calculate handshakes
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print statement for output
        System.out.println(
            "The maximum number of possible handshakes among " +
            numberOfStudents + " students is " + handshakes
        );
    }
}
