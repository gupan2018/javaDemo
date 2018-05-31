package com.exceptionHandle.language;

import java.awt.AWTException;
import java.io.IOException;

/**
 * 基本类，供本包中其他类调用
 * @author Think
 *
 */

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	/**
	 * 在方法上写throws抛一个异常，通知调用者要处理这个异常
	 * 除了RuntimeException及其子类之外，其他异常都强制在方法上抛这个异常，或者写try catch捕获异常，但是一般使用第一章方法
	 * 
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age) throws SelfDefException, RuntimeException, IOException, Exception{
		if (age < 0 || age > 150) {
			// 满足语法，但是不满足业务逻辑时，将错误抛出
			throw new SelfDefException("来自自定义异常SelfDefException的报错：岁数不对呀，你怕是在逗我吧");
//			throw new Exception("错误了哈");
		}
		this.age = age;
	}
	
	public void errThrowsDemo() throws IOException, AWTException{
		
	}

	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
}
