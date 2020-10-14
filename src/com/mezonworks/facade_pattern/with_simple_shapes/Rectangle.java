package com.mezonworks.facade_pattern.with_simple_shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
    }
}
