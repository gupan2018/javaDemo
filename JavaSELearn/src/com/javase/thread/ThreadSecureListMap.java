package com.javase.thread;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.MenuComponent;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * 这个类演示将List或Map转换为线程安全的
 * 
 * @author gupan
 *
 */
public class ThreadSecureListMap {
	public static void main(String[] args) {
		// ************************************************List演示开始**********************************************************
		final List<String> list = new ArrayList<String>();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					list.add("one");
					Thread.sleep(1000);
					list.add("two");
					Thread.sleep(1000);
					list.add("three");
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
				// TODO Auto-generated method stub
					list.add("four");
					Thread.sleep(1000);
					list.add("five");
					Thread.sleep(1000);
					list.add("six");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
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
				System.out.println(list);
			}
		}.start();
		// ************************************************List演示完毕**********************************************************
		
		// ************************************************Set演示开始**********************************************************
		Set<String> set = new HashSet<String>(list);
		set = Collections.synchronizedSet(set);
		// 将set转换成线程安全的
		System.out.println(set);
		
		// ************************************************Set演示完毕**********************************************************
		
		// ************************************************Map演示开始**********************************************************
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("通信原理", 90);
		map.put("数据结构", 95);
		map.put("设计模式", 100);
		// 将map转换成线程安全的
		map = Collections.synchronizedMap(map);
		System.out.println(map);
				
		// ************************************************Map演示完毕**********************************************************
	}
	
}
