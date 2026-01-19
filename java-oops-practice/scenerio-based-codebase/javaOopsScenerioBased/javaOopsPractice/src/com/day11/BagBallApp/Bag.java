import java.util.ArrayList;
import java.util.List;

class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;

    // Composition: Bag HAS-A list of Balls
    private List<Ball> balls;

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBallCount() {
        return balls.size();
    }

    // Interface method
    @Override
    public String getStorageId() {
        return id;
    }

    // Add ball with validation
    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("❌ Bag " + id + " is full.");
            return;
        }
        balls.add(ball);
        System.out.println("✅ Ball added to Bag " + id);
    }

    // Remove ball
    public void removeBall(String ballId) {
        for (Ball b : balls) {
            if (b.getId().equals(ballId)) {
                balls.remove(b);
                System.out.println("🗑 Ball removed from Bag " + id);
                return;
            }
        }
        System.out.println("⚠ Ball not found in Bag " + id);
    }

    // Display all balls
    public void displayBalls() {
        System.out.println("\nBalls inside Bag " + id + ":");
        if (balls.isEmpty()) {
            System.out.println("No balls present.");
        } else {
            for (Ball b : balls) {
                System.out.println(b);
            }
        }
    }
}