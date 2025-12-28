package com.esi.designpatterns;

public class LinuxFactory implements OSFactory {
    @Override
    public FileNameParser createFileNameParser() {
        return new LinuxFileNameParser();
    }

    @Override
    public CountFolders createCountFolders() {
        return new LinuxCountFolders();
    }
}
