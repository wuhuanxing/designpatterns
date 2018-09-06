package com.huanxing.pattern.singleton;

/**
 * 内部类实现延迟加载且线程安全的单例 (推荐用法)
 *
 * @author huanxing.wu
 * @date 2018/09/06
 */
public class InnerCalssSingleton {

    private InnerCalssSingleton() {
    }

    private static class SingletonHolder {

        private static final InnerCalssSingleton INSTANCE = new InnerCalssSingleton();
    }

    public static InnerCalssSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
