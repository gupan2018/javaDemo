package com.adapter.demo;
/**
 * 使用适配器的客户端
 * 
 * @author gupan
 *
 */
public class Client {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		target.request();
	}
}
