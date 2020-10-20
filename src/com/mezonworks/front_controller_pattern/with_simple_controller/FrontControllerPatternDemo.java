package com.mezonworks.front_controller_pattern.with_simple_controller;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchedRequest("HOME");
        frontController.dispatchedRequest("STUDENT");
    }
}
