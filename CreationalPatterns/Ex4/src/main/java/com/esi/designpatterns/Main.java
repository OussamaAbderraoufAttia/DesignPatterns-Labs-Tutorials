package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.playLevel(1, new Level1Factory());
        game.playLevel(2, new Level2Factory());
        game.playLevel(3, new Level3Factory());

        System.out.println("Game Summary:");
        GameEngine engine = GameEngine.getInstance();
        System.out.println("Current Level: " + engine.getLevel());
        System.out.println("Player Plane: " + engine.getPlane());
    }
}
