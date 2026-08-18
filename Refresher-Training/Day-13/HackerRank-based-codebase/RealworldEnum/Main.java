package RealworldEnum;

public class Main {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;

        if (status.isFinal()) {
            System.out.println("Order tracking completed.");
        } else {
            System.out.println("Order is still in progress.");
        }
    }
}
