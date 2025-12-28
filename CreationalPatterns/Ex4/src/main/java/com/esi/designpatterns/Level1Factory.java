package com.esi.designpatterns;

public class Level1Factory implements LevelFactory {
    @Override
    public EnemyFactory[] createEnemies() {
        return new EnemyFactory[]{new HelicopterFactory()};
    }

    @Override
    public Bonus[] createBonuses() {
        return new Bonus[]{new ShieldBooster(), new MissileBonus()};
    }

    @Override
    public String[] createTraps() {
        return new String[]{"Bomb"};
    }
}
