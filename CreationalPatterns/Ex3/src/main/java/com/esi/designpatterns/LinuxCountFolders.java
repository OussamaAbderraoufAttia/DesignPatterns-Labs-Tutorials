package com.esi.designpatterns;

public class LinuxCountFolders implements CountFolders {
    @Override
    public int countFolders(String path) {
        return path.split("/").length - 1;
    }
}
