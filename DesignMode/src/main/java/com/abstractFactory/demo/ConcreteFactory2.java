package com.abstractFactory.demo;
/**
 * 具体的工厂实现对象实现创建具体的产品对象的操作
 * 
 * @author gupan
 *
 */
public class ConcreteFactory2 implements AbstractFactory{

	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}
}