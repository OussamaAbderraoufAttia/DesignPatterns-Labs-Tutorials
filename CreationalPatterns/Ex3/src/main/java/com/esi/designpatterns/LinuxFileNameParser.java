package com.esi.designpatterns;

public class LinuxFileNameParser implements FileNameParser {
    @Override
    public String extractFileName(String path) {
        int index = path.lastIndexOf("/");
        return path.substring(index + 1);
    }
}
