# Behavioural Patterns

## 📌 Overview

Behavioural patterns are concerned with the assignment of responsibilities between objects and the distribution of behavior. They describe not just patterns of objects or classes but the communication patterns between them. These patterns are particularly useful for describing complex control flows that are difficult to follow at runtime.

## 🎯 Patterns Covered

### 1. **Chain of Responsibility**
- **Purpose**: Pass requests along a chain of handlers where each handler can process the request or pass it along
- **Use Cases**: Event handling systems, logging frameworks, approval workflows

### 2. **Command**
- **Purpose**: Encapsulate a request as an object, allowing parameterization of clients with different requests
- **Use Cases**: Undo/redo functionality, task scheduling, macro recording

### 3. **Interpreter**
- **Purpose**: Define a representation for a grammar and create an interpreter to interpret sentences in the language
- **Use Cases**: Domain-specific languages, query parsers, expression evaluators

### 4. **Iterator**
- **Purpose**: Provide a way to access elements of an aggregate object sequentially without exposing its representation
- **Use Cases**: Traversing collections, stream processing, lazy evaluation

### 5. **Mediator**
- **Purpose**: Define an object that encapsulates how a set of objects interact
- **Use Cases**: Dialog boxes, event handling, air traffic control systems

### 6. **Memento**
- **Purpose**: Capture and externalize an object's internal state without violating encapsulation
- **Use Cases**: Undo/redo mechanisms, snapshots, save points in games

### 7. **Observer (Pub-Sub)**
- **Purpose**: Define a one-to-many dependency between objects where when one object changes state, all dependents are notified
- **Use Cases**: Event notification systems, real-time data updates, model-view patterns

### 8. **State**
- **Purpose**: Allow an object to alter its behavior when its internal state changes
- **Use Cases**: State machines, workflow engines, game state management

### 9. **Strategy**
- **Purpose**: Define a family of algorithms, encapsulate each one, and make them interchangeable
- **Use Cases**: Payment processing, sorting algorithms, compression algorithms

### 10. **Template Method**
- **Purpose**: Define the skeleton of an algorithm in a base class, letting subclasses override specific steps
- **Use Cases**: Framework design, data processing pipelines, document processing

### 11. **Visitor**
- **Purpose**: Represent an operation to be performed on elements of an object structure
- **Use Cases**: Compiler design, tree traversal, reporting systems

## 📂 Contents

Each pattern includes:
- Detailed explanation of the pattern
- UML diagrams
- Real-world examples
- Implementation exercises
- Best practices and anti-patterns

## 🚀 Getting Started

1. Start with understanding the basics of object-oriented design
2. Review each pattern's problem statement
3. Study the provided implementations
4. Practice implementing the patterns in exercises
5. Analyze real-world code for pattern usage

## 💡 Key Takeaways

- Behavioural patterns help manage complex object interactions
- They promote loose coupling and high cohesion
- Each pattern solves specific communication problems
- Understanding these patterns improves code maintainability and flexibility

## 📚 References

- [**Refactoring.Guru - Behavioural Patterns**](https://refactoring.guru/design-patterns/behavioral) - Comprehensive guide with interactive examples
- Gang of Four (GoF) Design Patterns book
- Course materials from Mme BOUSBIA
- Practical examples and tutorials

---

**Status**: ✅ Completed  
**Last Updated**: December 2025
