# Exercise 6: Flyweight Pattern

## 1. Design Pattern Identification
The **Flyweight Pattern** is used to reduce the number of small objects managed by the system.

### Why?
By separating the **intrinsic state** (data common to all instances like name and description) from the **extrinsic state** (data specific to a situation like the selling price in a specific order), we can share a single instance of `VehicleOption` across many orders.

## 2. Correspondence Table

| Pattern Element | Exercise 6 Element | Role in Situation |
| :--- | :--- | :--- |
| **Flyweight** | `VehicleOption` | Contains `name` and `description` (shared data). |
| **FlyweightFactory** | `OptionFactory` | Manages the pool of unique options. |
| **Intrinsic State** | `name`, `description` | Data that remains the same for every vehicle. |
| **Extrinsic State** | `sellingPrice` | Data that varies between orders and is passed to the Flyweight. |
| **Client** | `VehicleOrder` | Stores the mapping of options to their specific prices. |

---

## 3. Implementation
The implementation uses an `OptionFactory` to ensure only one instance of each option exists in memory, while `VehicleOrder` manages the order-specific pricing.

### How to Run
```bash
javac -d target/classes src/main/java/com/esi/designpatterns/*.java
java -cp target/classes com.esi.designpatterns.Main
```
