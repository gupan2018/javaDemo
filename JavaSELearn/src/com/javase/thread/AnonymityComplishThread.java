package com.javase.thread;

public class AnonymityComplishThread {
	public static void main(String[] args) {
		// **********************************第一种方式**********************************
		Thread t1 = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					System.out.println("警察要追上来了");
				}
			}
		};
		
		t1.start();
		
		// **********************************第二种方式**********************************		
		new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					System.out.println("滚滚跑的越来越快了");
				}
			}
		}).start();
	}
}
