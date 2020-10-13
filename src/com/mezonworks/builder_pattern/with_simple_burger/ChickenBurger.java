package com.mezonworks.builder_pattern.with_simple_burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 5.5f;
    }
}
