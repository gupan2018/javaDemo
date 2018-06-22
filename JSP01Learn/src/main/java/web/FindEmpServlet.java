package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import dao.EmpDaoImpl;
import entity.Emp;

public class FindEmpServlet extends HttpServlet {

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		// 处理业务
		EmpDao dao = new EmpDaoImpl();
		List<Emp> list = dao.findAll();
		// 转发:让jsp继续完成这个请求
		// 1)将数据绑定打破request上
		req.setAttribute("emps", list);
		// 2)将请求提交给jsp让他继续处理
			// 同时要将请求的工具(request+response)给jsp
			// getRequestDispatcher方法中写要转发到的jsp的路径(一般写相对路径)
			// 当前:/JSP01Learn/findEmp
			// 目标:/JSP01Learn/findEmpM2.jsp
		req.getRequestDispatcher(
				"findEmpM2.jsp").forward(req, res);
	}

}
