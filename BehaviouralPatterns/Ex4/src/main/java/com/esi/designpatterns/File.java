package com.esi.designpatterns;

public class File extends FileSystemComponent {
    private int size;

    public File(String name, String owner, int size) {
        super(name, owner);
        this.size = size;
    }

    public int getSize() { return size; }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
