package com.mezonworks.interpreter_pattern.with_simple_expressions;

public class InterpreterPatternDemo {

    public static Expression getMaleExpression() {
        Expression azamat = new TerminalExpression("Azamat");
        Expression jamshid = new TerminalExpression("Jamshid");
        return new OrExpression(azamat, jamshid);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Jamshid is male? " + isMale.interpret("Jamshid"));
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));
    }
}
