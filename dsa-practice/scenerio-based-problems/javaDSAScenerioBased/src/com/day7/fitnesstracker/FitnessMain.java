/*
 * 5. FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting
 */

package com.day7.fitnesstracker;

public class FitnessMain {

    public static void main(String[] args) {

        User[] users = {
            new User("Gautam", 4500),
            new User("Pratham", 7200),
            new User("Krishna", 6000),
            new User("Prashant", 5000),
            new User("Aryaman", 6800)
        };

        System.out.println("Before Sorting:");
        for (User u : users)
            System.out.println(u);

        FitnessTracker.bubbleSort(users);

        System.out.println("\nDaily Leaderboard:");
        int rank = 1;
        for (User u : users) {
            System.out.println(rank++ + ". " + u);
        }
    }
}
