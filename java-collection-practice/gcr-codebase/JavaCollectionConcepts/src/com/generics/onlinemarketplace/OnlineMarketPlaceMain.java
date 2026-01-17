package com.generics.onlinemarketplace;

public class OnlineMarketPlaceMain {

 public static void main(String[] args) {

     Product<BookCategory> book =
             new Product<>("Clean Code", 799, new BookCategory());

     Product<ClothingCategory> shirt =
             new Product<>("T-Shirt", 999, new ClothingCategory());

     Product<GadgetCategory> phone =
             new Product<>("Smartphone", 25000, new GadgetCategory());

     // Apply discounts
     DiscountService.applyDiscount(book, 10);
     DiscountService.applyDiscount(shirt, 20);
     DiscountService.applyDiscount(phone, 5);

     // Catalog
     Catalog catalog = new Catalog();
     catalog.addProduct(book);
     catalog.addProduct(shirt);
     catalog.addProduct(phone);

     System.out.println("---- Online Marketplace Catalog ----");
     catalog.displayCatalog();
 }
}
