package com.mezonworks.chain_of_responsibility_pattern.with_simple_logger;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console: Logger: " + message);
    }
}
