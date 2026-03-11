package com.esi.designpatterns;

import java.io.FileOutputStream;

// Mock of third-party API
class HP1300PSPrinter {
    public void print(float fZoomX, float fZoomY, FileOutputStream tempFile) {
        System.out.println("[HP 1300 PS] Printing with Zoom X: " + fZoomX + ", Zoom Y: " + fZoomY);
    }
}

// Concrete Implementor
public class HP1300PrinterBridge implements Printer {
    private HP1300PSPrinter hp = new HP1300PSPrinter();

    @Override
    public void print(float zoom, FileOutputStream tempFile) {
        // Adapting the uniform 'zoom' to HP's dual-axis zoom
        hp.print(zoom, zoom, tempFile);
    }
}
