package com.esi.designpatterns;

public interface OSFactory {
    FileNameParser createFileNameParser();
    CountFolders createCountFolders();
}
