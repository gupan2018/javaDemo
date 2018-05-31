package com.junit.calc;

public class CalcExam {
	private int result = 0;
	
	public void add(int a) {
		result += a;
	}
	
	public void sub(int a) {
		result -= a;
	}
	
	public void div(int a) {
		if (a == 0) return;
		result /= a;
	}
	
	public void multi(int a) {
		result *= a;
	}
	
	public int getResult() {
		return this.result;
	}
}
