package com.esi.designpatterns;

public class DogU extends AnimalU {
    @Override
    public Animal instantiateAnimal() {
        if (instances.containsKey("Dog")) {
            return instances.get("Dog");
        } else {
            Dog d = new Dog();
            AnimalU.instances.put("Dog", d);
            return d;
        }
    }
}
