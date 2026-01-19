/*
 * 4. FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization
 */

package com.day7.flashdealz;

public class FlashDealzMain {

    public static void main(String[] args) {

        Product[] products = {
            new Product("Shoes", 30),
            new Product("Phone", 10),
            new Product("Laptop", 50),
            new Product("Watch", 25),
            new Product("TV", 40)
        };

        System.out.println("Before Sorting:");
        for (Product p : products)
            System.out.println(p);

        FlashDealz.quickSort(products, 0, products.length - 1);

        System.out.println("\nAfter Sorting (Top Discounts First):");
        for (Product p : products)
            System.out.println(p);
    }
}
