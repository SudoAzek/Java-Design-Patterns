package com.mezonworks.proxy_pattern.with_simple_image;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_1mb.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
