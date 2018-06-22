package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 这是Servlet的第一个程序：讲解了Servlet程序编写的基本方式以及HTTP的基本结构
 * 
 * @author gupan
 *
 */
public class TimeServlet extends HttpServlet {

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res)
			throws ServletException, IOException {
	// 1. 使用request获取请求数据
		// 1）请求行
		System.out.println("请求方式：" + req.getMethod());
		System.out.println("访问路径：" + req.getServletPath());
		System.out.println("协议类型：" + req.getProtocol());
		// 2）消息头（键值对）
			// Enumeration是老版本的迭代器，作用及用法和Iterator是类似的
		Enumeration<String> e = req.getHeaderNames();
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			String value = req.getHeader(key);
			System.out.println(key + "：" + value);
		}
		// 3）实体内容
			// 实体内容暂时不演示
	
	
	// 2. 使用response发送响应数据
		// 1）状态行
			// 该数据由服务器自动填充
		
		// 2）消息头
			//消息头中的大部分数据由服务器填充，但返回的内容的格式需要程序员指定
		res.setContentType("text/html");
		// 告诉浏览器给它发送的是网页
		// 如果格式写错了，浏览器会无法识别，他只能让你保存这个文件，而不是显示
		
		PrintWriter out = res.getWriter();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(
			"HH:mm:ss"	
		);
		
		// 3）实体内容
			// 我们输出的网页就是具体的实体内容
		String now = sdf.format(date);
		// 此处偷了懒，省略的网页的基本结构
		// 将来会有改进方案
		out.println("<p>"+ now + "</p>");
		out.close();
	}
	
}
