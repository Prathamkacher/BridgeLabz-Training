//Create a class SpringSeason to check if a given date falls in Spring Season.
public class SpringSeason {

    //Method to check Spring Season
    public static boolean isSpringSeason(int month, int day) {

        //Spring Season: March 20 to June 20
        if (month <= 6 && month >= 3 && day <= 20) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        //Read command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        //Check Spring Season
        boolean result = isSpringSeason(month, day);

        //Display result
        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
