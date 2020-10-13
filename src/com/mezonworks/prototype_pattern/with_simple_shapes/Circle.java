package com.mezonworks.prototype_pattern.with_simple_shapes;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}
