package com.facede.demo;
/**
 * 外观模式核心代码展示
 * 
 * @author gupan
 *
 */
public class FacadeDemo {
	public static void test() {
		ApiA a = new ImplA();
		a.testA();
		
		ApiB b = new ImplB();
		b.testB();
		
		ApiC c = new ImplC();
		c.testC();
	}
}
