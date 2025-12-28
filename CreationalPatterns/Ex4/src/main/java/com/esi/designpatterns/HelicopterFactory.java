package com.esi.designpatterns;

public class HelicopterFactory implements EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Helicopter();
    }
}
