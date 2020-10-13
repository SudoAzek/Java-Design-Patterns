package com.mezonworks.factory_pattern.with_simple_computer;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 Ghz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 Ghz");
        System.out.println("Factory PC Config: " + pc);
        System.out.println("Factory Server Config: " + server);
    }
}
