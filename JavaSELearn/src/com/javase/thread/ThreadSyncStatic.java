package com.javase.thread;

import com.javase.string.Object;

/**
 * 静态方法的同步
 * 		当一个静态方法被synchronized修饰以后，那么该方法就是同步方法，由于静态方法从属类，
 * 全局就一份，所以同步的静态方法一定具有同步效果，与对象无关
 * 
 * @author gupan
 *
 */
public class ThreadSyncStatic {	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				Foo.dosome();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}


class Foo{
	public static synchronized void dosome() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + "正在等待运行dosome方法");
			Thread.sleep(1000);
			
			System.out.println(t.getName() + "正在运行dosome方法");
			Thread.sleep(1000);
			
			System.out.println(t.getName() + "执行dosome方法完毕");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}