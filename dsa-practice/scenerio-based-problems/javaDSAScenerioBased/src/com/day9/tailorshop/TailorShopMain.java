/*
 * 9. TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting
 */

package com.day9.tailorshop;

public class TailorShopMain {

    public static void main(String[] args) {

        Order[] orders = {
            new Order("ORD101", 10),
            new Order("ORD102", 12),
            new Order("ORD103", 15),
            new Order("ORD104", 11)  // newly added order
        };

        System.out.println("Before Sorting:");
        for (Order o : orders)
            System.out.println(o);

        InsertionSort.sortByDeadline(orders, orders.length);

        System.out.println("\nOrders Sorted by Deadline:");
        for (Order o : orders)
            System.out.println(o);
    }
}
