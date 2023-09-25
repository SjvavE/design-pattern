package com.sjvave.aihua.singleton;

/**
 *这是第三种单例实现方式-双重检查
 */
public class Singleton_03 {
    private volatile static Singleton_03 instance;

    private Singleton_03() {
    }

    public static Singleton_03 getInstance() {
        if (instance == null) {
            synchronized (Singleton_03.class) {
                if (instance == null) {
                    instance = new Singleton_03();
                }
            }
        }
        return instance;
    }
}
