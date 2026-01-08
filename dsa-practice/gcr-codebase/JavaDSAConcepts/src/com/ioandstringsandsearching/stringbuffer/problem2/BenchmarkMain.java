package com.ioandstringsandsearching.stringbuffer.problem2;

public class BenchmarkMain {

    public static void main(String[] args) {

        long bufferTime = StringConcatBenchmark.testStringBuffer();
        long builderTime = StringConcatBenchmark.testStringBuilder();

        System.out.println("StringBuffer Time (ns): " + bufferTime);
        System.out.println("StringBuilder Time (ns): " + builderTime);
    }
}
