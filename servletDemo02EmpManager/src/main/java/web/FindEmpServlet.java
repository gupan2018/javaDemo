package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmoDaoImpl;
import dao.EmpDao;
import entity.Emp;

public class FindEmpServlet extends HttpServlet {

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		// 1. 接收参数（没有）
		
		// 2. 处理业务（查询）
		EmpDao dao = new EmoDaoImpl();
		List<Emp> list = dao.findAll();
		
		// 3. 输出响应（表格）
		res.setContentType(
				"text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		// 当前是查询页面：servletDemo02EmpManager/findEmp
		// 目标是增加页面：servletDemo02EmpManager/add_emp.html
		// 相对路径是：add_emp.html
		out.println("<a href='add_emp.html'>增加</a>");
		out.println("<table border='1' cellspacing='0' width='40%'>");
		out.println("	<tr>");
		out.println("		<td>编号</td>");
		out.println("		<td>姓名</td>");
		out.println("		<td>职位</td>");
		out.println("		<td>月薪</td>");
		out.println("	</tr>");
		
		if (list != null) {
			for(Emp e:list) {
				out.println("	<tr>");
				out.println("		<td>"+e.getEmpno()+"</td>");
				out.println("		<td>"+e.getEname()+"</td>");
				out.println("		<td>"+e.getJob()+"</td>");
				out.println("		<td>"+e.getSal()+"</td>");
				out.println("	</tr>");
			}
		}
		
		out.println("</table>");
	}

}
