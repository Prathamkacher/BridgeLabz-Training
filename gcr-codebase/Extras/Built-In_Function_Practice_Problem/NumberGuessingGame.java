//Create a class NumberGuessingGame to guess the number 
import java.util.*;

public class NumberGuessingGame{

    //Method to generate a random guess between min and max
    public static int generateGuess(int min, int max){
        Random random=new Random();
        return random.nextInt(max-min + 1)+min;
    }

    //Method to get user feedback
    public static String getUserFeedback(Scanner input){
        System.out.print("Is the guess high, low, or correct? ");
        return input.nextLine().toLowerCase();
    }

    //Method to update range based on feedback
    public static int[] updateRange(String feedback, int guess, int min, int max){
        if(feedback.equals("high")){
            max=guess-1;
        }else if(feedback.equals("low")){
            min=guess+1;
        }
        return new int[]{min, max};
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        int min=1;
        int max=100;
        boolean isCorrect=false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while(!isCorrect){

            int guess=generateGuess(min, max);
            System.out.println("My guess is: "+guess);

            String feedback=getUserFeedback(input);

            if(feedback.equals("correct")){
                System.out.println("Yay! I guessed your number correctly...!!!");
                isCorrect=true;
            }else if(feedback.equals("high") || feedback.equals("low")){
                int[] range=updateRange(feedback, guess, min, max);
                min=range[0];
                max=range[1];
            }else{
                System.out.println("Invalid input! Please type high, low, or correct.");
            }
        }

    }
}
