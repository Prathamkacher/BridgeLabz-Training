package com.linkedlist.singlylinkedlist.socialmediaconnection;

public class SocialMediaList {

    private UserNode head;

    // Add user
    public void addUser(int id, String name, int age) {
        UserNode user = new UserNode(id, name, age);
        user.next = head;
        head = user;
    }

    // Search user by ID
    private UserNode getUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search user by Name
    public void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // Add friend connection (both sides)
    public void addFriend(int id1, int id2) {
        UserNode u1 = getUserById(id1);
        UserNode u2 = getUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        u1.friends = addFriendToList(u1.friends, id2);
        u2.friends = addFriendToList(u2.friends, id1);
    }

    private FriendNode addFriendToList(FriendNode head, int id) {
        FriendNode node = new FriendNode(id);
        node.next = head;
        return node;
    }

    // Remove friend connection
    public void removeFriend(int id1, int id2) {
        UserNode u1 = getUserById(id1);
        UserNode u2 = getUserById(id2);

        if (u1 == null || u2 == null) return;

        u1.friends = removeFromList(u1.friends, id2);
        u2.friends = removeFromList(u2.friends, id1);
    }

    private FriendNode removeFromList(FriendNode head, int id) {
        if (head == null) return null;

        if (head.friendId == id)
            return head.next;

        FriendNode temp = head;
        while (temp.next != null && temp.next.friendId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode user = getUserById(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find mutual friends
    public void findMutualFriends(int id1, int id2) {
        UserNode u1 = getUserById(id1);
        UserNode u2 = getUserById(id2);

        if (u1 == null || u2 == null) return;

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friends;

        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // Count number of friends
    public void countFriends(int userId) {
        UserNode user = getUserById(userId);
        if (user == null) return;

        int count = 0;
        FriendNode temp = user.friends;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(user.name + " has " + count + " friends");
    }

    private void displayUser(UserNode u) {
        System.out.println("ID: " + u.userId + ", Name: " + u.name + ", Age: " + u.age);
    }
}
