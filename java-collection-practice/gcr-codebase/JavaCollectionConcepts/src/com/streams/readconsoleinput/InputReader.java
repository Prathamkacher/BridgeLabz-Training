package com.streams.readconsoleinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {

    public static String readUserData() throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.print("Enter your age: ");
        String age = br.readLine();

        System.out.print("Enter your favorite programming language: ");
        String language = br.readLine();

        return "Name: " + name +
               "\nAge: " + age +
               "\nFavorite Language: " + language;
    }
}
