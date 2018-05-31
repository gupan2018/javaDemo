package com.javase.stringBuilder;
/**
 * 这个类讲了StringBuilder的用法
 * 
 * 	和String不同，StringBuilder封装的是可变字符串，创建之后可以通过调用append,insert,delete和replace进行修改
 * 
 * @author Think
 *
 */
public class StringBuilderLearn {
	public static void main(String[] args) {
		StringBuilder builder01 = new StringBuilder();
		StringBuilder builder02 = new StringBuilder("gupan");
		
		builder02.append(" is");
		System.out.println(builder02);
		
		builder02.insert(5, "&&&&");
		System.out.println(builder02);

		builder02.replace(5,8, "*");
		System.out.println(builder02);
		
		builder02.delete(5, 8);
		System.out.println(builder02);
	}
}
