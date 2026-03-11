# Behavioral Design Patterns - Tutorial 4

This directory contains the implementations for 9 exercises covering various Behavioral design patterns in Java.

## Exercises Overview

| Exercise | Pattern(s) | Scenario |
| :--- | :--- | :--- |
| [Ex 1](./Ex1) | **Observer** | Flower observation system (Bees/Hummingbirds). |
| [Ex 2](./Ex2) | **Iterator** | TV remote control navigation system. |
| [Ex 3](./Ex3) | **State**, **Observer** | Carousel door controller with state-dependent transitions. |
| [Ex 4](./Ex4) | **Composite**, **Visitor** | File system size and count calculations. |
| [Ex 5](./Ex5) | **Strategy** | Multi-country tax calculation logic. |
| [Ex 6](./Ex6) | **CoR**, **Factory** | Credit card type identification and instantiation. |
| [Ex 7](./Ex7) | **Mediator** | Chat room centralized communication system. |
| [Ex 8](./Ex8) | **Interpreter** | Roman numerals to decimal conversion. |
| [Ex 9](./Ex9) | **Chain of Responsibility** | Automatic mail sorting based on content keywords. |

## How to Run
Each exercise has its own sub-directory with a `pom.xml`. You can run the `Main` class in any exercise:
1. Navigate to the exercise folder (e.g., `cd Ex1`).
2. Compile and run:
   ```bash
   javac -d target/classes src/main/java/com/esi/designpatterns/*.java
   java -cp target/classes com.esi.designpatterns.Main
   ```

## Documentation
Each exercise folder contains a `README.md` with:
- Detailed justifications for pattern choices.
- Pattern correspondence tables.
- UML class diagrams (Mermaid).
- Implementation details.
