package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 这个类主要显示了Servlet Config的用法
 * 
 * @author gupan
 *
 */
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 * tomcat创建servlet的逻辑如下：
	 * 		1. LoginServlet s = new LoginServlet();
	 * 		2. ServletConfig c = new ServletConfig();
	 * 		3. c.加载数据();// 从web.xml中加载数据
	 * 		4. s.init(c);
	 * 
	 * 由于在其他函数中，可以调用getServletConfig方法来获取config，所以这个函数在这里没用
	 * 
	 * @param config  读取并存储web.xml数据的一个对象
	 * @throws ServletException
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		String maxOnline = 
				config.getInitParameter("maxOnline");
		System.out.println(maxOnline);
	}

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		
		// 父类提供的方法，让我们调用传入的config（就是init方法传入的那一个）
		ServletConfig cfg = this.getServletConfig();
		// 输出web.xml中的maxOnline
		String maxOnline = 
				cfg.getInitParameter("maxOnline");
		System.out.println(maxOnline);
		System.out.println("正在登录...");
		
		//统计流量
		ServletContext ctx = getServletContext();
		Integer count = 
				(Integer)ctx.getAttribute("count");
		ctx.setAttribute("count", ++count);
		System.out.println(count);
	}

}
