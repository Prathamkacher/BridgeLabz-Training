package com.regexandjunit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguageNames {

    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String regex = "\\b(JavaScript|Java|Python|Go)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean first = true;
        while (matcher.find()) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(matcher.group());
            first = false;
        }
    }
}
