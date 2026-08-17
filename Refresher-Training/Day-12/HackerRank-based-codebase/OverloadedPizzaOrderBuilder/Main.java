package OverloadedPizzaOrderBuilder;

public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Small");
        Pizza p2 = new Pizza("Medium", "Thin");
        Pizza p3 = new Pizza("Large", "Cheese", 3);
        Pizza p4 = new Pizza("Large", "Stuffed", 2, 500);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
