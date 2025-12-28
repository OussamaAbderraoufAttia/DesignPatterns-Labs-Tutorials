package com.esi.designpatterns;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
