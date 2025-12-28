package com.esi.designpatterns;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
