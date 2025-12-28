# Exercise 1

## Problem

Analyze the given code that creates animals (Cat, Dog) using an abstract creator class that maintains instances in a static HashMap. Understand why the `instances` attribute is needed and identify the design pattern being used.

## Solution

The code uses a combination of **Factory Method** and **Singleton-like** pattern. Each animal type (Cat, Dog) is created through a specific creator (CatU, DogU), and the static `instances` map ensures only one instance of each animal type exists.

## Pattern Used

**Factory Method + Object Pool (Singleton per Type)**

- `AnimalU`: Abstract creator (defines factory method)
- `CatU`, `DogU`: Concrete creators (implement factory method)
- Static `instances` map: Ensures one instance per animal type
- `instantiateAnimal()`: Factory method that returns existing or creates new instance

## Why Use Instances Attribute?

The `instances` attribute ensures:
- Only one instance of each animal type exists
- Subsequent requests return the same instance
- Memory efficiency through reuse
- Consistent state across application

## Better Solution Without Instances

Use a pure **Singleton Factory** or **Registry Pattern** to maintain single instances more elegantly, avoiding static mutable collections.

## Key Concepts

1. **Factory Method**: Subclasses decide which Animal to instantiate
2. **Object Pool**: Reuse instances instead of creating new ones
3. **Singleton per Type**: One instance per animal class
4. **Registry Pattern**: Central map stores created instances

## How to Run

```bash
cd Ex1
mvn clean compile
mvn exec:java -Dexec.mainClass="com.esi.designpatterns.Main"
```

## Output

```
Meow
Meow
Same instance: true

Woof
Woof
Same instance: true
```

## Key Takeaways

- Factory Method decouples object creation from usage
- Static registry prevents duplicate object creation
- Same instance returned on subsequent calls ensures consistency
