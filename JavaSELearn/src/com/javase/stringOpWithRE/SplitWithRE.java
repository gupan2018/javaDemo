package com.javase.stringOpWithRE;
/**
 * split函数可以和正则表达式结合使用
 * 
 * @author Think
 *
 */
public class SplitWithRE {
	public static void main(String[] args) {
		String str = "fcsafv12cssaf45cvsdv523csdc";
		String regex = "[0-9]+";
		String[] array = str.split(regex);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
