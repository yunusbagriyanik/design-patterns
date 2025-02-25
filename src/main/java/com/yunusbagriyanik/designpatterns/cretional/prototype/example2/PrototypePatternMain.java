package com.yunusbagriyanik.designpatterns.cretional.prototype.example2;

public class PrototypePatternMain {
    public static void main(String[] args) {
        EnemyRegistry registry = new EnemyRegistry();

        registry.addPrototype("orc", new OrcEnemy("ax"));
        registry.addPrototype("troll", new TrollEnemy(100));

        testClonedEnemies(registry);
    }

    private static void testClonedEnemies(EnemyRegistry registry) {
        Enemy clonedOrc1 = registry.createEnemy("orc");
        Enemy clonedOrc2 = registry.createEnemy("orc");
        Enemy clonedTroll = registry.createEnemy("troll");

        clonedOrc1.attack();
        clonedOrc2.attack();
        clonedTroll.attack();

        Enemy orc = registry.createEnemy("orc");
        orc.attack();
    }
}
