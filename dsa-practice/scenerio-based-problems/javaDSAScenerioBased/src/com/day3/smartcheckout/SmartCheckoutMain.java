package com.day3.smartcheckout;

import java.util.*;

public class SmartCheckoutMain {

    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        List<String> items1 = Arrays.asList("Milk", "Bread", "Eggs");
        List<String> items2 = Arrays.asList("Milk", "Milk", "Bread");

        checkout.addCustomer(new Customer("Amit", items1));
        checkout.addCustomer(new Customer("Riya", items2));

        checkout.processCustomer();
        checkout.displayStock();

        checkout.processCustomer();
        checkout.displayStock();
    }
}
