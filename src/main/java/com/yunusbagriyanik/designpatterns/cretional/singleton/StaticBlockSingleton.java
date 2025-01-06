package com.yunusbagriyanik.designpatterns.cretional.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticBlockSingleton {
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

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public void runner() {
        log.info("StaticBlockSingleton Runner");
    }
}
