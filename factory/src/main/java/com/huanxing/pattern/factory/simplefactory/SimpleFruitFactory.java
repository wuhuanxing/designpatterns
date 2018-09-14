package com.huanxing.pattern.factory.simplefactory;

/**
 * 简单（静态）工厂方法，缺点是扩展时需要修改工厂类
 * @author huanxing.wu at 2018/09/13
 */
public class SimpleFruitFactory {

    private final static int AppleType = 1;
    private final static int BananaType = 2;
    private final static int PearType = 3;

    public static Fruit create(final int type) {
        switch (type) {
            case AppleType:
                return new Apple();
            case BananaType:
                return new Banana();
            default:
                return new Pear();
        }
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        SimpleFruitFactory.create(1).eat();
        SimpleFruitFactory.create(2).eat();
        SimpleFruitFactory.create(3).eat();
    }
}
