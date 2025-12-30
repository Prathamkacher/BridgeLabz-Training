/*
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.util.*;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║      ROHAN'S LIBRARY REMINDER     ║");
        System.out.println("╚═══════════════════════════════════╝");

        int totalFine = 0;

        // Loop for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);

            System.out.print("Enter Due Date (day number): ");
            int dueDate = input.nextInt();

            System.out.print("Enter Return Date (day number): ");
            int returnDate = input.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * 5;

                System.out.println("Late by " + lateDays + " day(s)");
                System.out.println("Fine for this book: Rs" + fine);

                totalFine += fine;
            } else {
                System.out.println("Returned on time. No fine!");
            }
        }

        // Final Summary
        System.out.println("\n═════════  FINE SUMMARY  ════════");
        System.out.println(" Total Fine Payable: Rs" + totalFine);
        System.out.println("══════════════════════════════════");

        System.out.println("\nThank you! Please return books on time.");
    }
}
