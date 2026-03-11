package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DoorController controller = new DoorController();
        DoorDisplay display = new DoorDisplay();
        
        controller.addObserver(display);
        
        System.out.println("Initial Status: " + controller.getStatus());

        System.out.println("\n--- Event: touch ---");
        controller.touch(); // Closed -> Opening
        
        System.out.println("\n--- Event: touch (reversing) ---");
        controller.touch(); // Opening -> Closing
        
        System.out.println("\n--- Event: touch (reversing again) ---");
        controller.touch(); // Closing -> Opening
        
        System.out.println("\n--- Event: complete (fully open) ---");
        controller.complete(); // Opening -> Open
        
        System.out.println("\n--- Waiting for auto-close (2s) ---");
        Thread.sleep(2500); // Wait for timeout
        
        System.out.println("\n--- Event: complete (fully closed) ---");
        controller.complete(); // Closing -> Closed

        System.out.println("\n--- Event: touch ---");
        controller.touch(); // Closed -> Opening
        controller.complete(); // Opening -> Open
        
        System.out.println("\n--- Event: touch (Stay Open) ---");
        controller.touch(); // Open -> StayOpen
        
        System.out.println("\n--- Waiting (Stay Open should block auto-close) ---");
        Thread.sleep(2500); 
        
        System.out.println("\n--- Event: touch (Closing after StayOpen) ---");
        controller.touch(); // StayOpen -> Closing
    }
}
