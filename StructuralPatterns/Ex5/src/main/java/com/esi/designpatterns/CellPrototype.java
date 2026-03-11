package com.esi.designpatterns;

// Prototype interface
interface Cell extends Cloneable {
    Cell split();
    void display();
}

// Concrete Prototype
class BiologicalCell implements Cell {
    private String geneticInfo;
    private String type;

    public BiologicalCell(String type, String geneticInfo) {
        this.type = type;
        this.geneticInfo = geneticInfo;
    }

    @Override
    public Cell split() {
        try {
            System.out.println("Cell dividing...");
            return (BiologicalCell) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void display() {
        System.out.println("Cell Type: " + type + ", Genetic Info Hash: " + geneticInfo.hashCode());
    }
}
