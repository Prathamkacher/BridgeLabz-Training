/*7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/

import java.util.*;
public class NumberGuessingGame {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int secretNumber = rand.nextInt(100) + 1;
		int guess;
		int attempts = 0;
		int maxAttempts = 5;
		boolean isGuessed = false;
		
		System.out.println("🎲 Guess the Secret Number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts!");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

			if (guess < 1 || guess > 100){
				System.out.println("Invalid Number!, Please enter between 1 and 100 only.");
				continue;
			}
			attempts++;
			
            if (guess == secretNumber) {
                System.out.println("🎉 Congrats! You guessed the number in "
                        + attempts + " attempts.");
                break;
            }

            if (attempts == maxAttempts) {
                break;
            }
			
            if (guess > secretNumber) {
                System.out.println("📉 Hint: Too High");
            } else {
                System.out.println("📈 Hint: Too Low");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));

        } while (attempts < maxAttempts);

        if (!isGuessed) {
            System.out.println("❌ Game Over!");
            System.out.println("The correct number was: " + secretNumber);
        }

        input.close();
    }
}