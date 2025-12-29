/*
9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.*;
public class AttendanceSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		System.out.println("===== School Bus Attendance =====");

        String[] students = {
            "Aryaman", "Gautam", "Pratham", "Sneha", "Rahul",
            "Pooja", "Kalua", "Piyush", "Vikas", "Krishna"
        };

        String[] attendance = new String[students.length];

        int presentCount = 0;
        int absentCount = 0;

        // Taking attendance using for-each loop
        int index = 0;
        for (String student : students) {
			
            while (true) {
                System.out.print("Is " + student + " Present or Absent? ");
                String status = input.nextLine().toLowerCase();

                if (status.equals("present") || status.equals("p")) {
                    attendance[index] = "Present";
                    presentCount++;
                    break; // valid input → move to next student
                }
                else if (status.equals("absent") || status.equals("a")) {
                    attendance[index] = "Absent";
                    absentCount++;
                    break; // valid input → move to next student
                }
                else {
                    System.out.println("Invalid input! Please enter only Present or Absent.");
                }
            }
            index++;
        }

        // Printing attendance table
        System.out.println("\n=========== SCHOOL BUS ATTENDANCE ===========");
        System.out.printf("%-5s %-20s %-10s%n", "No", "Student Name", "Status");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-5d %-20s %-10s%n",
                    (i + 1), students[i], attendance[i]);
        }

        System.out.println("--------------------------------------------");
        System.out.printf("%-25s %d%n", "Total Students:", students.length);
        System.out.printf("%-25s %d%n", "Present:", presentCount);
        System.out.printf("%-25s %d%n", "Absent:", absentCount);
        System.out.println("============================================");

        input.close();
    }
}

