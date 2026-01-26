package com.regexandjunit.regex;

public class ValidateUsername{

    public static boolean isValidUsername(String username) {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {

        String[] Usernames = {
            "user_123",
            "123user",
            "us",
            "User_name1"
        };

        for (String name : Usernames) {
            if (isValidUsername(name)) {
                System.out.println(name + " → Valid");
            } else {
                System.out.println(name + " → Invalid");
            }
        }
    }
}
