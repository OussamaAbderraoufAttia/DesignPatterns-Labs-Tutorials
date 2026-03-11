package com.esi.designpatterns;

public class DoorDisplay implements Observer {
    @Override
    public void update(String status) {
        System.out.println("[GUI DISPLAY] Door Status: " + status);
    }
}
