package com.ioandstringsandsearching.stringbuffer.problem2;

public class StringConcatBenchmark {

    private static final int COUNT = 1_000_000;
    private static final String TEXT = "hello";

    // Test StringBuffer performance
    public static long testStringBuffer() {

        StringBuffer buffer = new StringBuffer();
        long start = System.nanoTime();

        for (int i = 0; i < COUNT; i++) {
            buffer.append(TEXT);
        }

        long end = System.nanoTime();
        return end - start;
    }

    // Test StringBuilder performance
    public static long testStringBuilder() {

        StringBuilder builder = new StringBuilder();
        long start = System.nanoTime();

        for (int i = 0; i < COUNT; i++) {
            builder.append(TEXT);
        }

        long end = System.nanoTime();
        return end - start;
    }
}
