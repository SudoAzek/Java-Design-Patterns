package com.mezonworks.prototype_pattern.with_simple_shapes;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }
}
