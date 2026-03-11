package com.esi.designpatterns;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class OptionFactory {
    private Map<String, VehicleOption> pool = new HashMap<>();

    public VehicleOption getOption(String name) {
        if (!pool.containsKey(name)) {
            // In a real system, description would come from a database
            pool.put(name, new VehicleOption(name, "Description for " + name));
        }
        return pool.get(name);
    }

    public int getPoolSize() {
        return pool.size();
    }
}
