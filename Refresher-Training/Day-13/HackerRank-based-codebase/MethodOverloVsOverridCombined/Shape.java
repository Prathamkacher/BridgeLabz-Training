package MethodOverloVsOverridCombined;

public class Shape {
    void draw() {
        System.out.println("Drawing a Shape");
    }
}

class Shape2D extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a 2D Shape");
    }

    void draw(String color) {
        System.out.println("Drawing a 2D Shape in " + color + " color");
    }
}
