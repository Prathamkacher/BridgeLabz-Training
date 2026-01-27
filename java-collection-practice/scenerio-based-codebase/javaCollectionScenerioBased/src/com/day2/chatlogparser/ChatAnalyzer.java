package com.day_2.chatlogparser;

import java.util.*;

public class ChatAnalyzer {

    public static Map<String, List<String>> analyze(
            List<Message> messages, MessageFilter<Message> filter) {

        Map<String, List<String>> map = new TreeMap<>();

        for (Message msg : messages) {
            if (!filter.allow(msg)) continue;

            map.putIfAbsent(msg.user, new ArrayList<>());
            map.get(msg.user).add(msg.toString());
        }
        return map;
    }
}
