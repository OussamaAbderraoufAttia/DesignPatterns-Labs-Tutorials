package com.esi.designpatterns;

public abstract class FileSystemComponent {
    protected String name;
    protected String owner;

    public FileSystemComponent(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() { return name; }
    public String getOwner() { return owner; }

    public abstract void accept(FileSystemVisitor visitor);
}
