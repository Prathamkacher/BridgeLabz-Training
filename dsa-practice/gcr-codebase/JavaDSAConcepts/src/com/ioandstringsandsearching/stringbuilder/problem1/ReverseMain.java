package com.ioandstringsandsearching.stringbuilder.problem1;

import java.util.Scanner;

public class ReverseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calling method from another class
        String reversed = ReverseString.reverseString(input);

        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
