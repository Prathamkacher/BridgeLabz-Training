//create IllegalArgumentExceptionTest class to to demonstrate StringIndexOutOfBoundsException.
import java.util.*;
public class IllegalArgumentExceptionTest {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {

        // Start index greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {

        try {
            System.out.println(text.substring(5, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Reason: Start index is greater than end index.");
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Enter a string: ");
        String text = input.next();

        //generate the exception
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException()");
        }

        //Handle the exception.
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text);
    }
}
