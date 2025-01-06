package com.yunusbagriyanik.designpatterns.cretional.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null)
            instance = new ThreadSafeSingleton();

        return instance;
    }

    public void runner() {
        log.info("ThreadSafeSingleton Runner");
    }
}
