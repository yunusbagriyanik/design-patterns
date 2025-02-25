package com.yunusbagriyanik.designpatterns.cretional.prototype.example2;

public class TrollEnemy implements Enemy {
    private final int strength;

    public TrollEnemy(int strength) {
        this.strength = strength;
    }

    @Override
    public void attack() {
        System.out.println("Troll is attacking! Power: " + strength);
    }

    @Override
    public Enemy clone() {
        try {
            return (Enemy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneException("Cloning failed for " + this.getClass().getSimpleName(), e);
        }
    }
}
