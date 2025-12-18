//Create a class LargestNum to check which number is the largest among three numbers.
import java.util.*;
public class LargestNum {
    public static void main(String[] args) {

        //Create variables to read three numbers
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        //Check if first number is largest
        if (n1 > n2 && n1 > n3) {
            System.out.println("Is the first number the largest? true");
        } else {
            System.out.println("Is the first number the largest? false");
        }

        //Check if second number is largest
        if (n2 > n1 && n2 > n3) {
            System.out.println("Is the second number the largest? true");
        } else {
            System.out.println("Is the second number the largest? false");
        }

        //Check if third number is largest
        if (n3 > n1 && n3 > n2) {
            System.out.println("Is the third number the largest? true");
        } else {
            System.out.println("Is the third number the largest? false");
        }
    }
}
