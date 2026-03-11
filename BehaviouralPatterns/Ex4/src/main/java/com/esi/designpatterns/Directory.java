package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name, String owner) {
        super(name, owner);
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public List<FileSystemComponent> getChildren() {
        return children;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (FileSystemComponent child : children) {
            child.accept(visitor);
        }
    }
}
