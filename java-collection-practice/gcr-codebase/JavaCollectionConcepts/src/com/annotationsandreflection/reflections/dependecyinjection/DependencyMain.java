package com.annotationsandreflection.reflections.dependecyinjection;

public class DependencyMain {

    public static void main(String[] args) throws Exception {

        Car car = DIContainer.create(Car.class);
        car.drive();
    }
}
