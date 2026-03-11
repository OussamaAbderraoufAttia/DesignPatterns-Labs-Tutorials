package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        // 1. Flyweight: DNA
        System.out.println("--- 1. DNA Chain (Flyweight) ---");
        String sequence = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        System.out.println("Building chain of " + sequence.length() + " nucleotides...");
        for (char c : sequence.toCharArray()) {
            NucleotideFactory.getNucleotide(c).display(0);
        }
        System.out.println("\nNumber of unique Nucleotide objects created: " + NucleotideFactory.getPoolSize());

        // 2. Prototype: Cells
        System.out.println("\n--- 2. Cell Division (Prototype) ---");
        BiologicalCell motherCell = new BiologicalCell("Skin Cell", "ATGC...");
        motherCell.display();
        
        BiologicalCell daughter1 = (BiologicalCell) motherCell.split();
        BiologicalCell daughter2 = (BiologicalCell) motherCell.split();
        
        daughter1.display();
        daughter2.display();
        System.out.println("Daughter 1 is same object as Mother: " + (daughter1 == motherCell));

        // 3. Composite: Lungs
        System.out.println("\n--- 3. Lung Structure (Composite) ---");
        Airway trachea = new Airway("Trachea");
        Airway leftBronchus = new Airway("Left Bronchus");
        Airway rightBronchus = new Airway("Right Bronchus");
        
        trachea.add(leftBronchus);
        trachea.add(rightBronchus);
        
        leftBronchus.add(new Alveolus("L1"));
        leftBronchus.add(new Alveolus("L2"));
        rightBronchus.add(new Alveolus("R1"));
        
        trachea.simulateAirflow();
    }
}
