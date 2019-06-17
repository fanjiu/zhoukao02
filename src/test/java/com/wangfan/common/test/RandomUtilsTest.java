package com.wangfan.common.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wangfan.common.utils.RandomUtils;

public class RandomUtilsTest {
	//方法1
	@Test
	public void test1() {
		System.out.println(RandomUtils.random(1, 3));
	}
	//方法2
	@Test
	public void test2() {
		System.out.println(RandomUtils.subRandom(1, 10, 3));
	}
	//方法3
	@Test
	public void test3() {
		System.out.println(RandomUtils.randomCharacter());
	}
	//方法4
	@Test
	public void test4() {
		System.out.println(RandomUtils.randomString(5));
	}
}
