package com.functionalinterface.predicate.ecommerce;

import java.util.function.Predicate;

public class EcommerceMain {

    public static void main(String[] args) {

        Order o1 = new Order("ORD101", 650);
        Order o2 = new Order("ORD102", 300);
        Order o3 = new Order("ORD103", 500);

        Predicate<Order> isEligibleForFreeDelivery = order -> order.getAmount() >= 500;

        checkDelivery(o1, isEligibleForFreeDelivery);
        checkDelivery(o2, isEligibleForFreeDelivery);
        checkDelivery(o3, isEligibleForFreeDelivery);
    }

    public static void checkDelivery(Order order, Predicate<Order> rule) {
        if (rule.test(order)) {
            System.out.println(order.getOrderId() + " gets FREE delivery.");
        } else {
            System.out.println(order.getOrderId() + " has delivery charges.");
        }
    }
}
