package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        Dictionary dict = new DictProxy();

        System.out.println("--- 1. Adding objects ---");
        dict.add("user1", "Oussama");
        dict.add("config", "SystemSettings");

        System.out.println("\n--- 2. Accessing objects (first time) ---");
        // Already in cache because it was added through proxy
        System.out.println("Get user1: " + dict.get("user1"));

        System.out.println("\n--- 3. Accessing objects (cached) ---");
        System.out.println("Get user1 again: " + dict.get("user1"));
        System.out.println("Get config: " + dict.get("config"));

        System.out.println("\n--- 4. Error handling ---");
        try {
            dict.get("unknown");
        } catch (KeyNotFoundException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
