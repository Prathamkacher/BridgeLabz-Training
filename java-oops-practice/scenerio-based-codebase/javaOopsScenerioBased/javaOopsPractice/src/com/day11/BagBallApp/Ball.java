public class Ball implements Storable {

    private String id;
    private String color;
    private String size;

    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    // Getters (Encapsulation)
    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    // Interface method
    @Override
    public String getStorageId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ball[ID=" + id + ", Color=" + color + ", Size=" + size + "]";
    }
}
