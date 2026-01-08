package com.ioandstringsandsearching.stringbuilder.problem2;

import java.util.HashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        return sb.toString();
    }
}
