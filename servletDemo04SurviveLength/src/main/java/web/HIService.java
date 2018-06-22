package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HIService extends HttpServlet {
	public HIService() {
		System.out.println(
				"实例化HiServlet");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println(
				"调用HiServlet处理请求");
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println(
				"销毁HiServlet");
		
	}

	@Override
	public void init(
			ServletConfig config) throws ServletException {
		
		super.init(config);
		System.out.println(
				"初始化HiServlet");
	}
}
