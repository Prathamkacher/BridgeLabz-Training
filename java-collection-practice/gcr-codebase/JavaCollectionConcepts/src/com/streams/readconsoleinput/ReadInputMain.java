package com.streams.readconsoleinput;

import java.io.IOException;

public class ReadInputMain {

    public static void main(String[] args) {

        try {
            String userData = InputReader.readUserData();
            DataWriter.writeToFile(userData, "src/com/streams/readconsoleinput/user.txt");
            System.out.println("User data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing data.");
        }
    }
}
