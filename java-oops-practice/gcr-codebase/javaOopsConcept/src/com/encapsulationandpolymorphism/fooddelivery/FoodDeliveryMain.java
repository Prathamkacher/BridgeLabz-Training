package com.encapsulationandpolymorphism.fooddelivery;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryMain {

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        OrderProcessor.processOrder(order);
    }
}
