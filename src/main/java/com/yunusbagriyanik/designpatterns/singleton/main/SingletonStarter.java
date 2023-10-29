package com.yunusbagriyanik.designpatterns.singleton.main;

import com.yunusbagriyanik.designpatterns.singleton.*;

public class SingletonStarter {
    public static void main(String[] args) {
        EagerSingleton.getInstance().runner();
        StaticBlockSingleton.getInstance().runner();
        LazySingleton.getInstance().runner();
        ThreadSafeSingleton.getInstance().runner();
        ThreadSafeVolatileSingleton.getInstance().runner();
    }
}
