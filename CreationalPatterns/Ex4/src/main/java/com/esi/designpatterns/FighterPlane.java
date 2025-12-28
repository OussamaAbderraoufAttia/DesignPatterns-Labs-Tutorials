package com.esi.designpatterns;

public class FighterPlane implements Enemy {
    private int speed = 12;
    private int power = 7;
    private int shield = 5;

    @Override
    public void attack() {
        System.out.println("Fighter Plane attacking with power " + power);
    }

    @Override
    public String getType() {
        return "FighterPlane";
    }
}
