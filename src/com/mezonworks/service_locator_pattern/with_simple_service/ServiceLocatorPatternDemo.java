package com.mezonworks.service_locator_pattern.with_simple_service;

public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();

        service = ServiceLocator.getService("Service2");
        service.execute();

        service = ServiceLocator.getService("Service1");
        service.execute();

        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
