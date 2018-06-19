package com.singleton.demo;

/**
 * 这个类主要是用来实现单例模式
 * 
 * 创建方式：线程安全的双重检查
 * 
 * @author gupan
 *
 */
public class SingletonDemoM4Recomend {
	// volatile防止编译器对这句代码自作聪明的优化
	private static volatile SingletonDemoM4Recomend instance;

	private SingletonDemoM4Recomend() {
	    if (instance != null) {
	      throw new IllegalStateException("Already initialized.");
	    }
	}
	
	/**
	 * 单例代码
	 * @return
	 */
	public static SingletonDemoM4Recomend getInstance() {
		SingletonDemoM4Recomend result = instance;
		if (result == null) {
			synchronized (SingletonDemoM4Recomend.class) {
				result = instance;
				
				// 再次对instance的值进行判断，由于这段语句已经加了锁，所以线程安全，对语句块加锁，最小范围的保证了效率
				if (result == null) {
					// 如果没有单例，则创建他
					instance = result = new SingletonDemoM4Recomend();
				}
			}
		}
		return result;
	}
}
