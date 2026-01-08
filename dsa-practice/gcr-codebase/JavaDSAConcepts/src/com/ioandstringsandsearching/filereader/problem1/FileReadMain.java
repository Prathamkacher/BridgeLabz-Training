package com.ioandstringsandsearching.filereader.problem1;

public class FileReadMain {

    public static void main(String[] args) {

        String filePath = "src/com/ioandstringsandsearching/filereader/problem1/sample.txt";  // file must exist in project directory

        FileRead.readFileLineByLine(filePath);
    }
}
