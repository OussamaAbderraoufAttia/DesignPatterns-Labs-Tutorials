package com.esi.designpatterns;

public class SizeVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        // Directories themselves don't have size in this model
    }

    public int getTotalSize() {
        return totalSize;
    }
}
