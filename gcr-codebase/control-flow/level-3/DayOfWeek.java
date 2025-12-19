//Create a class DayOfWeek to find the day of the week for a given date.
public class DayOfWeek {
    public static void main(String args[]) {

        // Read command-line arguments month, day, year
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Apply given formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print result
        System.out.println("Day of the week is: " + d0);
    }
}
