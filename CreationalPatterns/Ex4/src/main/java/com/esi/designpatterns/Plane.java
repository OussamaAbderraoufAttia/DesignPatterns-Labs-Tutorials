package com.esi.designpatterns;

public class Plane implements Cloneable {
    private int health;
    private int speed;
    private int power;

    public Plane(int health, int speed, int power) {
        this.health = health;
        this.speed = speed;
        this.power = power;
    }

    @Override
    public Plane clone() {
        try {
            return (Plane) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Plane(this.health, this.speed, this.power);
        }
    }

    @Override
    public String toString() {
        return "Plane{health=" + health + ", speed=" + speed + ", power=" + power + "}";
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }
}
