package OverloadedPizzaOrderBuilder;

class Pizza {

    private String size;
    private String crustType;
    private int toppingsCount;
    private double price;

    public Pizza(String size) {
        this(size, "Regular", 0);
    }

    public Pizza(String size, String crustType) {
        this(size, crustType, 0);
    }

    public Pizza(String size, String crustType, int toppingsCount) {
        this(size, crustType, toppingsCount,
                calculatePrice(size, toppingsCount));
    }

    public Pizza(String size, String crustType,
                 int toppingsCount, double price) {

        this.size = size;
        this.crustType = crustType;
        this.toppingsCount = toppingsCount;
        this.price = price;
    }

    private static double calculatePrice(String size, int toppingsCount) {
        double basePrice;

        if (size.equalsIgnoreCase("Small")) {
            basePrice = 100;
        } else if (size.equalsIgnoreCase("Medium")) {
            basePrice = 150;
        } else if (size.equalsIgnoreCase("Large")) {
            basePrice = 200;
        } else {
            basePrice = 100;
        }

        return basePrice + (toppingsCount * 20);
    }

    public void display() {

        System.out.println(
                "Size: " + size + ", Crust: " + crustType +
                        ", Toppings: " + toppingsCount + ", Price: " + price
        );
    }
}