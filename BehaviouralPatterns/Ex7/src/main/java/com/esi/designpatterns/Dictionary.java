package com.esi.designpatterns;

public interface Dictionary {
    boolean add(String key, Object value);
    Object get(String key) throws KeyNotFoundException;
}
