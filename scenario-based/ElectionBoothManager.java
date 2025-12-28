import java.util.Scanner;

public class ElectionBoothManager {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		int candidate1 = 0;
		int candidate2 = 0;
		int candidate3 = 0;

		while (true) {
			// Take user input
			System.out.print("Enter voter age (Enter 0 to exit):");
			int age = input.nextInt();
			
			// Exit when user enters 0
			if (age == 0) {
				break;
			}

			// Voting eligibility
			if (age >= 18) {
				System.out.println("Eligible to vote!");
				System.out.print("Vote for candidate (1 / 2/ 3): ");
				int vote = input.nextInt();

				if (vote == 1) {
					candidate1++;
				} else if (vote == 2) {
					candidate2++;
				} else if (vote == 3) {
					candidate3++;
				} else {
					System.out.println("Invalid input");
				}
			} else {
				System.out.println("Not elogible for vote");
			}


		}

		// Display output
		System.out.println("Candidate 1: " + candidate1);
		System.out.println("Candidate 2: " + candidate2);
		System.out.println("Candidate 3: " + candidate3);

		input.close();

	}
}
		
				