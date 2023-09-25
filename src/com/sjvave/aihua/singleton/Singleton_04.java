package com.sjvave.aihua.singleton;

/**
 * 第四种单例实现方式-静态内部类
 */
public class Singleton_04 {
    private Singleton_04() {
    }

    private static  class SingletonHolder{
        private static final Singleton_04 INSTANCE = new Singleton_04();
    }

    public static Singleton_04 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
