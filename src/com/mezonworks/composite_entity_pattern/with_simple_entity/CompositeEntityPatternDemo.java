package com.mezonworks.composite_entity_pattern.with_simple_entity;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
