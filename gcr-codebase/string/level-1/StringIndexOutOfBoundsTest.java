//create StringIndexOutOfBoundsTest class to to demonstrate StringIndexOutOfBoundsException.
import java.util.*;
public class StringIndexOutOfBoundsTest {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    //method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            //Accessing index beyond string length
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Reason: Tried to access index outside the string length.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Enter a string: ");
        String text = input.next();

        //generate the exception
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException()");
        }

        //Handle the exception
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(text);
    }
}
