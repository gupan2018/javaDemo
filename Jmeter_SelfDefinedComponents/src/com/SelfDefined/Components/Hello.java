package com.SelfDefined.Components;

public class Hello {
	public String sayHello(){
		return "Hello";
	}
	
	public String sayHello2Person(String name){
		if (name == null || name.equals("")) {
			name = "nobody";
		}
		return (new StringBuilder()).append("Hello").append(name).toString();
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
}
