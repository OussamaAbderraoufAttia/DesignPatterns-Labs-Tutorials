package com.esi.designpatterns;

public class BossPlaneFactory implements EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new BossPlane();
    }
}
