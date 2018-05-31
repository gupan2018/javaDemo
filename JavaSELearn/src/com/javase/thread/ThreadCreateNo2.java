package com.javase.thread;
/**
 * 这个类主要讲了创建线程的第二种方法
 * 
 * 第二种创建线程的方式
 * 		实现Runnable接口并重写run方法
 * 
 * 
 * @author Think
 *
 */
public class ThreadCreateNo2 {
	static class MyRunnable1 implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 1000; i++) {
				System.out.println("警察要追上来了");
			}
		}
	}
	
	static class MyRunnable2 implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 1000; i++) {
				System.out.println("滚滚跑的越来越快了");
			}
		}
	}
	
	public static void main(String[] args) {
		Runnable r1 = new MyRunnable1();
		Runnable r2 = new MyRunnable2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
