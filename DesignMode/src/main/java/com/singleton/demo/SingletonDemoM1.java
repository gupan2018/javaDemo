package com.singleton.demo;
/**
 * 这个类主要是用来实现单例模式
 * 
 * 创建方式：饿汉式
 * 
 * @author gupan
 *
 */
public final class SingletonDemoM1 {
	/**
	 * 单例的构造方法
	 */
	private SingletonDemoM1() {}
	
	// 静态变量，在内存中只保留一份，在类加载的时候就创建了单例
	private static final SingletonDemoM1 INSTANCE = new SingletonDemoM1();
	
	/**
	 * 静态方法，用来返回单例
	 * 
	 * @return
	 */
	public static SingletonDemoM1 getInstance() {
		return INSTANCE;
	}
}
