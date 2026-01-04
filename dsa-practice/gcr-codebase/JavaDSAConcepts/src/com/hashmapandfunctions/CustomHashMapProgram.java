package com.hashmapandfunctions;

//Custom HashMap implementation using Separate Chaining
//All logic is implemented in a single file

class CustomHashMapProgram {

 // Node class for linked list
 static class Entry {
     int key;
     int value;
     Entry next;

     Entry(int key, int value) {
         this.key = key;
         this.value = value;
         this.next = null;
     }
 }

 // Custom HashMap class
 static class CustomHashMap {

     private static final int SIZE = 10;   // bucket array size
     private Entry[] buckets;

     // Constructor
     CustomHashMap() {
         buckets = new Entry[SIZE];
     }

     // Hash function
     private int getBucketIndex(int key) {
         return key % SIZE;
     }

     // Insert or update key-value pair
     public void put(int key, int value) {
         int index = getBucketIndex(key);
         Entry head = buckets[index];

         // Check if key already exists
         Entry current = head;
         while (current != null) {
             if (current.key == key) {
                 current.value = value; // update value
                 return;
             }
             current = current.next;
         }

         // Insert new entry at beginning
         Entry newEntry = new Entry(key, value);
         newEntry.next = head;
         buckets[index] = newEntry;
     }

     // Retrieve value by key
     public Integer get(int key) {
         int index = getBucketIndex(key);
         Entry current = buckets[index];

         while (current != null) {
             if (current.key == key) {
                 return current.value;
             }
             current = current.next;
         }
         return null;
     }

     // Remove key-value pair
     public void remove(int key) {
         int index = getBucketIndex(key);
         Entry current = buckets[index];
         Entry prev = null;

         while (current != null) {
             if (current.key == key) {
                 if (prev == null) {
                     buckets[index] = current.next;
                 } else {
                     prev.next = current.next;
                 }
                 return;
             }
             prev = current;
             current = current.next;
         }
     }

     // Print all elements of hash map
     public void printMap() {
         for (int i = 0; i < SIZE; i++) {
             Entry current = buckets[i];
             System.out.print("Bucket " + i + ": ");
             while (current != null) {
                 System.out.print("[" + current.key + "," + current.value + "] ");
                 current = current.next;
             }
             System.out.println();
         }
     }
 }

 // Main method
 public static void main(String[] args) {

     CustomHashMap map = new CustomHashMap();

     map.put(1, 100);
     map.put(2, 200);
     map.put(12, 1200); // collision with key 2

     System.out.println("Value for key 1: " + map.get(1));
     System.out.println("Value for key 2: " + map.get(2));

     map.remove(2);

     System.out.println("\nAfter removing key 2:");
     map.printMap();
 }
}
