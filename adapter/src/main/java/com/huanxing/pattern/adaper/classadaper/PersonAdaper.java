package com.huanxing.pattern.adaper.classadaper;

/**
 * 适配器,继承了EnglishPerson 的说英语能力，同时提供其他语言能力
 *@author huanxing.wu at 2018/09/30
 */
public class PersonAdaper extends EnglishPerson implements TargetPerson{

	@Override
	public void sayFrench() {
		System.out.println("我说法语");
	}

	@Override
	public void sayJapanese() {
		System.out.println("我说日语");
	}
}
