package com.esi.designpatterns;

public class Game {
    private GameEngine engine;

    public Game() {
        this.engine = GameEngine.getInstance();
        Plane plane = new PlaneBuilder()
                .withHealth(100)
                .withSpeed(15)
                .withPower(8)
                .build();
        engine.setPlane(plane);
    }

    public void playLevel(int levelNum, LevelFactory levelFactory) {
        engine.startLevel(levelNum);
        System.out.println("Player Plane: " + engine.getPlane());

        System.out.println("\nEnemies in Level " + levelNum + ":");
        EnemyFactory[] enemyFactories = levelFactory.createEnemies();
        for (EnemyFactory factory : enemyFactories) {
            Enemy enemy = factory.createEnemy();
            System.out.println("  - " + enemy.getType());
            enemy.attack();
        }

        System.out.println("\nBonuses in Level " + levelNum + ":");
        Bonus[] bonuses = levelFactory.createBonuses();
        for (Bonus bonus : bonuses) {
            System.out.println("  - " + bonus.getType());
            bonus.apply();
        }

        System.out.println("\nTraps in Level " + levelNum + ":");
        String[] traps = levelFactory.createTraps();
        for (String trap : traps) {
            System.out.println("  - " + trap);
        }

        System.out.println();
    }
}
