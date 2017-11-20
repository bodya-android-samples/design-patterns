package ru.popov.bodya.polymorphism;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle draw");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase");
    }
}
