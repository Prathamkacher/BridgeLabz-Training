package com.streams.filehandling;

public class CopyFileMain {

    public static void main(String[] args) {

        String sourceFile = "src/com/streams/filehandling/input.txt";
        String destinationFile = "src/com/streams/filehandling/output.txt";

        CopyFile.copyFile(sourceFile, destinationFile);
    }
}
