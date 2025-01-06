package com.yunusbagriyanik.designpatterns.cretional.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();

        return instance;
    }

    public void runner() {
        log.info("LazySingleton Runner");
    }
}
