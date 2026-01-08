package com.ioandstringsandsearching.challengeproblem.problem1;

public class ComparisonMain {

    public static void main(String[] args) {

        // ---------- StringBuilder vs StringBuffer ----------
        long builderTime = StringConcatBenchmark.testStringBuilder();
        long bufferTime = StringConcatBenchmark.testStringBuffer();

        System.out.println("StringBuilder Time (ns): " + builderTime);
        System.out.println("StringBuffer  Time (ns): " + bufferTime);

        // ---------- FileReader vs InputStreamReader ----------
        String filePath = "src/com/ioandstringsandsearching/challengeproblem/problem1/largefile.txt"; // ~100MB file

        Result frResult = FileReadBenchmark.readUsingFileReader(filePath);
        Result isrResult =
            FileReadBenchmark.readUsingInputStreamReader(filePath);

        System.out.println("\nFileReader Word Count: " + frResult.wordCount);
        System.out.println("FileReader Time (ns): " + frResult.timeTaken);

        System.out.println("\nInputStreamReader Word Count: " + isrResult.wordCount);
        System.out.println("InputStreamReader Time (ns): " + isrResult.timeTaken);
    }
}
