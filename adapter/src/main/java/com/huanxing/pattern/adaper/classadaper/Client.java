package com.huanxing.pattern.adaper.classadaper;

/**
 * 顾客，提出需求要会说三种语言
 *@author huanxing.wu at 2018/09/30
 */
public class Client {

	public static void main(String[] args) {
		PersonAdaper adaper = new PersonAdaper();
		adaper.sayEnglish();
		adaper.sayFrench();
		adaper.sayJapanese();
	}
}
