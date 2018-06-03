package com.javase.thread;
import javax.management.RuntimeErrorException;

/**
 * 线程同步问题举例：现成同步问题引出
 * 		下面的例子中，资源争用的情况不一定会出现，但是在高并发的情况下，一旦出现资源争用的情况，会严重影响系统性能
 * @author gupan
 *
 */
public class ThreadSync01Question{
	public static void main(String[] args) {
		final Table table = new Table();
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

class Table{
	// 桌子上有20元钱
	private int beans = 20;
	
	public int getBean() throws RuntimeErrorException{
		if (this.beans == 1) {
			throw new RuntimeErrorException(null, "地主家没有余粮了");
		}
		Thread.yield();
		return this.beans--;
	}
}
