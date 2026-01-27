package com.day_2.chatlogparser;

import java.util.*;

public class IdleChatFilter implements MessageFilter<Message> {

    private static final List<String> IDLE_WORDS =
            Arrays.asList("lol", "brb", "haha", "ok");

    @Override
    public boolean allow(Message msg) {
        for (String w : IDLE_WORDS) {
            if (msg.text.toLowerCase().contains(w)) {
                return false;
            }
        }
        return true;
    }
}
