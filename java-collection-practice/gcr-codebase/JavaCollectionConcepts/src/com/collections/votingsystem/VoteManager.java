package com.collections.votingsystem;

import java.util.*;

public class VoteManager {

    private HashMap<String, Integer> voteMap = new HashMap<>();

    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

    // Add vote
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteMap.get(candidate));
    }

    // Display vote insertion order
    public void displayVoteOrder() {
        System.out.println("Vote Order:");
        voteOrder.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    // Display result sorted order
    public void displaySortedResult() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);

        System.out.println("Sorted Results:");
        sortedMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
