package com.day6.bookbazaar;

public class BookBazaarMain {

    public static void main(String[] args) {

        Book ebook = new EBook("Atomic Habits", "James Clear", 400);
        Book printedBook = new PrintedBook("Clean Code", "Robert Martin", 650, 10);

        Order order = new Order("Aryaman");

        order.addBook(ebook, 1);
        order.addBook(printedBook, 2);

        double totalAmount = order.calculateTotal();

        System.out.println("Order Total: ₹" + totalAmount);
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
