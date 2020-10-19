package com.mezonworks.chain_of_responsibility_pattern.with_simple_logger;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
    this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
