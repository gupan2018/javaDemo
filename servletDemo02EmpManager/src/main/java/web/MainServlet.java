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
/**
 * 路径规范：
 * 	1. 查询员工：/findEmp.do
 * 	2. 增加员工：/addEmp.do
 * 
 * @author gupan
 *
 */
public class MainServlet extends HttpServlet {

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		// 获取请求路径
		String path = req.getServletPath();
		// 根据规范处理路径
		if("/findEmp.do".equals(path)) {
			findEmp(req, res);
		}else if("/addEmp.do".equals(path)){
			addEmp(req, res);
		}else {
			// 该异常抛给服务器，服务器可以同意处理异常
			System.out.println(path);
			throw new RuntimeException("查无此页");
		}
	}
	
	// 查询员工方法
	protected void findEmp(
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
	// 增加员工方法
	protected void addEmp(
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
		res.sendRedirect("findEmp.do");
	}

}
