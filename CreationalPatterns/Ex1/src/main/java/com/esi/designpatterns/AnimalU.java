package com.esi.designpatterns;

import java.util.HashMap;
import java.util.Map;

public abstract class AnimalU {
    public static Map<String, Animal> instances = new HashMap<>();

    public abstract Animal instantiateAnimal();
}
