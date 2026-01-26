package com.streams.bufferedstreams;

import java.io.*;

public class NormalCopy {

    public static long copy(String source, String destination) {

        long startTime = System.nanoTime();

        try (
            FileInputStream input = new FileInputStream(source);
            FileOutputStream output = new FileOutputStream(destination)
        ) {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in normal file copy");
        }

        return System.nanoTime() - startTime;
    }
}
