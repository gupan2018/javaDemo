package com.junit.exam01;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DecoExamClassBefore2After {
	
	private int result = 0;
	
	// 使用BeforeClass和AfterClass注解需要使用static关键字
	@BeforeClass
	public static void beforeExam() {
		System.out.println("This is class before");
	}
	
	@AfterClass
	public static void adterExam() {
		System.out.println("This is class after");
	}
	
	@Test
	public void examA() {
		System.out.println("This is ExamA");
	}
	
	@Test
	public void examB() {
		System.out.println("This is ExamB");
	}
}