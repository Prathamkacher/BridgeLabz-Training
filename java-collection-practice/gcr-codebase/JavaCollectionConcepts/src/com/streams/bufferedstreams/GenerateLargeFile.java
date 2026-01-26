package com.streams.bufferedstreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class GenerateLargeFile {

    public static void main(String[] args) {

        String filePath =
        "src/com/streams/bufferedstreams/largefile.dat";

        byte[] buffer = new byte[1024 * 1024]; // 1 MB

        try (FileOutputStream fos = new FileOutputStream(filePath)) {

            for (int i = 0; i < 100; i++) {
                fos.write(buffer);
            }

            System.out.println("File created at desired location.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
