package com.esi.designpatterns;

public class GameEngine {
    private static GameEngine instance;
    private int score = 0;
    private int level = 1;
    private Plane plane;

    private GameEngine() {
    }

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Plane getPlane() {
        return plane;
    }

    public void updateScore(int points) {
        this.score += points;
    }

    public int getScore() {
        return score;
    }

    public void nextLevel() {
        this.level++;
    }

    public int getLevel() {
        return level;
    }

    public void startLevel(int levelNum) {
        this.level = levelNum;
        System.out.println("Starting Level " + levelNum);
    }
}
