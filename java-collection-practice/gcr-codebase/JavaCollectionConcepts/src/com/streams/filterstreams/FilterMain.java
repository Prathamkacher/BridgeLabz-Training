package com.streams.filterstreams;

import java.io.IOException;

public class FilterMain {

    public static void main(String[] args) {

        String inputFile = "src/com/streams/filterstreams/input.txt";
        String outputFile = "src/com/streams/filterstreams/output.txt";

        try {
            ConvertLowerCase.convertToLowerCase(inputFile, outputFile);
            System.out.println("File converted successfully.");

        } catch (IOException e) {
            System.out.println("Error while processing file.");
        }
    }
}
