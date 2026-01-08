package com.ioandstringsandsearching.stringbuilder.problem2;

import java.util.Scanner;

public class RemoveMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        String result = RemoveDuplicates.removeDuplicates(input);

        System.out.println("After removing duplicates: " + result);

        sc.close();
    }
}
