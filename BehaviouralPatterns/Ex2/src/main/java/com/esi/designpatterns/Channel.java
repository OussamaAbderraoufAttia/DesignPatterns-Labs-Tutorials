package com.esi.designpatterns;

public class Channel {
    private int number;
    private String name;

    public Channel(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Channel " + number + ": " + name;
    }
}
