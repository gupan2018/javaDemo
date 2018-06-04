package com.communicatePersonal.demo;
/**
 * 聊天室客户端:实现消息私聊功能（代码尚未实现）
 * 
 * @author gupan
 *
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

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
	 * 启动客户端，客户端业务代码
	 */
	private void start() {
		// TODO Auto-generated method stub
		try {
			// 获取用户输入
			Scanner scanner = new Scanner(System.in);
			
			/*
			 * 先要求用户输入昵称
			 */
			String nickName = null;
			while(true) {
				System.out.println("请输入用户名：");
				nickName = scanner.nextLine();
				// 正则表达式对用户名进行验证等
				if (nickName.length() > 0) {
					break;
				}
				System.out.println("判断有误，请重新输入！");
			}
			System.out.println(nickName + "登录成功！！！");
			
			
			/*
			 * getOutputStream获取一个字节的输出流，通过该流写出的数据会被发送指远端计算机
			 */
			OutputStream out = socket.getOutputStream();
			
			/*
			 * 加转换流，指定字符集
			 */
			OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
			/*
			 * 调用高级流，设置自动行刷新，若没有自动行刷新，PrintWriter是一个缓冲流，要缓冲区满了以后才能刷新、发送
			 */
			PrintWriter pw = new PrintWriter(osw, true);
			
			/*
			 * 将昵称发送给服务端
			 */
			pw.println(nickName);
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			
			while(true) {
				pw.println(scanner.nextLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

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
	
	/**
	 * 另起一个线程，用来读取服务端发送的消息，输出到客户端显示
	 * 
	 * @author gupan
	 *
	 */
	class ServerHandler implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String msg = null;
				// 对于linux，客户端断开，返回会循环读取到数据null，而windows会抛出异常，为了避免这种情况，加上如下判断
				while((msg = br.readLine()) != null) {
					System.out.println(msg);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
