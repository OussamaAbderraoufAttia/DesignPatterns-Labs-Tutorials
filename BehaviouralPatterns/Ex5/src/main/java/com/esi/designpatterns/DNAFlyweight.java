package com.esi.designpatterns;

import java.util.HashMap;
import java.util.Map;

// Flyweight: Nucleotide
class Nucleotide {
    private final char type; // C, G, A, or T (intrinsic state)

    public Nucleotide(char type) {
        this.type = type;
    }

    public void display(int position) {
        System.out.print(type);
    }
}

// Flyweight Factory
class NucleotideFactory {
    private static final Map<Character, Nucleotide> pool = new HashMap<>();

    public static Nucleotide getNucleotide(char type) {
        Nucleotide nucleotide = pool.get(type);
        if (nucleotide == null) {
            nucleotide = new Nucleotide(type);
            pool.put(type, nucleotide);
        }
        return nucleotide;
    }

    public static int getPoolSize() {
        return pool.size();
    }
}
