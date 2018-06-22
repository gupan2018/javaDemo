<!-- 这个jsp文件用来演示直接用jsp开发的缺点和劣势 -->
<%@page pageEncoding="utf-8"
	import="entity.*,dao.*,java.util.*"%>
<!-- JSP中有大量的Java代码,Java代码多了以后,造成jsp文件臃肿 -->
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>演示直接用jsp开发的缺陷,查询员工为例</title>
</head>

<body>
	<table border="1"
		cellspacing="0"
		width="40%">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>职位</td>
			<td>月薪</td>
		</tr>
		<%
			EmpDao dao = new EmpDaoImpl();
			List<Emp> list = dao.findAll();
			if(list!=null){
				for(Emp e:list){
		%>
					<tr>
						<td><%=e.getEmpno() %></td>
						<td><%=e.getEname() %></td>
						<td><%=e.getJob() %></td>
						<td><%=e.getSal() %></td>
					</tr>
		<%
				}
			}
		%>
	</table>
</body>
</html>