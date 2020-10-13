package com.mezonworks.prototype_pattern.with_simple_shapes;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square...");
    }
}
