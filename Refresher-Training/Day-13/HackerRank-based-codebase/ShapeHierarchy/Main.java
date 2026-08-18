package ShapeHierarchy;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(10, 4),
                new Triangle(6, 8)
        };

        for (Shape s : shapes) {
            System.out.println("area = " + s.area());
        }
    }
}