package com.huanxing.pattern.singleton;

import java.util.Objects;

/**
 * 懒汉模式（ 线程安全）
 *
 * @author huanxing.wu
 * @date 2018/09/06
 */
public class ThreadSafeSingleton {


    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    /**
     * 方式1： 通过synchronized方法保证线程安全（但是开销较大）
     */
    public synchronized static ThreadSafeSingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }


    /**
     * 方式2： 通过双重检测方式保证单例，从而避免使用synchronized
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        // 只要instance初始化一次后，后面就不会进入if块，从而比同步方法性能好
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
