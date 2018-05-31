package com.javase.re;

import java.util.Scanner;

/**
 * 邮箱匹配正则表达式案例
 * @author Gupan
 *
 */
public class EmailMatch {
	public static void main(String[] args) {
		String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+[\\.a-zA-Z0-9]+";
//		System.out.println(regex);
		
		Scanner scanner = new Scanner(System.in);
		String mail = scanner.next();
		boolean flag = mail.matches(regex);
		
		if (flag) {
			System.out.println("是邮箱");
		}else {
			System.out.println("不是邮箱");
		}
	}
	
}
