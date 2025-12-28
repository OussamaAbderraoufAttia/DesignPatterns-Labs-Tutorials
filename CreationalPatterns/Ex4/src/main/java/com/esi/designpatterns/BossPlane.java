package com.esi.designpatterns;

public class BossPlane implements Enemy {
    private int speed = 8;
    private int power = 10;
    private int shield = 8;

    @Override
    public void attack() {
        System.out.println("Boss Plane attacking with power " + power);
    }

    @Override
    public String getType() {
        return "BossPlane";
    }
}
