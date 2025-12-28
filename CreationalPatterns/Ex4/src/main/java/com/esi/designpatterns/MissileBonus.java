package com.esi.designpatterns;

public class MissileBonus implements Bonus {
    @Override
    public void apply() {
        System.out.println("Missile Bonus collected");
    }

    @Override
    public String getType() {
        return "Missile";
    }
}
