# Exercise 2

## Problem

Build a query generator that supports multiple query languages (SQL, OQL, SPARQL). Each language has different syntax but uses the same input data (SELECT, FROM, WHERE). Need a way to construct queries of different syntaxes using the same interface.

## Solution

Use the **Builder Pattern** with an abstract builder class. Each query language extends the builder with its own syntax implementation. The builder constructs the query step-by-step using fluent methods.

## Pattern Used

**Builder Pattern**

- `QueryGenerator`: Abstract builder class (defines query construction steps)
- `SQLQueryGenerator`, `OQLQueryGenerator`, `SPARQLQueryGenerator`: Concrete builders (implement language-specific syntax)
- `Request`: Final built object
- `select()`, `from()`, `where()`: Builder methods for step-by-step construction

## Why Builder Pattern?

- **Separation**: Construction logic separated from representation
- **Flexibility**: Different query languages with same interface
- **Readability**: Fluent methods make code intuitive
- **Extensibility**: Easy to add new query languages

## Key Concepts

1. **Abstract Builder**: Base class with common building logic
2. **Concrete Builders**: Language-specific implementations
3. **Product**: Final Request object
4. **Fluent Interface**: Methods return `this` for chaining

## How to Run

```bash
cd Ex2
mvn clean compile
mvn exec:java -Dexec.mainClass="com.esi.designpatterns.Main"
```

## Output

```
SQL: SELECT person.id, person.name FROM person
OQL: SELECT p.id, p.name FROM Person p
SPARQL: SELECT ?id, ?name FROM ?person
```

## Extension: Singleton Query Generators

Each query generator should be unique (one per language):
- Implement Singleton pattern in each concrete builder
- Use static instances for SQL, OQL, SPARQL generators
- Ensure only one instance per language throughout the application
