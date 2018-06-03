package com.javase.thread;

import javax.management.RuntimeErrorException;

/**
 * 		这个类主要讲了Sychronized关键字，给方法加了Synchronized关键字以后，线程在调用这个方法时，相当于对这个方法加了锁，
 * 那么其他线程就不能调用这个方法了（处于阻塞状态）
 * 
 * @author gupan
 *
 */
public class ThreadSyncSychronized {
	public static void main(String[] args) {
		final Table2 table = new Table2();
		Thread t1 = new Thread() {
			public void run() {
				while (true) {
					try {
						int bean = table.getBean();
						Thread.yield();
						System.out.println(getName() + ","  + table.getBean());
					} catch (RuntimeErrorException e) {
						System.out.println(getName() + ","  + e);
						break;
					}
					
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				while (true) {
					try {
						int bean = table.getBean();
						Thread.yield();
						System.out.println(getName() + ","  + table.getBean());
					} catch (RuntimeErrorException e) {
						System.out.println(getName() + "," + e);
						break;
					}
				}
			}
		};
		t2.start();
		t1.start();
	}
}

class Table2{
	// 桌子上有20元钱
	private int beans = 20;
	
	public synchronized int getBean() throws RuntimeErrorException{
		if (this.beans == 1) {
			throw new RuntimeErrorException(null, "地主家没有余粮了");
		}
		Thread.yield();
		return this.beans--;
	}
}
