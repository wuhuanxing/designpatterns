package com.huanxing.pattern.factory.abstractfactory;

/**
 * 抽象工厂测试类
 * <p>
 * 扩展时候只要新增工厂就行不用修改原有代码
 * </p>
 *
 * @author huanxing.wu at 2018/09/14
 */
public class Tester {

    public static void main(String[] args) {
        FruitFactory f = new AppleFactory();
        f.create().eat();

        f = new BananaFactory();
        f.create().eat();

        f = new PearFactory();
        f.create().eat();
    }

}
