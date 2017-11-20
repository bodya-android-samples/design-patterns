package ru.popov.bodya.polymorphism;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle erase");
    }

}
