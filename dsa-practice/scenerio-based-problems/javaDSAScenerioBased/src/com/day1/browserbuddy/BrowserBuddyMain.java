/*
 * 2. BrowserBuddy – Tab History Manager (Doubly Linked List + Stack)
Story: Neha is working on a custom browser. Each open tab maintains its browsing history with "Back" and "Forward" operations. She uses a Doubly Linked List for history and a Stack to hold closed tabs for reopening.
Requirements:
● Support forward and backward navigation.
● Restore recently closed tabs.
● Maintain memory-efficient tab management using pointers.
 */

package com.day1.browserbuddy;

public class BrowserBuddyMain {

    public static void main(String[] args) {

        BrowserHistory history = new BrowserHistory();
        TabManager tabs = new TabManager();

        // Browsing
        history.visit("Google");
        history.visit("YouTube");
        history.visit("ChatGPT");

        history.back();      // YouTube
        history.back();      // Google
        history.forward();   // YouTube

        // Closing and reopening tabs
        tabs.closeTab("ChatGPT");
        tabs.closeTab("YouTube");

        tabs.reopenTab();    // YouTube
        tabs.reopenTab();    // ChatGPT
        tabs.reopenTab();    // No more tabs
    }
}
