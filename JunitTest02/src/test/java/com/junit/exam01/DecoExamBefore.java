package com.junit.exam01;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class DecoExamBefore{
	@Before
	public void funcBefore() {
		System.out.println("This is Before");
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
