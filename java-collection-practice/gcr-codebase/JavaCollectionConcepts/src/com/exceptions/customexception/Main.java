package com.exceptions.customexception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            AgeValidator.validateAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
