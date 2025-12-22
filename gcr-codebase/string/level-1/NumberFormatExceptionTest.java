import java.util.*;
public class NumberFormatExceptionTest {

    //Method to generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    //Method to handle NumberFormatException
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Reason: Input text does not contain a valid integer.");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Enter a value: ");
        String text = input.next();

        //Generate the exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException()");
        }

        //Handle the exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);
    }
}
