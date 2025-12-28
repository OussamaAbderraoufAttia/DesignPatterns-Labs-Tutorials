package com.esi.designpatterns;

public class Helicopter implements Enemy {
    private int speed = 5;
    private int power = 3;
    private int shield = 2;

    @Override
    public void attack() {
        System.out.println("Helicopter attacking with power " + power);
    }

    @Override
    public String getType() {
        return "Helicopter";
    }
}
