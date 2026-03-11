package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower();
        
        Bee b1 = new Bee();
        HummingBird h1 = new HummingBird();
        
        rose.addObserver(b1);
        rose.addObserver(h1);
        
        System.out.println("--- Opening the flower ---");
        rose.setState(true);
        
        System.out.println("\n--- Closing the flower ---");
        rose.setState(false);
    }
}
