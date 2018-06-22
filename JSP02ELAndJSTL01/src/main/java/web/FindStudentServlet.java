package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Course;
import entity.Student;

public class FindStudentServlet extends HttpServlet {

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		// 1. 获取参数
		
		// 2. 处理业务
		Student student = new Student();
		student.setAge(24);
		student.setName("滚滚");
		student.setSex("M");
		student.setIntrests(
				new String[] {"足球", "篮球", "跑步"}
				);
		
		Course c = new Course();
		c.setId(1);
		c.setName("Python");
		c.setDays(100);
		
		student.setCourse(c);
		
		// 3. 转发/重定向
		req.setAttribute("stu", student);
		// 当前:/JSP02ELAndJSTL01/FindStudent
		// 目标:/JSP02ELAndJSTL01/findStudent.jsp
		
		// 开始转发
		req.getRequestDispatcher(
				"findStudent.jsp").forward(req, res);
		
	}

}
