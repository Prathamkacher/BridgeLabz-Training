package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.List;

public class PriceCalculator {

    public static void calculateFinalPrice(List<Product> products) {

        for (Product product : products) {

            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
            }

            double finalPrice = price + tax - discount;

            product.displayBasicInfo();
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------------");
        }
    }
}
