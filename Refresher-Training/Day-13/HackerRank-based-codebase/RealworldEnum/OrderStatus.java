package RealworldEnum;

public enum OrderStatus {
    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    boolean isFinal() {
        return this == DELIVERED || this == CANCELLED;
    }
}
