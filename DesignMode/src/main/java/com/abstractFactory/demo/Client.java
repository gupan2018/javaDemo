package com.abstractFactory.demo;
/**
 * 使用抽象工厂模式代码
 * 
 * @author gupan
 *
 */
public class Client {
	public static void main(String[] args) {
		// 创建抽象工厂对象
		AbstractFactory af = new ConcreteFactory1();
		
		// 通过抽象工厂获取一系列的对象，如产品A和产品B
		af.createProductA();
		af.createProductB();
	}
}
