package com.connEstablish.demo;
/**
 * 聊天室客户端
 * 
 * @author gupan
 *
 */

import java.net.Socket;

public class ClientDemo {
	/**
	 * java.net.Socket;封装了TCP协议，使用他就可以基于TCP协议进行网络通讯
	 */
	private Socket socket;
	/**
	 * 构造方法，初始化客户端
	 * @throws Exception
	 */
	public ClientDemo() throws Exception{
		System.out.println("正在连接服务端......");
		socket = new Socket("127.0.0.1", 8888);// 一般使用4000以后，10000以下的端口号
		System.out.println("已与服务端建立连接！！！！！");
	}
	
	/**
	 * 启动客户端
	 */
	private void start() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		try {
			// 实例化socket，若失败，会抛出异常
			ClientDemo client = new ClientDemo();
			client.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("客服端启动失败");
		}
	}
}
