package com.huanxing.pattern.factory.abstractfactory;

import com.huanxing.pattern.factory.simplefactory.Banana;
import com.huanxing.pattern.factory.simplefactory.Fruit;

/**
 * 香蕉工厂
 * @author huanxing.wu at 2018/09/14
 */
public class BananaFactory implements FruitFactory {

    @Override
    public Fruit create() {
        return new Banana();
    }
}
