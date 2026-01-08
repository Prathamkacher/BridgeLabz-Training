package com.ioandstringsandsearching.challengeproblem.problem1;

public class StringConcatBenchmark {

    private static final int COUNT = 1_000_000;
    private static final String TEXT = "hello";

    public static long testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();

        for (int i = 0; i < COUNT; i++) {
            sb.append(TEXT);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public static long testStringBuffer() {
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();

        for (int i = 0; i < COUNT; i++) {
            sb.append(TEXT);
        }

        long end = System.nanoTime();
        return end - start;
    }
}
