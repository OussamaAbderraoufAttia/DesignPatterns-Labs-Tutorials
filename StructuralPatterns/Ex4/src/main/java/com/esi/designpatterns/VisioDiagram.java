package com.esi.designpatterns;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// This is the Abstraction in the Bridge pattern
public class VisioDiagram {
    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(float factorZoom) {
        System.out.println("Starting print process...");
        try (FileOutputStream fs = createTmpFileForImp()) {
            if (printer != null) {
                printer.print(factorZoom, fs);
            } else {
                System.out.println("Error: No printer selected!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private FileOutputStream createTmpFileForImp() throws IOException {
        System.out.println("Generating temporary file...");
        File temp = File.createTempFile("visio", ".tmp");
        temp.deleteOnExit();
        return new FileOutputStream(temp);
    }
}
