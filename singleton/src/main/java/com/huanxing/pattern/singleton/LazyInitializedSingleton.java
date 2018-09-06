package com.huanxing.pattern.singleton;

import java.util.Objects;

/**
 * 基础懒汉模式（第一次使用时在初始化）
 *
 * @author huanxing.wu
 * @date 2018/09/06
 */
public class LazyInitializedSingleton {


    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    /**
     * 第一次调用时才菜初始化，但是非线程安全
     */
    public static LazyInitializedSingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
