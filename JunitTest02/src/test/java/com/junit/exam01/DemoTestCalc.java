package com.junit.exam01;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.junit.calc.CalcExam;

public class DemoTestCalc {
	private CalcExam calc;
	
	@Before
	public void InitCalc() {
		calc = new CalcExam();
	}
	
	@Test
	public void add() {
		calc.add(3);
		int result = calc.getResult();
		System.out.println("实际结果为：" + result);
		assertEquals(3, result);
	}
	
	@Test
	public void sub() {
		calc.sub(3);
		int result = calc.getResult();
		System.out.println("实际结果为：" + result);
		assertEquals(-3, result);
	}
	
	@Test
	public void multi() {
		calc.multi(3);
		int result = calc.getResult();
		System.out.println("实际结果为：" + result);
		assertEquals(0, result);
	}
	
	@Test
	public void div() {
		calc.div(3);
		int result = calc.getResult();
		System.out.println("实际结果为：" + result);
		assertEquals(0, result);
	}
	
}
