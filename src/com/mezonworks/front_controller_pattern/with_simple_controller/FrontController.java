package com.mezonworks.front_controller_pattern.with_simple_controller;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticateUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchedRequest(String request) {
        trackRequest(request);

        if(isAuthenticateUser()) {
            dispatcher.dispatch(request);
        }
    }
}
