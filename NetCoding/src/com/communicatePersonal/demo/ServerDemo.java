package com.communicatePersonal.demo;
/**
 * 聊天室服务器:实现私聊功能（代码尚未实现）
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
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServerDemo {
	/**
	 * 运行在服务端的socket
	 */
	private ServerSocket server;
	/**
	 * 用来初始化服务端
	 */
	
	/*
	 * 保存所有客户端输出流的集合 
	 */
	private HashMap<String, PrintWriter> allOut;
	
	
	public ServerDemo() throws Exception{
		// TODO Auto-generated constructor stub
		/**
		 * 初始化服务端同时申请绑定监听端口
		 */
		server = new ServerSocket(8888);
		allOut = new HashMap<String, PrintWriter>();
	}
	/**
	 * 将给定输出流存入共享集合
	 * @param out
	 */
	private synchronized void addOut(String nickName, PrintWriter out) {
		// TODO Auto-generated method stub
		this.allOut.put(nickName, out);
	}
	/**
	 * 将给定的输出流从共享结合中删除
	 * @param out
	 */
	private synchronized void removeOut(String nickName, PrintWriter out) {
		// TODO Auto-generated method stub
		this.allOut.remove(nickName);
	}
	/**
	 * 将消息发送给指定客户端（代码未实现）
	 * @param msg
	 */
	private synchronized void sendMessage(String nickNameFrom, String msg) {
		// TODO Auto-generated method stub
		// 消息源定义为@nickName:msgText的形式，需要需要截取出nickName，然后再在allOut中找即可
		String nickName = null;
		/*
		 * 未实现代码，等待补全，有点懒
		 */
		
		// 判断是否是给自己发送消息
		// 判断是否用户昵称是否存在，不存在返回告警信息
		// 发送消息给指定用户
	}
	/**
	 * 服务端开始工作的方法
	 */
	public void start() {
		try {
			while(true) {
				/*
				 *  accept是一个阻塞的方法，有客户端连上来后，会创建一个新的socket和客户端进行交互
				 */
				System.out.println("等待客户端连接......");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了！");
				
				// 启动一个线程，来完成与客户端的交互，实现多个客户端的同时连接与交互
				Runnable handler = new ClientHandler(socket);
				Thread t1 = new Thread(handler);
				t1.start();
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
	
	/**
	 * 该线程负责处理一个客户端的交互
	 * 
	 * @author gupan
	 *
	 */
	class ClientHandler implements Runnable{
		/*
		 * 该线程处理客户端的socket
		 */
		private Socket socket;
		// 记录客户端的身份信息
		private String host;
		// 声明输出流
		PrintWriter pw = null;
		// 用户昵称
		private String nickName;
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {				
				/*
				 * 与客户端交互
				 * 		getInputStream可以获取一个输入流，从该流可以获取从远端计算机发送过来的流
				 */
				InputStream in = this.socket.getInputStream();
				/*
				 * 加转换流，指定字符集
				 */
				InputStreamReader isr = new InputStreamReader(in, "utf-8");
				/*
				 * 调用高级流，读取客户端发送的信息
				 */
				BufferedReader br = new BufferedReader(isr);
				
				/*
				 * 首先读取一行字符串为昵称
				 */
				this.nickName = br.readLine();
				/*
				 * 创建服务端输出流，用于给客户端发送消息
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
				pw = new PrintWriter(osw, true);
				
				// 将客户端输出流放到共享集合中
				addOut(this.nickName, pw);
				
				String msg = null;
				// 对于linux，客户端断开，返回会循环读取到数据null，而windows会抛出异常，为了避免这种情况，加上如下判断
				while((msg = br.readLine()) != null) {
//					System.out.println(this.host + "：" + msg);
//					pw.println(msg);
					// 广播消息
					sendMessage(this.nickName, msg);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				// 将客户端的输出流从共享结合中移除
				removeOut(this.nickName, pw);
				
				/*
				 * 处理当前客户端断开后的逻辑
				 */
				// 关闭socket，关闭socket后，打开的其他输入输出流都会自动关闭
				// 断开客户端时，会跑出异常，需要捕获
				try{this.socket.close();}catch(Exception e) {e.printStackTrace();}
			}
		}
		public ClientHandler(Socket socket) {
			// TODO Auto-generated constructor stub
			this.socket = socket;
			/*
			 * 通过socket可以获取远端计算机的地址信息
			 * 
			 */
			InetAddress address = this.socket.getInetAddress();
			this.host = address.getHostAddress();
		}
	}
}
