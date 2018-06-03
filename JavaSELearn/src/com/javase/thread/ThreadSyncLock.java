package com.javase.thread;
/**
 * 这个类主要演示小范围的使用锁。尽可能的提高并发效率
 * 
 * synchronized(this){
 * 		···
 * 		// 加锁语句
 * }
 * 
 * @author Think
 *
 */
public class ThreadSyncLock {
	public static void main(String[] args) {
		final Shop shop = new Shop();
		Thread t1 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Shop{
	public void buy() {
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName() + "正在挑衣服");
			Thread.sleep(1000);
			
			// 需要传入当前方法所属对象，所以这里要传入this
			synchronized (this) {
				System.out.println(t.getName() + "正在试衣服");
				Thread.sleep(1000);
			}
			
			System.out.println(t.getName() + "结账离开");
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}