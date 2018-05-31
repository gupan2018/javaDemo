package com.javase.re;
/**
 * 敏感词汇屏蔽
 * 
 * @author Think
 *
 */
public class SensitiveWordMask {
	public static void main(String[] args) {
		String regex = 
				"(习大大|中国共产党|国家)";
		String message = "习大大领导下的中国共产党越来越富强";
		message = message.replaceAll(regex, "****");
		System.out.println(message);
	}
}
