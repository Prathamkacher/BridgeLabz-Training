package com.day_1.feedbackguru;

import java.util.*;
import java.util.regex.*;

public class FeedbackAnalyzer {

    private static final Pattern RATING_PATTERN = Pattern.compile("(\\d{1,2})/10");

    public static <T> Map<String, List<Feedback<T>>> analyze(List<String> lines, T type) {
        Map<String, List<Feedback<T>>> map = new HashMap<>();
        map.put("Positive", new ArrayList<>());
        map.put("Neutral", new ArrayList<>());
        map.put("Negative", new ArrayList<>());

        for (String line : lines) {
            try {
                Matcher m = RATING_PATTERN.matcher(line);

                if (!m.find())
                    throw new Exception("Rating not found");

                int rating = Integer.parseInt(m.group(1));
                Feedback<T> feedback = new Feedback<>(type, line, rating);

                if (rating >= 8)
                    map.get("Positive").add(feedback);
                else if (rating >= 5)
                    map.get("Neutral").add(feedback);
                else
                    map.get("Negative").add(feedback);

            } catch (Exception e) {
                System.out.println("Skipping invalid line: " + line);
            }
        }
        return map;
    }
}
