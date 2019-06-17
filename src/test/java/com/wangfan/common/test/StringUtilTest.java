package com.wangfan.common.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wangfan.common.utils.StringUtil;

public class StringUtilTest {
	//方法1
	@Test
	public void test1() {
		assertEquals(true, StringUtil.hasLength("asd"));
		assertEquals(false, StringUtil.hasLength(""));
	}
	//方法2
	@Test
	public void test2() {
		assertEquals(true, StringUtil.hasText("asd"));
		assertEquals(false, StringUtil.hasText(""));
	}
	//方法3
	@Test
	public void test3() {
		System.out.println(StringUtil.randomChineseString(3));
	}
	//方法4
	@Test
	public void test4() {
		System.out.println(StringUtil.generateChineseName());
	}
}
