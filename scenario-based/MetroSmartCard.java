import java.util.Scanner;

public class MetroSmartCard {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double balance = 100;   // initial smart card balance

		while (balance > 0) {
			// Take user input
			System.out.println("\nCurrent Balance: " + balance + "Rs");
			System.out.print("Enter distance travelled (Enter -1 to quit): ");
			int distance = input.nextInt();

			// Exit condition
			if (distance == -1) {
				break;
			}

			// Fare calculation using ternary operator
			int fare = (distance <= 5) ? 10 :
					   (distance <= 15) ? 20 : 30;

			// Balance check
			if (balance >= fare) {
				balance = balance - fare;
				System.out.println("Fare deducted: " + fare + "Rs");
			} else {
				System.out.println("Insufficient balance. Please recharge.");
				break;
			}
		}

		System.out.println("\nJourney ended. Final Balance: " + balance + "Rs");
		input.close();
	}
}
