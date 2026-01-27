package com.day_1.resumeanalyzer;

import java.util.*;
import java.util.regex.*;

public class ResumeParser {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("\\b\\d{10}\\b");

    private static final List<String> KEYWORDS =
            Arrays.asList("Java", "Python", "Spring");

    public static ResumeData parse(String content) throws Exception {
        Matcher emailMatcher = EMAIL_PATTERN.matcher(content);
        Matcher phoneMatcher = PHONE_PATTERN.matcher(content);

        if (!emailMatcher.find())
            throw new Exception("Invalid resume: Email not found");

        String email = emailMatcher.group();
        String phone = phoneMatcher.find() ? phoneMatcher.group() : "Not Found";

        List<String> matched = new ArrayList<>();
        for (String keyword : KEYWORDS) {
            Pattern p = Pattern.compile("\\b" + keyword + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(content);
            if (m.find()) {
                matched.add(keyword);
            }
        }

        return new ResumeData(email, phone, matched);
    }
}
