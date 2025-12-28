package com.esi.designpatterns;

public class Level3Factory implements LevelFactory {
    @Override
    public EnemyFactory[] createEnemies() {
        return new EnemyFactory[]{new BossPlaneFactory()};
    }

    @Override
    public Bonus[] createBonuses() {
        return new Bonus[]{};
    }

    @Override
    public String[] createTraps() {
        return new String[]{"Poison"};
    }
}
