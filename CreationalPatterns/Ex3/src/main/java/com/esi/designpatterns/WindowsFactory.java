package com.esi.designpatterns;

public class WindowsFactory implements OSFactory {
    @Override
    public FileNameParser createFileNameParser() {
        return new WindowsFileNameParser();
    }

    @Override
    public CountFolders createCountFolders() {
        return new WindowsCountFolders();
    }
}
