package com.sjvave.aihua.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 第六种单例实现方式-容器单例模式
 */
public class Singleton_06 {
    private Map<String,Object> singleContainer=new HashMap<>();

    public void register(String name,Object instance){
        singleContainer.put(name,instance);
    }

    public Object getInstance(String name){
        return singleContainer.get(name);
    }
}
