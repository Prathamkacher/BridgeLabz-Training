import java.util.Scanner;

public class ResultGenerator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int total = 0;
		int marks;

		// Input marks using for loop
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter marks of subject " + i + ": ");
			marks = input.nextInt();
			total = total + marks;
		}

		double average = total / 5.0;
		int gradeKey = (int) average / 10;

		System.out.println("Average Marks: " + average);

		// Grade assignment using switch
		switch (gradeKey) {
			case 10:
			case 9:
				System.out.println("Grade: A");
				break;
			case 8:
			case 7:
				System.out.println("Grade: B");
				break;
			case 6:
				System.out.println("Grade: C");
				break;
			case 5:
			case 4:
				System.out.println("Grade: D");
				break;
			default:
				System.out.println("Grade: Fail");
		}

		input.close();
	}
}
