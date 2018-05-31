package com.junit.exam01;

import org.junit.Test;

public class DecoExamTest{
	// 以使用**注解**的方式来标注test方法此时测试方法不必以test开头
	@Test
	public void DecoExamA() {
		System.out.println("This is test A");
	}
	
	@Test
	public void DecoExamB() {
		System.out.println("This is test B");
	}
}
