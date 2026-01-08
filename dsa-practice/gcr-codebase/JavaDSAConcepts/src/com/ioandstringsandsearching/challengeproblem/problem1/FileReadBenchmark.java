package com.ioandstringsandsearching.challengeproblem.problem1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReadBenchmark {

    // FileReader
    public static Result readUsingFileReader(String filePath) {
        long start = System.nanoTime();
        long wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        long end = System.nanoTime();
        return new Result(wordCount, end - start);
    }

    // InputStreamReader
    public static Result readUsingInputStreamReader(String filePath) {
        long start = System.nanoTime();
        long wordCount = 0;

        try (
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr =
                new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr)
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        long end = System.nanoTime();
        return new Result(wordCount, end - start);
    }
}
