package com.simpleFactory.demo;

/**
 * 简单工厂，客户端通过调用工厂接口，不必自己创建接口的对象
 * 
 * @author gupan
 *
 */

public class Factory {
	public static Api createApi(int condition) {
		Api api = null;
		
		switch (condition) {
		case 1:
			api = new ImplA();
			break;
		case 2:
			api = new implB();
		default:
			api = null;
		}
		return api;
	}
}
