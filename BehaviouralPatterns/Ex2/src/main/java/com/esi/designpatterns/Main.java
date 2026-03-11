package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.addChannel(new Channel(1, "ENTV"));
        tv.addChannel(new Channel(2, "Canal Algerie"));
        tv.addChannel(new Channel(3, "Algerie 3"));
        tv.addChannel(new Channel(4, "Tamazight TX"));
        
        ChannelIterator it = tv.getIterator();
        
        System.out.println("--- Navigating Forward ---");
        while(it.hasNext()) {
            System.out.println("Next button pressed -> " + it.next());
        }
        
        System.out.println("\n--- Navigating Backward ---");
        while(it.hasPrevious()) {
            System.out.println("Previous button pressed -> " + it.previous());
        }
    }
}
