package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 		该Servlet不负责处理具体的业务，只用来在tomcat启动时初始化数据，一般
 * WEB项目都有1～2个这样的servlet
 * 
 * @author gupan
 *
 */
public class InitServlet extends HttpServlet {

	@Override
	public void init(
			ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		/*
		 * tomcat在启动时会优先创建context然后再创建servlet
		 * */
		ServletContext ctx = getServletContext();
		// 流量初始值为0
		ctx.setAttribute("count", 0);
	}
	

}
