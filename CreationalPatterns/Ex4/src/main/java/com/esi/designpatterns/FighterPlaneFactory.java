package com.esi.designpatterns;

public class FighterPlaneFactory implements EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new FighterPlane();
    }
}
