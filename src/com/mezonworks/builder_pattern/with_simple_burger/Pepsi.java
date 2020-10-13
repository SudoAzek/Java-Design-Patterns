package com.mezonworks.builder_pattern.with_simple_burger;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.0f;
    }
}
