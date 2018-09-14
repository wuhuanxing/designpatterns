package com.huanxing.pattern.factory.abstractfactory;

import com.huanxing.pattern.factory.simplefactory.Fruit;
import com.huanxing.pattern.factory.simplefactory.Pear;

/**
 * 梨子工厂
 * @author huanxing.wu at 2018/09/14
 */
public class PearFactory implements FruitFactory {

    @Override
    public Fruit create() {
        return new Pear();
    }
}
