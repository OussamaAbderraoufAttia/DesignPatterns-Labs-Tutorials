package com.esi.designpatterns;

import java.io.FileOutputStream;

// Mock of third-party API
class Epson650PSPrinter {
    public void print(float Zoomfactor, FileOutputStream tempFile) {
        System.out.println("[Epson 650 PS] Printing with zoom: " + Zoomfactor);
    }
}

// Concrete Implementor (Adapter role inside Bridge)
public class EpsonPrinterBridge implements Printer {
    private Epson650PSPrinter epson = new Epson650PSPrinter();

    @Override
    public void print(float zoom, FileOutputStream tempFile) {
        epson.print(zoom, tempFile);
    }
}
