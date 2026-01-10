package com.day1.browserbuddy;

import java.util.Stack;

public class TabManager {
	private Stack<String> closedTabs = new Stack<>();
	
	//close tab
	public void closeTab(String page) {
		closedTabs.push(page);
		System.out.println("Tab Closed: " + page);
	}
	
	//reopen page
	public void reopenTab() {
		if (!closedTabs.isEmpty()) {
            String page = closedTabs.pop();
            System.out.println("Reopened tab: " + page);
        } else {
            System.out.println("No closed tabs to reopen.");
        }
	}
}
