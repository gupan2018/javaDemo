package com.singleton.demo;
/**
 * 这个类主要是用来实现单例模式
 * 
 * 创建方式：线程安全懒汉式
 * 		缺点：效率较低
 * @author gupan
 *
 */
public class SingletonDemoM3 {
	private SingletonDemoM3() {
		
	}
	private static SingletonDemoM3 INSTANCE = null;

	/**
	 * 加同步锁，保证当一个线程执行这段方法的时候，另一个线程不会进入这个方法
	 *
	 * @return instance of the singleton.
	 */
	public synchronized static SingletonDemoM3 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonDemoM3();
		}
		return INSTANCE;
	}
}
