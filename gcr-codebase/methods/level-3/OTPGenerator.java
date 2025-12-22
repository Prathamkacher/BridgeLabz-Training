//Create a class OTPGenerator to generate and validate OTP numbers
public class OTPGenerator {

    //Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    //Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        //store 10 OTPs
        int[] otpArray = new int[10];

        //generate OTPs.
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        //print generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        //Check uniqueness
        boolean unique = areOTPsUnique(otpArray);

        //print result
        if (unique) {
            System.out.println("All generated OTPs are unique");
        } else {
            System.out.println("Duplicate OTPs found");
        }
    }
}