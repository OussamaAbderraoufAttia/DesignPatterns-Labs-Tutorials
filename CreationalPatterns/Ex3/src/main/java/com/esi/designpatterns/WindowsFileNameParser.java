package com.esi.designpatterns;

public class WindowsFileNameParser implements FileNameParser {
    @Override
    public String extractFileName(String path) {
        int index = path.lastIndexOf("\\");
        return path.substring(index + 1);
    }
}
