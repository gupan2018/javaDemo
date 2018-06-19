package com.singleton.demo;

/**
 * 这个类主要是用来实现单例模式
 * 
 * 创建方式：懒汉式
 * 		缺点：线程不安全
 * @author gupan
 *
 */
public class SingletonDemoM2 {
	/**
	 * Private constructor so nobody can instantiate the class.
	 */
	private SingletonDemoM2() {
	}

	/**
	 * Static to class instance of the class.
	 */
	private static SingletonDemoM2 INSTANCE = null;

	/**
	 * To be called by user to obtain instance of the class.
	 *
	 * @return instance of the singleton.
	 */
	public static SingletonDemoM2 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonDemoM2();
		}
		return INSTANCE;
	}
}
