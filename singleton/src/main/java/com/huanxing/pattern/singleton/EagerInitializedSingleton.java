package com.huanxing.pattern.singleton;


/**
 * 饿汉模式
 * @author huanxing.wu
 * @date 2018/09/06
 */
public class EagerInitializedSingleton {

    /**
     * 类加载时初始化唯一实例
     */
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    /**
     * 私有构造器，防止外部实例化
     */
    private EagerInitializedSingleton() {
    }

    /**
     * 对外提供访问方法
     */
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

}
