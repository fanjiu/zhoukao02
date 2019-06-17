package com.wangfan.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtils {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对
	public static int random(int min, int max){
		Random rr=new Random();
		return rr.nextInt(max-min+1)+min;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，
	//那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static Set subRandom (int min, int max, int subs){
		Set<Integer> str=new HashSet<Integer>();
		while (str.size()!=subs) {
			Random rr=new Random();
			str.add(rr.nextInt(max-min+1)+min);
		}
		return str;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static String randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		String bb="";
		//调用random方法
		int index = random(0, str.length()-1);
		return bb+=str.charAt(index);
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		String bb="";
		for (int i = 0; i < length; i++) {
			//调用randomCharacter()方法
			bb+=RandomUtils.randomCharacter();
		}
		return bb;
	}

}
