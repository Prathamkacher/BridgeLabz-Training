package com.encapsulationandpolymorphism.fooddelivery;

public class NonVegItem extends FoodItem implements Discountable {

    private static final double EXTRA_CHARGE = 50; // per item

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + (EXTRA_CHARGE * getQuantity());
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}
