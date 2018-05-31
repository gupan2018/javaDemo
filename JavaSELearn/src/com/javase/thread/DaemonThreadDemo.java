package com.javase.thread;

public class DaemonThreadDemo {
	public static void main(String[] args) {
		
		// 前台线程
		Thread rose = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Let me go");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
				System.out.println("默哀3min");
			}
		};
		
		// 后台线程
		Thread jack = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println("No Jump!!!!!!!!!!!!!!!!!!!!!!!!!");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
			}
		};
		
		// 设置jack为后台线程
		jack.setDaemon(true);
		
		// 启动线程
		rose.start();
		jack.start();
		
		
		// 执行main方法的线程先于rose和jack结束
		
	}
}
