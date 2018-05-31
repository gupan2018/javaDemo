package com.exceptionHandle.language;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 这个类主要讲了try...except...的用法
 * 
 * @author Gupan
 *
 */
public class TryExceptionDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		}catch (ParseException e) {
//			System.out.println(e);
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
