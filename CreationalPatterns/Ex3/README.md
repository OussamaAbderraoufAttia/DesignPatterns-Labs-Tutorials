# Exercise 3

## Problem

Extract file names from file paths on different operating systems (Windows uses `\`, Linux uses `/`). Also count the number of folders in a path. Ensure that file parsers and folder counters for the same OS are always used together consistently.

## Solution

Use **Abstract Factory Pattern** to create families of related objects (FileNameParser + CountFolders) for each operating system. This ensures consistency and prevents mixing Windows and Linux components.

## Pattern Used

**Abstract Factory Pattern**

- `OSFactory`: Abstract factory (defines creation of OS-specific components)
- `WindowsFactory`, `LinuxFactory`: Concrete factories (create Windows/Linux components)
- `FileNameParser`: Abstract product (file name extraction)
- `CountFolders`: Abstract product (folder counting)
- Concrete implementations: WindowsFileNameParser, LinuxFileNameParser, WindowsCountFolders, LinuxCountFolders

## Why Abstract Factory?

- **Family Consistency**: All components from same OS are used together
- **Flexibility**: Easy to support new OS families
- **Isolation**: Client code doesn't depend on concrete implementations
- **Prevents Mixing**: Prevents mixing Windows and Linux components

## Progression

1. **Initial**: Simple file parser for Windows path
2. **Factory Method**: Create parsers through factory methods
3. **Abstract Factory**: Add CountFolders and ensure OS consistency

## How to Run

```bash
cd Ex3
mvn clean compile
mvn exec:java -Dexec.mainClass="com.esi.designpatterns.Main"
```

## Output

```
=== Windows Path ===
Path: C:\Windows\System32\hello.dll
File name: hello.dll
Folder count: 3

=== Linux Path ===
Path: /user/share/hello.rc
File name: hello.rc
Folder count: 2
```

## Key Concepts

1. **Abstract Factory**: Creates families of related objects
2. **Product Families**: FileNameParser + CountFolders grouped by OS
3. **Consistency**: All components from same factory are compatible
4. **Extensibility**: New OS families easily added without modifying existing code
