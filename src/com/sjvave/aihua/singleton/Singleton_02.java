package com.sjvave.aihua.singleton;

/**
 * 这是第一种单例实现方式-饿汉式
 */
public class Singleton_02 {
    private static Singleton_02 instance = new Singleton_02();

    private Singleton_02() {
    }

    public static Singleton_02 getInstance() {
        return instance;
    }
}
