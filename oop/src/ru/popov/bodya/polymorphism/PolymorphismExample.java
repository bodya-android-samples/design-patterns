package ru.popov.bodya.polymorphism;

public class PolymorphismExample {

    public static void main(String[] args) {
        Shape circleShape = new Circle();
        Shape triangleShape = new Triangle();
        test(circleShape);
        test(triangleShape);
    }

    private static void test(Shape shape) {
        shape.draw();
        shape.erase();
    }

}
