package MethodOverloVsOverridCombined;

public class Main {
    public static void main(String[] args) {
        Shape2D s = new Shape2D();

        s.draw();
        s.draw("Black");
    }
}
