import java.util.*;
public class ArrayIndexOutOfBoundsExceptionTest {

    //Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    //Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {
            //Accessing index beyond array length
            System.out.println(names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Reason: Tried to access index outside array bounds.");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //user input for array size
        System.out.print("Enter number of names: ");
        int size = input.nextInt();

        String[] names = new String[size];

        //user input for names
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.next();
        }

        //Generate the exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // 2️⃣ Handle the exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);
    }
}
