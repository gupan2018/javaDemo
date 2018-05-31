package com.javase.re;
/**
 * replaceAll的用法
 * @author Think
 *
 */
public class ReplaceAll {
	public static void main(String[] args) {
		String str = "fcsafv12cssaf45cvsdv523csdc";
		
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}
}
