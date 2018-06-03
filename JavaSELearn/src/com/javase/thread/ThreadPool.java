package com.javase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 这个类主要是介绍了线程池的使用
 * 
 * 线程池作用：
 * 		1. 控制线程数量
 * 		2. 重用线程
 * 
 * @author gupan
 *
 */
public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i < 5; i++) {
			Runnable runn = new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Thread t = Thread.currentThread();
					try {
						System.out.println(t.getName() + "：正在运行任务");
						Thread.sleep(1000);
						System.out.println(t.getName() + "：运行任务完毕");
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			};
			// 将线程分配给线程池
			threadPool.execute(runn);
		}
		// 调用shutdown后，并不会立即停止线程池，而是在已缓存的线程池执行完毕后，才会停止线程池
		//		threadPool.shutdown();
		
		// 调用shutdownNow()后，不管线程池中是否有任务正在执行，会立即停止线程池
		threadPool.shutdownNow();
		System.out.println("停止线程池");
	}
}
