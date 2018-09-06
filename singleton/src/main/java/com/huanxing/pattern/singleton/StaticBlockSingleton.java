package com.huanxing.pattern.singleton;

/**
 * 静态块模式
 * <p>
 * 饿汉模式进阶版，额外提供异常处理功能
 * </p>
 *
 * @author huanxing.wu
 * @date 2018/09/06
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception ex) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
