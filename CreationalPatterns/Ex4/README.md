# Exercise 4

## Problem

Build a 2D arcade game "Plane Action Hero" with multiple levels, enemies, bonuses, and traps. The game needs:
- A central GameEngine (only one instance)
- Different enemies created flexibly
- Complex plane configuration
- Consistent level-specific families of objects
- Ability to duplicate planes

## Solution

Integrate all creational patterns:

**Singleton**: GameEngine - ensures single instance  
**Factory Method**: EnemyFactory - creates different enemies  
**Abstract Factory**: LevelFactory - creates level-specific families  
**Builder**: PlaneBuilder - constructs complex planes  
**Prototype**: Plane - cloneable for duplicates  

## Patterns Used

### A. Singleton Pattern (GameEngine)
- Only one instance throughout the game
- Global access point for game state
- Manages score, level, player plane

### B. Factory Method (EnemyFactory)
- HelicopterFactory, FighterPlaneFactory, BossPlaneFactory
- Client code creates enemies without knowing concrete classes
- Easy to add new enemy types

### C. Abstract Factory (LevelFactory)
- Level1Factory, Level2Factory, Level3Factory
- Creates families of related objects (enemies, bonuses, traps)
- Each level has consistent theme and difficulty
- New levels easily added without modifying existing code

### D. Builder (PlaneBuilder)
- Constructs complex plane with optional attributes
- Readable fluent interface
- Default values for unspecified attributes

### E. Prototype (Plane)
- Implements Cloneable interface
- Can duplicate planes efficiently
- Cloner bonus uses prototype pattern

## How to Run

```bash
cd Ex4
mvn clean compile
mvn exec:java -Dexec.mainClass="com.esi.designpatterns.Main"
```

## Output

```
Starting Level 1
Player Plane: Plane{health=100, speed=15, power=8}

Enemies in Level 1:
  - Helicopter
  Helicopter attacking with power 3

Bonuses in Level 1:
  - ShieldBooster
  Shield Booster activated
  - Missile
  Missile Bonus collected

Traps in Level 1:
  - Bomb

Starting Level 2
...
```

## Design Insights

**Singleton + Factory**: GameEngine controls centralized creation and state
**Factory Method + Abstract Factory**: Progressive creation mechanism from simple to families
**Builder**: Complex object construction made readable
**Prototype**: Efficient object duplication via cloning

## Key Concepts

1. **GameEngine (Singleton)**: Single point of control
2. **EnemyFactory (Factory Method)**: Individual object creation
3. **LevelFactory (Abstract Factory)**: Family of related objects
4. **PlaneBuilder (Builder)**: Complex object construction
5. **Plane (Prototype)**: Object duplication
