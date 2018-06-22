package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLClientInfoException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmoDaoImpl;
import dao.EmpDao;
import entity.Emp;

public class AddEmpServlet extends HttpServlet {

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		// 1. 接收参数
		req.setCharacterEncoding("utf-8");
		String ename = req.getParameter("name");
		String ejob = req.getParameter("job");
		String esal = req.getParameter("sal");
		
		// 2. 处理业务
		Emp e = new Emp();
		e.setEname(ename);
		e.setJob(ejob);
		if (esal!=null && !esal.equals("")) {
			e.setSal(new Double(esal));
		}
		EmpDao dao = new EmoDaoImpl();
		dao.save(e);
		// 3. 输出响应
//		res.setContentType(
//				"text/html;charset=utf-8");
//		PrintWriter out = res.getWriter();
//		out.println("<p>保存成功</p>");
//		out.close();
		
		// 重定向到查询页面，就是建议浏览器去访问查询页面
		res.sendRedirect("findEmp");
	}

}
