# Structural Patterns

## 📌 Overview

Structural patterns deal with object composition, creating new functionality by combining objects and classes. They help ensure that when one part changes, the entire structure doesn't need to change, making systems more flexible and efficient.

These patterns focus on how classes and objects can be composed to form larger structures while keeping these structures flexible and efficient.

## 🎯 Patterns Covered

### 1. **Adapter (Wrapper)**
- **Purpose**: Convert the interface of a class into another interface clients expect, allowing incompatible interfaces to work together
- **Use Cases**: Legacy system integration, third-party library adaptation, interface compatibility

### 2. **Bridge**
- **Purpose**: Decouple an abstraction from its implementation so the two can vary independently
- **Use Cases**: Cross-platform applications, graphics drivers, device abstraction layers

### 3. **Composite**
- **Purpose**: Compose objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly
- **Use Cases**: File system hierarchies, GUI component trees, organization structures

### 4. **Decorator**
- **Purpose**: Attach additional responsibilities to an object dynamically, providing a flexible alternative to subclassing
- **Use Cases**: UI component enhancement, data stream processing, logging and caching

### 5. **Facade**
- **Purpose**: Provide a unified, simplified interface to a set of interfaces in a subsystem
- **Use Cases**: API simplification, library interfaces, system abstraction layers

### 6. **Flyweight**
- **Purpose**: Use sharing to support large numbers of fine-grained objects efficiently
- **Use Cases**: Text editors (character objects), game sprites, memory-intensive applications

### 7. **Proxy**
- **Purpose**: Provide a surrogate or placeholder for another object to control access to it
- **Use Cases**: Remote object access, lazy loading, access control, caching

## 📂 Contents

Each pattern includes:
- Problem description and context
- Pattern intent and benefits
- Structure diagrams (UML)
- Implementation examples in different languages
- When to use and when to avoid
- Trade-offs and considerations
- Practical lab exercises

## 🚀 Getting Started

1. Review the class/object relationships in each pattern
2. Understand the intent and benefits
3. Study provided implementations
4. Practice creating variations
5. Identify patterns in existing code

## 💡 Key Takeaways

- Structural patterns improve code flexibility and maintainability
- They help manage object composition and relationships
- They enable code reuse through composition over inheritance
- Understanding these patterns helps in designing robust systems

## 🔄 Pattern Relationships

- **Adapter vs Bridge**: Adapter connects incompatible interfaces; Bridge decouples abstraction from implementation
- **Decorator vs Proxy**: Decorator adds functionality; Proxy controls access
- **Composite vs Decorator**: Composite builds tree structures; Decorator enhances individual objects
- **Facade vs Adapter**: Facade simplifies interfaces; Adapter makes incompatible interfaces compatible

## ⚠️ Common Mistakes

- Over-engineering simple scenarios with unnecessary patterns
- Confusing similar patterns (e.g., Decorator vs Proxy)
- Creating deep wrapper chains that hurt performance
- Not considering the Single Responsibility Principle

## 📚 References

- [**Refactoring.Guru - Structural Patterns**](https://refactoring.guru/design-patterns/structural) - Comprehensive guide with interactive examples
- Gang of Four (GoF) Design Patterns book
- Course materials from Mme BOUSBIA
- Real-world case studies and examples

---

**Status**: ✅ Completed  
**Last Updated**: December 2025
