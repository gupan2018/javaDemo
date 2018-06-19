package com.simpleFactory.demo;

public class Client {
	public static void main(String[] args) {
		Api api = Factory.createApi(1);
		api.test1("我来了");
	}
}
