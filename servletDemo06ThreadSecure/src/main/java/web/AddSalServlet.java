package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddSalServlet extends HttpServlet {
	double salary = 2000.0;

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		// super.service(req, res);
		// 父类的service会调用doGet()和doPost方法，这两个方法都会抛异常提醒开发者重写，所以去掉
		synchronized(this) {
			salary += 100.0;
			try {
				// 模拟网络延时
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 显示数据
			res.setContentType("text/html");
			res.setCharacterEncoding("utf-8");
			
			PrintWriter out = res.getWriter();
			out.println(salary);
			
			out.close();
		}
	}
}
