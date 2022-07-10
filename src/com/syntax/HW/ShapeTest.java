package com.syntax.HW;

public class ShapeTest {
    public static void main(String[] args) {
        Shape [] shape={new Circle(), new Square()};
        for (Shape shapes:shape) {
            shapes.calculateArea();
            shapes.calculatePerimetr();
        }
    }
}
