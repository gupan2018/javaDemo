package com.javase.string;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

/**
 * 判断对象是否相等
 * 
 * 使用默认的equals方法，只能判断两个对象是否是同一个对象，对于对象而言，如果要判断其内
 * 部数据等是否相等，需要重写equals方法
 * 
 * @author Think
 *
 */
public class Equals {
	public String name;
	
	public Equals(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public boolean equals(java.lang.Object obj) {
		
		// TODO Auto-generated method stub
		if ((obj instanceof Equals) == false) {
			return false;
		}
		Equals tmp = (Equals) obj; // 注意这里不能直接用obj来接收强制转换后的obj
		if (this.name.equals(tmp.name) == false) {
			return false;
		}
		
		return true;
	}
	/**
	 * 判断程序是否退出
	 * 
	 * @return true表示退出，false表示不退出
	 */
	public boolean isExit() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		// 这里判断不能用input，因为用户可能会不输出，那么控制台返回null
		if ("exit".equalsIgnoreCase(input)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Equals obj1 = new Equals("gupan");
		Equals obj2 = new Equals("滚滚");
		Equals obj3 = new Equals("gupan");
		
		System.out.println(obj1.equals(obj1));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		
		while (obj1.isExit()) {
			System.out.println("程序退出");
			System.exit(0);
		}
	}

}
