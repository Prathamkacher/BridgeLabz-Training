package com.annotationsandreflection.annotations.useoverride;

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
