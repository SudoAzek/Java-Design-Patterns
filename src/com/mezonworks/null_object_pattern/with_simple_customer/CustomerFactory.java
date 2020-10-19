package com.mezonworks.null_object_pattern.with_simple_customer;

public class CustomerFactory {
    public static final String[] names = {"Azamat", "Jamshid", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
