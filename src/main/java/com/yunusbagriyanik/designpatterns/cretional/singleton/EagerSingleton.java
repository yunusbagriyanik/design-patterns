package com.yunusbagriyanik.designpatterns.cretional.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public void runner() {
        log.info("EagerInitializationSingleton Runner");
    }
}
