package com.esi.designpatterns;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}
