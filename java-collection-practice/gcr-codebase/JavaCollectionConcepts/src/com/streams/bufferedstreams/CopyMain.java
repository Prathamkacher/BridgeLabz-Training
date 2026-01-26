package com.streams.bufferedstreams;

public class CopyMain {

    public static void main(String[] args) {

        String sourceFile = "src/com/streams/bufferedstreams/largefile.dat";     // ~100MB file
        String normalDest = "src/com/streams/bufferedstreams/normalCopy.dat";
        String bufferedDest = "src/com/streams/bufferedstreams/bufferedCopy.dat";

        long normalTime =
                NormalCopy.copy(sourceFile, normalDest);

        long bufferedTime =
                BufferedCopy.copy(sourceFile, bufferedDest);

        System.out.println("Normal Stream Time   : " + normalTime + " ns");
        System.out.println("Buffered Stream Time : " + bufferedTime + " ns");
    }
}
