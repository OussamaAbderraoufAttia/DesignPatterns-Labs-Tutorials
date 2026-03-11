package com.esi.designpatterns;

public class ThousandExpression extends Expression {
    @Override public String one() { return "M"; }
    @Override public String four() { return " "; } // Not applicable
    @Override public String five() { return " "; } // Not applicable
    @Override public String nine() { return " "; } // Not applicable
    @Override public int multiplier() { return 1000; }
}
