package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        // Building the file system
        Directory root = new Directory("root", "admin");
        
        Directory home = new Directory("home", "admin");
        Directory user = new Directory("oussama", "oussama");
        
        root.addComponent(home);
        home.addComponent(user);
        
        user.addComponent(new File("resume.pdf", "oussama", 500));
        user.addComponent(new File("photo.jpg", "oussama", 1200));
        
        Directory etc = new Directory("etc", "root");
        etc.addComponent(new File("config.sys", "root", 50));
        root.addComponent(etc);

        // 1. Calculate Size using Visitor
        SizeVisitor sizeVisitor = new SizeVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total File System Size: " + sizeVisitor.getTotalSize() + " KB");

        // 2. Count Files and Directories using Visitor
        CountVisitor countVisitor = new CountVisitor();
        root.accept(countVisitor);
        System.out.println("Total Files: " + countVisitor.getFileCount());
        System.out.println("Total Directories: " + countVisitor.getDirectoryCount());
    }
}
