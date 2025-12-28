package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Windows Path ===");
        OSFactory windowsFactory = new WindowsFactory();
        FileNameParser winParser = windowsFactory.createFileNameParser();
        CountFolders winCounter = windowsFactory.createCountFolders();

        String windowsPath = "C:\\Windows\\System32\\hello.dll";
        System.out.println("Path: " + windowsPath);
        System.out.println("File name: " + winParser.extractFileName(windowsPath));
        System.out.println("Folder count: " + winCounter.countFolders(windowsPath));

        System.out.println();

        System.out.println("=== Linux Path ===");
        OSFactory linuxFactory = new LinuxFactory();
        FileNameParser linuxParser = linuxFactory.createFileNameParser();
        CountFolders linuxCounter = linuxFactory.createCountFolders();

        String linuxPath = "/user/share/hello.rc";
        System.out.println("Path: " + linuxPath);
        System.out.println("File name: " + linuxParser.extractFileName(linuxPath));
        System.out.println("Folder count: " + linuxCounter.countFolders(linuxPath));
    }
}
