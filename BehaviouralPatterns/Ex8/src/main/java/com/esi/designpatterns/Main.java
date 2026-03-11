package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String roman = "MMXIV"; // 2014
        Context context = new Context(roman);

        List<Expression> tree = new ArrayList<>();
        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());

        System.out.println("Interpreting Roman Numeral: " + roman);
        
        for (Expression exp : tree) {
            exp.interpret(context);
        }

        System.out.println("Decimal Result: " + context.getOutput());

        // Test with another number
        String roman2 = "MCMXCIV"; // 1994
        context = new Context(roman2);
        for (Expression exp : tree) {
            exp.interpret(context);
        }
        System.out.println("Interpreting " + roman2 + ": " + context.getOutput());
    }
}
