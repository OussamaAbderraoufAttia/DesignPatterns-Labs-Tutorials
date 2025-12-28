package com.esi.designpatterns;

public class CatU extends AnimalU {
    @Override
    public Animal instantiateAnimal() {
        if (instances.containsKey("Cat")) {
            return instances.get("Cat");
        } else {
            Cat c = new Cat();
            AnimalU.instances.put("Cat", c);
            return c;
        }
    }
}
