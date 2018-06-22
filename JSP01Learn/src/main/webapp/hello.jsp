<%@page pageEncoding="utf-8"%>
<!-- 第一个jsp,主要是为了使用演示jsp的用法 -->
<!-- JSP文件不用配置web.xml -->
<!-- 1. 先写标签 -->
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>第一个JSP示例</title>
	</head>
	<body>
		<!-- 2.3 JSP声明:可以声明成员变量和方法（不建议使用） -->
		<%! 
			public double bb(double d){
				return d * 100;
			}
		%>
		<ul>
			<!-- 2. 再写Java -->
			<!-- 2.2 JSP脚本 -->
			<% 
				for(int i = 0; i < 10; i++){
			%>
					<!-- 把一段java拆成两段，中间又可以利用循环写标签 -->
					<!-- 2.1 JSP表达式 -->
					<li><%=bb(Math.random()) %></li>
			<%
				}
			%>
		</ul>
		
		<!-- 引入一个JSP模块:
			相当与将此JSP的内容复制到此处 -->
		<%@include file="time.jsp" %>
	</body>
</html>
