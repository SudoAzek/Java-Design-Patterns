package com.mezonworks.strategy_pattern.with_simple_operations;

public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
