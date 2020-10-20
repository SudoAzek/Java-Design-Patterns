package com.mezonworks.service_locator_pattern.with_simple_service;

public class InitializeContext {
    public Object lookup(String name) {
        if (name.equalsIgnoreCase("SERVICE1")) {
            System.out.println("looking up and creating a new Service1 object");
            return new Service1();
        }
        else if (name.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }

        return null;
    }
}
