package com.mezonworks.service_locator_pattern.with_simple_service;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String name) {
        Service service = cache.getService(name);

        if(service != null) {
            return service;
        }

        InitializeContext context = new InitializeContext();
        Service service1 = (Service)context.lookup(name);
        cache.addService(service1);
        return service1;
    }
}
