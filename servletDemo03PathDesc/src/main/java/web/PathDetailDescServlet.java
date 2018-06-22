package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PathDetailDescServlet extends HttpServlet {

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		// 通过不同的方法获取访问路径的不同部位
		// 项目名
		System.out.println(req.getContextPath());
		// 网名
		System.out.println(req.getServletPath());
		// 绝对路径
		System.out.println(req.getRequestURI());
		// 完整路径
		System.out.println(req.getRequestURL());
		
		// 如果没有写响应信息，服务器会给浏览器返回一个空的响应信息，此时浏览器会看到一片空白，但不会报错
	}

}
