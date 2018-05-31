package com.wrapperClass.language;

import java.io.StringBufferInputStream;

/**
 * 这个类主要讲了Integer的用法
 * 	JDK5以后，JDK自动帮我们做了拆箱和封箱的操作
 * @author Think
 *
 */
public class IntegerLearn {
	public static void main(String[] args) {
		Integer i = 100;
		Integer j = 200;
		Integer k = i + j;
		
		// 打印最大值和最小值
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		// 字符串转化为数字
		int n = Integer.parseInt("1234");
		double d = Double.parseDouble("1234");
		
		// 进制转换
		String bstr = Integer.toBinaryString(100);
		String hstr = Integer.toHexString(100);
		
		System.out.println(bstr);
		System.out.println(hstr);
	}
}
