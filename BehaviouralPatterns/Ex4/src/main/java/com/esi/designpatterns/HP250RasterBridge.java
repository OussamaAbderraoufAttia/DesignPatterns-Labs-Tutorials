package com.esi.designpatterns;

import java.io.FileOutputStream;

// Mock of third-party API
class HP250RasterPrinter {
    public void print(float fZoomX, float fZoomY, FileOutputStream tempFile) {
        System.out.println("[HP 250 Raster] Printing with Zoom X: " + fZoomX + ", Zoom Y: " + fZoomY);
    }
}

// Concrete Implementor
public class HP250RasterBridge implements Printer {
    private HP250RasterPrinter hp = new HP250RasterPrinter();

    @Override
    public void print(float zoom, FileOutputStream tempFile) {
        hp.print(zoom, zoom, tempFile);
    }
}
