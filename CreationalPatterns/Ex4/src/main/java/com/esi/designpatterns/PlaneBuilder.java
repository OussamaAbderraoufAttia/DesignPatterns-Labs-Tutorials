package com.esi.designpatterns;

public class PlaneBuilder {
    private int health = 50;
    private int speed = 10;
    private int power = 5;

    public PlaneBuilder withHealth(int health) {
        this.health = health;
        return this;
    }

    public PlaneBuilder withSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public PlaneBuilder withPower(int power) {
        this.power = power;
        return this;
    }

    public Plane build() {
        return new Plane(health, speed, power);
    }
}
