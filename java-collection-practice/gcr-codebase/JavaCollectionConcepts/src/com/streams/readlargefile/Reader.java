package com.streams.readlargefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void printErrorLines(String filePath) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            if (line.toLowerCase().contains("error")) {
                System.out.println(line);
            }
        }

        reader.close();
    }
}
