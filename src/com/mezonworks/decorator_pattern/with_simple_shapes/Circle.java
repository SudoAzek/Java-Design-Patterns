package com.mezonworks.decorator_pattern.with_simple_shapes;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }
}
