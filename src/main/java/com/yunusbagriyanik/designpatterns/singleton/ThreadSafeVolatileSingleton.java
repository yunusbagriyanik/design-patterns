package com.yunusbagriyanik.designpatterns.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadSafeVolatileSingleton {
    // The volatile keyword ensures that the value of the variable is always read from and written to the main memory,
    // and it does not cache the value locally
    private static volatile ThreadSafeVolatileSingleton instance;

    private ThreadSafeVolatileSingleton() {
    }

    public static ThreadSafeVolatileSingleton getInstance() {
        if (instance == null)
            synchronized (ThreadSafeVolatileSingleton.class) {
                if (instance == null)
                    instance = new ThreadSafeVolatileSingleton();
            }

        return instance;
    }

    public void runner() {
        log.info("ThreadSafeVolatileSingleton Runner");
    }
}
