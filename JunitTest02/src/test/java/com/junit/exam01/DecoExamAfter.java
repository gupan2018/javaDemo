package com.junit.exam01;

import org.junit.After;
import org.junit.Test;

public class DecoExamAfter {
	@After
	public void funcBefore() {
		System.out.println("This is After");
	}
	
	@Test
	public void DecoExamA() {
		System.out.println("This is test A");
	}
	
	@Test
	public void DecoExamB() {
		System.out.println("This is test B");
	}
}
