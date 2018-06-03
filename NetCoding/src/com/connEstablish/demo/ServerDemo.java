package com.connEstablish.demo;
/**
 * 聊天室服务器
 * 
 * @author gupan
 *
 */

import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	/**
	 * 运行在服务端的socket
	 */
	private ServerSocket server;
	/**
	 * 用来初始化服务端
	 */
	public ServerDemo() throws Exception{
		// TODO Auto-generated constructor stub
		/**
		 * 初始化服务端同时申请绑定监听端口
		 */
		server = new ServerSocket(8888);
	}
	/**
	 * 服务端开始工作的方法
	 */
	public void start() {
		try {
			/*
			 *  accept是一个阻塞的方法，有客户端连上来后，会创建一个新的socket和客户端进行交互
			 */
			System.out.println("等待客户端连接......");
			while(true) {
				Socket socket = server.accept();
				System.out.println("一个客户端连接了！");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			ServerDemo server = new ServerDemo();
			server.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("服务端启动失败");
		}
	}
}
