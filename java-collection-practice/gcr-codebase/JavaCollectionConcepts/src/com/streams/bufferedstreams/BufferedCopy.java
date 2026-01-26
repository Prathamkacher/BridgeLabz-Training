package com.streams.bufferedstreams;

import java.io.*;

public class BufferedCopy {

    public static long copy(String source, String destination) {

        long startTime = System.nanoTime();

        try (
            BufferedInputStream bufferedInput =
                    new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bufferedOuput =
                    new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bufferedInput.read(buffer)) != -1) {
            	bufferedOuput.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in buffered file copy");
        }

        return System.nanoTime() - startTime;
    }
}
