/*
 * 20. "FoodLoop – Restaurant Ordering System"
Story: FoodLoop is an app where users place food orders from local restaurants.
Requirements:
● FoodItem class: name, category, price, availability.
● Order class: contains list of food items and total.
● Interface IOrderable with placeOrder() and cancelOrder().
● Use constructors to create custom combo meals.
● Operators: total price = sum of item prices – discounts.
● Encapsulation: keep item stock levels hidden.
● Inheritance: VegItem, NonVegItem extend FoodItem.
● Polymorphism: applyDiscount() varies by order total.
 */

package com.day8.foodloop;

import java.util.ArrayList;

public class FoodLoopMain {

    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Paneer Butter Masala", 250, 5);
        FoodItem item2 = new VegItem("Veg Biryani", 200, 3);
        FoodItem item3 = new NonVegItem("Chicken Biryani", 350, 4);

        ArrayList<FoodItem> combo = new ArrayList<>();
        combo.add(item1);
        combo.add(item2);
        combo.add(item3);

        Order order = new Order(combo);

        order.placeOrder();
    }
}
