package com.esi.designpatterns;

public interface LevelFactory {
    EnemyFactory[] createEnemies();
    Bonus[] createBonuses();
    String[] createTraps();
}
