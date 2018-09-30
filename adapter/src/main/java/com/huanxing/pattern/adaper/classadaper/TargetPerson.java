package com.huanxing.pattern.adaper.classadaper;

/**
 * 顾客（client）所要求的会说多种语言的人Target
 *@author huanxing.wu at 2018/09/30
 */
public interface TargetPerson {
	// 说英语
	void sayEnglish();
	// 说法语
	void sayFrench();
	// 说日语
	void sayJapanese();
}
