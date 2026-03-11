package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        VisioDiagram diagram = new VisioDiagram();

        System.out.println("--- Printing with Epson ---");
        diagram.setPrinter(new EpsonPrinterBridge());
        diagram.print(1.5f);

        System.out.println("\n--- Printing with HP 1300 ---");
        diagram.setPrinter(new HP1300PrinterBridge());
        diagram.print(2.0f);

        System.out.println("\n--- Printing with HP 250 Raster ---");
        diagram.setPrinter(new HP250RasterBridge());
        diagram.print(0.8f);
    }
}
