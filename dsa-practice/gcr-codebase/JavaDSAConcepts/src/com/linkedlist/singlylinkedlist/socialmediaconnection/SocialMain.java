package com.linkedlist.singlylinkedlist.socialmediaconnection;

public class SocialMain {

    public static void main(String[] args) {

        SocialMediaList sm = new SocialMediaList();

        sm.addUser(1, "Aryaman", 22);
        sm.addUser(2, "Ravi", 21);
        sm.addUser(3, "Aman", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);

        sm.displayFriends(1);
        sm.findMutualFriends(1, 2);
        sm.countFriends(3);

        sm.searchByName("Ravi");

        sm.removeFriend(1, 2);
        sm.displayFriends(1);
    }
}
