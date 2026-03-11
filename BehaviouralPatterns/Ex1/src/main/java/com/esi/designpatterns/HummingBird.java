package com.esi.designpatterns;

public class HummingBird implements Observer {
    @Override
    public void update(boolean isOpen) {
        if (isOpen) {
            System.out.println("HummingBird: it's time to eat");
        } else {
            System.out.println("HummingBird: it's time to sleep");
        }
    }
}
