package com.wangfan.common.test;

import org.junit.Test;

import com.wangfan.common.utils.RandomUtils;
import com.wangfan.common.utils.StringUtil;

public class Person {
	private String name;
	private Integer age;
	private String about;
	private String created;
	
	//姓名
	@Test
	public void mm1(){
		name=StringUtil.generateChineseName();
	}
	//年龄
	@Test
	public void mm2(){
		age=RandomUtils.random(1, 120);
		System.out.println(age);
	}
	//介绍
	@Test
	public void mm3(){
		about=StringUtil.randomChineseString(140);
		System.out.println(about);
	}
	
	@Test
	public void mmm(){
		//for (int i = 0; i < 10000; i++) {
			System.out.println("姓名："+"   年龄："+age+"  介绍："+about+"   日期：");
		//}	
	}
}
