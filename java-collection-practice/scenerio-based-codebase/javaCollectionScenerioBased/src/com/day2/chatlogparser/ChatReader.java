package com.day_2.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatReader {

    private static final Pattern CHAT_PATTERN =
            Pattern.compile("\\[(.*?)\\]\\s(.*?):\\s(.*)");

    public static List<Message> readChats(String filePath) {
        List<Message> messages = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                Matcher m = CHAT_PATTERN.matcher(line);
                if (m.matches()) {
                    messages.add(new Message(m.group(1), m.group(2), m.group(3)));
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading chat log");
        }
        return messages;
    }
}
