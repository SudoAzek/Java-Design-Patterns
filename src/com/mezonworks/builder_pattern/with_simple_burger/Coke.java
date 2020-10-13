package com.mezonworks.builder_pattern.with_simple_burger;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 1.2f;
    }
}
