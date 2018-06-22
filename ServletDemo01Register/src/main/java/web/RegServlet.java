package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 这个类演示了Servlet处理post和get请求
 * 
 * @author gupan
 *
 */
public class RegServlet extends HttpServlet {

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		// 处理请求的一般步骤是
			// 1. 接收参数
		String user = 
				req.getParameter("userName");
		// 处理请求中文乱码
		// 第一种方法：想转换为byte形式，再将byte转换为utf-8形式
		byte[] bs = user.getBytes("ISO8859-1");
		user = new String(bs, "utf-8");
		
		// 第二种方法：(只对get请求有效)修改tomcat配置文件，修改server.xml修改端口号那一行，加URIEncoding="utf-8"
		
		// 第三种方法：（只对post请求有效）在接受参数前，加req.setCharacterEncoding("utf-8");声明实体内容为UTF-8
		String pwd = 
				req.getParameter("pwd");
		String sex = req.getParameter("sex");
		String[] interests = 
				req.getParameterValues("interest");
			// 2. 处理业务
			// 常规的业务应该保存这些数据，但是本案例重点在传参
		System.out.println(user);
		System.out.println(pwd);
		System.out.println(sex);
		if (interests != null) {
			for (String i : interests) {
				System.out.println(i);
			}
		}
			// 3. 发送响应
		res.setContentType("text/html");
		// 设置返回数据字符集，避免乱码问题
		res.setCharacterEncoding("utf-8");
		PrintWriter out = res.getWriter();
		out.println("<p>注册成功</p>");
		out.close();
	}

}
