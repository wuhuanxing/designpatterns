package com.huanxing.pattern.factory.abstractfactory;

import com.huanxing.pattern.factory.simplefactory.Apple;
import com.huanxing.pattern.factory.simplefactory.Fruit;

/**
 * 苹果工厂
 * @author huanxing.wu at 2018/09/14
 */
public class AppleFactory implements FruitFactory {

    @Override
    public Fruit create() {
        return new Apple();
    }
}
