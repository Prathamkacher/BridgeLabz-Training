import java.util.*;

abstract class Boook {
    String title;
    String author;

    Boook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

/**
 *   Class Constructor
 *
 *   @param title The book's title.
 *   @param author The book's author.
 *   @param price The book's price.
 **/
// Write your constructor here

/**
 *   Method Name: display
 *
 *   Print the title, author, and price in the specified format.
 **/
// Write your method here

class MyBoook extends Boook {

    int price;

    MyBoook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// End class

public class AbstractClasses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Boook book = new MyBoook(title, author, price);
        book.display();
    }
}