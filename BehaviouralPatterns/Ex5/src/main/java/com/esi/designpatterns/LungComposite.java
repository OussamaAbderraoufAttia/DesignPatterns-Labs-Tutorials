package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.List;

// Component
interface LungComponent {
    void simulateAirflow();
}

// Leaf
class Alveolus implements LungComponent {
    private String id;

    public Alveolus(String id) {
        this.id = id;
    }

    @Override
    public void simulateAirflow() {
        System.out.println("  Alveolus " + id + ": Exchanging oxygen.");
    }
}

// Composite
class Airway implements LungComponent {
    private String name;
    private List<LungComponent> children = new ArrayList<>();

    public Airway(String name) {
        this.name = name;
    }

    public void add(LungComponent component) {
        children.add(component);
    }

    @Override
    public void simulateAirflow() {
        System.out.println("Air passing through " + name + "...");
        for (LungComponent child : children) {
            child.simulateAirflow();
        }
    }
}
