package com.mezonworks.mediator_pattern.with_simple_user;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User azamat = new User("Azamat");
        User jamshid = new User("Jamshid");

        azamat.sendMessage("Hi! Azamat!");
        jamshid.sendMessage("Hello! Jamshid!");
    }
}
