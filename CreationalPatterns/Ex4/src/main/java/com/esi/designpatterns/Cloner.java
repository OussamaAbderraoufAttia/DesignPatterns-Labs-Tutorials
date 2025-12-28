package com.esi.designpatterns;

public class Cloner implements Bonus {
    @Override
    public void apply() {
        System.out.println("Cloner bonus: creating duplicate plane");
    }

    @Override
    public String getType() {
        return "Cloner";
    }
}
