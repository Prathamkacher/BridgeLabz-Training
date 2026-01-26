package com.regexandjunit.regex;

public class ValidateSSN {

    public static boolean isValidSSN(String ssn) {

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return ssn.matches(regex);
    }

    public static void main(String[] args) {

        String[] SSNs = {
            "123-45-6789",
            "123456789",
            "12-345-6789"
        };

        for (String ssn : SSNs) {
            if (isValidSSN(ssn)) {
                System.out.println(ssn + "\" is valid");
            } else {
                System.out.println(ssn + "\" is invalid");
            }
        }
    }
}
