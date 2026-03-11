package com.esi.designpatterns;

import java.util.HashMap;
import java.util.Map;

public class DictProxy implements Dictionary {
    private DictPersistant realDict;
    private Map<String, Object> cache = new HashMap<>();

    public DictProxy() {
        this.realDict = new DictPersistant();
    }

    @Override
    public boolean add(String key, Object value) {
        boolean success = realDict.add(key, value);
        if (success) {
            cache.put(key, value); // Cache newly added objects
        }
        return success;
    }

    @Override
    public Object get(String key) throws KeyNotFoundException {
        if (cache.containsKey(key)) {
            System.out.println("[Proxy] Returning cached object for key: " + key);
            return cache.get(key);
        }

        // Cache miss: load from real system
        Object value = realDict.get(key);
        cache.put(key, value); 
        return value;
    }
}
