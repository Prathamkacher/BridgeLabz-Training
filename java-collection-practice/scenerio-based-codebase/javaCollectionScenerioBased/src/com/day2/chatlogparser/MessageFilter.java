package com.day_2.chatlogparser;

public interface MessageFilter<T> {
    boolean allow(T message);
}
