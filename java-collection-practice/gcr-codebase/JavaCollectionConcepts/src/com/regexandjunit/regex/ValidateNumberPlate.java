package com.regexandjunit.regex;

public class ValidateNumberPlate {

    public static boolean isValidLicensePlate(String plate) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        return plate.matches(regex);
    }

    public static void main(String[] args) {

        String[] numberPlates = {
            "AB1234",
            "A12345",
            "ab1234",
            "XY9999"
        };

        for (String plate : numberPlates) {
            if (isValidLicensePlate(plate)) {
                System.out.println(plate + " → Valid");
            } else {
                System.out.println(plate + " → Invalid");
            }
        }
    }
}
