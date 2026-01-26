package com.streams.filterstreams;

import java.io.*;

public class ConvertLowerCase {

    public static void convertToLowerCase(String sourceFile, String destFile)
            throws IOException {

        BufferedReader reader =
                new BufferedReader(new FileReader(sourceFile));
        BufferedWriter writer =
                new BufferedWriter(new FileWriter(destFile));

        String line;

        while ((line = reader.readLine()) != null) {
            writer.write(line.toLowerCase());
            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}
