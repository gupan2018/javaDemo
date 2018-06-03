package com.javase.thread;

/**
 * 这段代码主要演示互斥锁的使用
 * 		使用synchronized修饰这段代码之后，只要他们同步监视器对象相同，那么这几段代码见就是互斥关系，多个线程不能同时执行这些代码
 * 
 * @author gupan
 *
 */
public class ThreadSyncMatual {
	/**
	 * 线程t1和t2不能同时调用methodA或methodB方法，实现互斥关系
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Boo boo = new Boo();
		Thread t1 = new Thread() {
			public void run() {
				boo.methodA();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				boo.methodB();
			}
		};
		
		t1.start();
		t2.start();
	}
}
class Boo{
	public void methodA(){
		try{
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + "正在执行A方法");
			Thread.sleep(1000);
			System.out.println(t.getName() + "执行A方法完毕");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void methodB(){
		try{
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + "正在执行B方法");
			Thread.sleep(1000);
			System.out.println(t.getName() + "执行B方法完毕");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}