package com.day1.shopping;

import java.util.function.*;
import java.util.Comparator;

public class ProductService {

    public static Function<Product, Double> applyDiscount =
            p -> p.getPrice() * 0.90;

    public static Comparator<Product> sortByPrice =
            (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());

    public static Predicate<Double> freeDeliveryEligible =
            amount -> amount > 500;

    public static Function<Product, Double> productTotal =
            p -> p.getPrice() * p.getQuantity();

    public static Consumer<Product> printProductName =
            p -> System.out.println(p.getName());
}
