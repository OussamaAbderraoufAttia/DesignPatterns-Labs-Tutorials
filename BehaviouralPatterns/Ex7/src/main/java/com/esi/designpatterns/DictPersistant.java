package com.esi.designpatterns;

import java.util.HashMap;
import java.util.Map;

public class DictPersistant implements Dictionary {
    private Map<String, Object> storage = new HashMap<>();

    @Override
    public boolean add(String key, Object value) {
        if (storage.containsKey(key)) {
            return false;
        }
        storage.put(key, value);
        System.out.println("[Disk] Object added with key: " + key);
        return true;
    }

    @Override
    public Object get(String key) throws KeyNotFoundException {
        System.out.println("[Disk] Reading key from storage: " + key + "...");
        if (!storage.containsKey(key)) {
            throw new KeyNotFoundException(key);
        }
        return storage.get(key);
    }
}
