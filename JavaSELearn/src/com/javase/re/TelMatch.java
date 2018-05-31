package com.javase.re;

import java.util.Scanner;

/**
 * 电话号码匹配正则表达式
 * 
 * @author Think
 *
 */
public class TelMatch {
	public static void main(String[] args) {
		String regex = "(\\+86|0086)?\\s*1[0-9]{10}";
//		System.out.println(regex);
		
		Scanner scanner = new Scanner(System.in);
		String tel = scanner.next();
		boolean flag = tel.matches(regex);
		
		if (flag) {
			System.out.println("是手机号");
		}else {
			System.out.println("不是手机号");
		}
	}
}
