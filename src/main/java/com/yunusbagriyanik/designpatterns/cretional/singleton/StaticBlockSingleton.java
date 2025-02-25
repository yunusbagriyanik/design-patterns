package com.yunusbagriyanik.designpatterns.cretional.singleton;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticBlockSingleton {
    @Getter
    private static final StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while creating a singleton instance ", e);
        }
    }

    public void runner() {
        log.info("StaticBlockSingleton Runner");
    }
}
