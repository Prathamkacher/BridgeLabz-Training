package com.ioandstringsandsearching.inputstreamreader.problem2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleToFile {

    public static void readFromConsoleAndWriteToFile(String filePath) {

        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath, true) // append mode
        ) {

            String input;

            System.out.println("Enter text (type 'exit' to stop):");

            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input);
                fw.write(System.lineSeparator());
            }

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
