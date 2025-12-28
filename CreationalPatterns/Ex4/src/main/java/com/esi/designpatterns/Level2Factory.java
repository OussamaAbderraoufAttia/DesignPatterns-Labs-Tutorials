package com.esi.designpatterns;

public class Level2Factory implements LevelFactory {
    @Override
    public EnemyFactory[] createEnemies() {
        return new EnemyFactory[]{new FighterPlaneFactory()};
    }

    @Override
    public Bonus[] createBonuses() {
        return new Bonus[]{new Cloner()};
    }

    @Override
    public String[] createTraps() {
        return new String[]{"Slowdown"};
    }
}
