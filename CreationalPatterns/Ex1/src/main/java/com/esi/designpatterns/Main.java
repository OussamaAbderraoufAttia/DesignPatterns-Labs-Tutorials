package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        AnimalU catCreator = new CatU();
        Animal cat1 = catCreator.instantiateAnimal();
        cat1.makeSound();

        Animal cat2 = catCreator.instantiateAnimal();
        cat2.makeSound();

        System.out.println("Same instance: " + (cat1 == cat2));

        System.out.println();

        AnimalU dogCreator = new DogU();
        Animal dog1 = dogCreator.instantiateAnimal();
        dog1.makeSound();

        Animal dog2 = dogCreator.instantiateAnimal();
        dog2.makeSound();

        System.out.println("Same instance: " + (dog1 == dog2));
    }
}
