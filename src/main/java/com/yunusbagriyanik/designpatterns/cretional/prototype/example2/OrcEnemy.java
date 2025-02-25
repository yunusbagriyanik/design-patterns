package com.yunusbagriyanik.designpatterns.cretional.prototype.example2;

public class OrcEnemy implements Enemy {
    private final String weapon;

    public OrcEnemy(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println("Orc is attacking! Power: " + weapon);
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
