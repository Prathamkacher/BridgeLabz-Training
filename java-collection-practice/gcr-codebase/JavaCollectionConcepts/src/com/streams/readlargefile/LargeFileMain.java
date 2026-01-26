package com.streams.readlargefile;

import java.io.IOException;

public class LargeFileMain {

    public static void main(String[] args) {

        String filePath = "src/com/streams/readlargefile/largeLogFile.txt";

        try {
            Reader.printErrorLines(filePath);
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
