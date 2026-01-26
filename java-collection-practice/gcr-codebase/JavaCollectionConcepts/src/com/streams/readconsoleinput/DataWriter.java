package com.streams.readconsoleinput;

import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {

    public static void writeToFile(String data, String fileName)
            throws IOException {

        FileWriter writer = new FileWriter(fileName);
        writer.write(data);
        writer.close();
    }
}
