/*
17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.*;

public class QuizApp {
	public static void main(String[] args){
		
		System.out.println("\nOnline Quiz Application\n");
		//input from user
		Scanner input = new Scanner(System.in);
		//array to store questions
		String[] questions = {
			"1. When Luffy was younger, he had an idol. What was his idol's name?",
			"2. Which language is used for Android development?",
            "3. Besides finding the perfect woman, what is Sanji's dream?",
            "4. Which keyword is used to inherit a class in Java?",
            "5. Which company developed Java?"};
		//array to store options
		String[][] options = {
            {"A. Roronoa Zoro", "B. Captain Smoker", "C. Red Hair Shanks", "D. Gold D Rojer"},
            {"A. Python", "B. Java", "C. C++", "D. Swift"},
            {"A. To catch the biggest fish", "B. To become the world's best chef", "C. To open his own restro", "D. To find All Blue"},
            {"A. implement", "B. extends", "C. inherit", "D. super"},
            {"A. Microsoft", "B. Apple", "C. Sun Microsystems", "D. Google"}
        };
		
		int score = 0;
		char answer;
		//loop for questions
		for (int i=0; i<questions.length; i++){
			System.out.println(questions[i]);
			
			for (int j=0; j<4; j++){
				System.out.println(options[i][j]);
			}
			
			System.out.print("Enter your answer (A/B/C/D): ");
            answer = input.next().toUpperCase().charAt(0);
			//switch statements for cheking answer
			switch (i) {
                case 0:
                    if (answer == 'C') score++;
                    break;
                case 1:
                    if (answer == 'B') score++;
                    break;
                case 2:
                    if (answer == 'B') score++;
                    break;
                case 3:
                    if (answer == 'D') score++;
                    break;
                case 4:
                    if (answer == 'C') score++;
                    break;
            }
			System.out.println();
		}
		
		// print Final score
        System.out.println("=================================");
        System.out.println("         QUIZ COMPLETED          ");
        System.out.println("       Your Score: " + score + " / " + questions.length);
        System.out.println("=================================");

        input.close();
	}
}