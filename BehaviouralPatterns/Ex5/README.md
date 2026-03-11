# Exercise 5: DNA, Cells, and Fractals

This exercise explores how different biological problems can be mapped to GoF design patterns.

## 1. DNA Chain modeling: Flyweight Pattern
**Problem**: How to model a DNA chain with millions of nucleotides (A, C, G, T) without exhausting memory.
**Solution**: The **Flyweight Pattern** allows sharing the four types of nucleotides. Instead of creating a new object for every position in the chain, we reuse the same four instances and only apply extrinsic state (like position) as needed.

## 2. Cell Division simulation: Prototype Pattern
**Problem**: How to simulate a mother cell duplicating its genetic info to divide into two identical daughter cells.
**Solution**: The **Prototype Pattern** is perfect for this. The mother cell acts as a prototype, and the `split()` operation (cloning) creates new cells with the exact same state/genetic information.

## 3. Fractal Lung Structure: Composite Pattern
**Problem**: How to represent a tree-like fractal structure of lungs (trachea -> bronchi -> bronchioles -> alveolus).
**Solution**: The **Composite Pattern** allows treating individual elements (alveoli) and compositions (airways) uniformly. This recursion naturally models the fractal nature of the respiratory system.

---

### UML Diagram Summary (Correspondence)

| Scenario | Pattern | Correspondence |
| :--- | :--- | :--- |
| **DNA** | Flyweight | Type (A,C,G,T) = Intrinsic state; Position = Extrinsic state |
| **Cell** | Prototype | Mother Cell = Prototype; `split()` = `clone()` |
| **Lung** | Composite | Alveolus = Leaf; Airway = Composite |

---

## How to Run
```bash
javac -d target/classes src/main/java/com/esi/designpatterns/*.java
java -cp target/classes com.esi.designpatterns.Main
```
