package com.yunusbagriyanik.designpatterns.cretional.prototype.example2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EnemyRegistry {
    private final Map<String, Enemy> prototypes = new HashMap<>();

    public void addPrototype(String key, Enemy enemy) {
        prototypes.put(key, enemy);
    }

    public Enemy createEnemy(String key) {
        return Optional.ofNullable(prototypes.get(key))
                .orElseThrow(() -> new IllegalArgumentException("The specified key was not found: " + key));
    }
}
