package com.esi.designpatterns;

public class Bee implements Observer {
    @Override
    public void update(boolean isOpen) {
        if (isOpen) {
            System.out.println("Bee: it's time to eat");
        } else {
            System.out.println("Bee: it's time to sleep");
        }
    }
}
