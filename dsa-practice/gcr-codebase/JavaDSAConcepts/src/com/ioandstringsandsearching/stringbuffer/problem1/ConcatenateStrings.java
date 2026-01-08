package com.ioandstringsandsearching.stringbuffer.problem1;

public class ConcatenateStrings{

    public static String concatenateStrings(String[] arr) {

        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            sb.append(str);
        }

        return sb.toString();
    }
}
