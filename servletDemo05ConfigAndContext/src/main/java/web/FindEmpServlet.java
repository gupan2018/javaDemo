package web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 这个案例主要演示了Servlet Context的用法
 * 
 * @author gupan
 *
 */
public class FindEmpServlet extends HttpServlet {

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		
		/*
		 * tomcat启东时就会创建唯一的context，并且会调用他的方法加载web.xml
		 * 中的公用参数，context是全局的，任何servlet都可以使用
		 * */
		ServletContext ctx = 
				getServletContext();
		String size = ctx.getInitParameter("size");
		System.out.println(size);
		
		System.out.println("分页查询员工数据");;
		//统计流量
		Integer count = 
				(Integer)ctx.getAttribute("count");
		ctx.setAttribute("count", ++count);
		System.out.println(count);
	}

}
