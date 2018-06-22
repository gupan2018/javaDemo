<%@page pageEncoding="utf-8" 
	import="entity.*,java.util.*"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>基于JSP的MVC开发模式</title>
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
		<tr>
		<%
			/*从request(jsp隐含对象)中获取servlet转发过来的数据*/
			/* 采用这种方式后,如果业务复杂了,jsp文件不用改变,此时只需要改变servlet的代码即可 */
			List<Emp> list = (List<Emp>) 
				request.getAttribute("emps");
			if (list != null){
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
		</tr>
	</table>
</body>
</html>