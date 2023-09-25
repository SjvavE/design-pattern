package com.sjvave.aihua.singleton;

/**
 * 这是第一种单例实现方式-懒汉式
 */
public class Singleton_01 {
    private static Singleton_01 instance;

    private Singleton_01() {
    }

    public Singleton_01 getInstance() {
        if (instance == null) {
            instance = new Singleton_01();
        }
        return instance;
    }
}
