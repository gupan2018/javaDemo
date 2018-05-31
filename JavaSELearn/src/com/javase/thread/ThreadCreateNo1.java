package com.javase.thread;
/**
 * 这个类主要讲了创建线程的第一种方法
 * 
 * 第一种创建线程的方式
 * 		继承Thread并重写run定义线程要执行的任务
 * 
 * 不足：
 * 	1. 线程类继承了Thread，但是Java是单继承的，就不能继承其他的类了
 * 	2. 任务和线程呈现强耦合关系，一个线程只实现了一种run方法，不利于扩展
 * 
 * @author Think
 *
 */
public class ThreadCreateNo1{
	
	static class MyThread1 extends Thread{
		@Override
		/**
		 * 重写run方法，指定线程要干的事情
		 */
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 1000; i++) {
				System.out.println("警察要追上来了");
			}
		}
	}
	
	static class MyThread2 extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 1000; i++) {
				System.out.println("滚滚跑的越来越快了");
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		
		
		// 启动线程指定start方法，而不是直接调用run方法，run方法时线程要被执行的任务，
		// 线程调用start进入runnable状态后，一旦获取CPU时间，就会执行run方法
		t1.start();
		t2.start();
		
		
		// 定义第三个线程，在线程t1和t2结束之后才执行
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					// 在jdk1.8之后（包括1.8），t1和t2必须是final的，当一个方法的局局部内部类当中使用到了这个方法的其他局部变量，这个变量必须是final的
					t1.join();
					t2.join();
					// 使用了join以后需要捕获InterruptedException异常
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("滚滚被抓了");
			}
		}.start();
	}
}
