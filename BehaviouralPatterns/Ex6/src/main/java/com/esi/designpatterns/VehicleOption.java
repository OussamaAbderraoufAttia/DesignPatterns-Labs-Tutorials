package com.esi.designpatterns;

// Flyweight class
public class VehicleOption {
    private final String name;
    private final String description;

    // Package-private constructor to force use of factory
    VehicleOption(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Displays the option with its extrinsic state (price)
    public void display(double sellingPrice) {
        System.out.println("Option: " + name + " (" + description + ") - Price: " + sellingPrice + " DA");
    }

    public String getName() {
        return name;
    }
}
