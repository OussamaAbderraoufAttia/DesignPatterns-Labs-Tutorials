package com.esi.designpatterns;

public class ShieldBooster implements Bonus {
    @Override
    public void apply() {
        System.out.println("Shield Booster activated");
    }

    @Override
    public String getType() {
        return "ShieldBooster";
    }
}
