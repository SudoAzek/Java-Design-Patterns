package com.mezonworks.visitor_pattern.with_simple_computer_parts;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
