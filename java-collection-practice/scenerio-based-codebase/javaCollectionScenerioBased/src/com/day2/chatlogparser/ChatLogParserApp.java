package com.day_2.chatlogparser;

import java.util.*;

public class ChatLogParserApp {

    public static void main(String[] args) {

        List<Message> messages = ChatReader.readChats("chatlog.txt");

        MessageFilter<Message> filter = new IdleChatFilter();

        Map<String, List<String>> result =
                ChatAnalyzer.analyze(messages, filter);

        System.out.println("\nProductive Chat Summary");

        result.forEach((user, msgs) -> {
            System.out.println("\nUser: " + user);
            for (String m : msgs) {
                System.out.println("  " + m);
            }
        });
    }
}
