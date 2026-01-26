package com.streams.filehandling;

import java.io.*;

public class CopyFile {

    public static void copyFile(String sourcePath, String destPath) {

        try (
            FileInputStream input = new FileInputStream(sourcePath);
            FileOutputStream output = new FileOutputStream(destPath)
        ) {
            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }
            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        }
    }
}
