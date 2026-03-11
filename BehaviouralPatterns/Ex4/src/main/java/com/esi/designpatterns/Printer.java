package com.esi.designpatterns;

import java.io.FileOutputStream;

// This is the Implementor interface in the Bridge pattern
public interface Printer {
    void print(float zoom, FileOutputStream tempFile);
}
