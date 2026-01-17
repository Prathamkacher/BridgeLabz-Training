package com.generics.onlinemarketplace;

public class DiscountService {

 public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

     double discount = product.getPrice() * (percentage / 100);
     double newPrice = product.getPrice() - discount;

     product.setPrice(newPrice);
 }
}
