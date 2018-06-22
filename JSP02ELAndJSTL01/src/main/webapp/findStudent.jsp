<%@page pageEncoding="utf-8"%>
<!--
	uri为在maven依赖库中uri标签对应的值(12行)
	prefix为在maven依赖库中short-name标签对应的值(11行)
	 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" 
	prefix="c" %>
<!-- 使用EL取值时,不用导包,因为底层使用了类反射技术 -->
	
<html>
	<head>
		<meta charset="utf-8">
		<title>EL和JSTL使用</title>
	</head>
	
	<body>
		<h1>JSTL演示</h1>
		<h2>1. if标签</h2>
		<p>
			<!-- 在test中写条件,但是if语句没有else -->
			<c:if test="${stu.sex == 'M'}">男</c:if>
			<c:if test="${stu.sex == 'F'}">女</c:if>
		</p>
		
		<h2>2. choose标签</h2>
		<p>
			<!-- c:when相当于if,第二个c:when相当于else if,c:otherwise相当于else -->
			<c:choose>
				<c:when test="${stu.sex == 'M'}">男</c:when>
				<c:when test="${stu.sex == 'F'}">女</c:when>
				<c:otherwise>不男不女</c:otherwise>
			</c:choose>
		</p>
		
		<h2>3. forEach标签</h2>
		<!-- 
			items:声明遍历的数据
			var:给每次循环所获得的数据命名
		 -->
		<p>
			<c:forEach items="${stu.intrests}" var="intrest">
				${intrest } 
			</c:forEach>
		</p>
		
		<h1>EL</h1>
	<!-- 1. 获取Bean属性 -->
		<!-- 基础:EL表达式的取值范围
		### 1)默认取值范围
		EL默认从如下四个对象(JSP中的部分隐含对象)中依次取值
		- page
		- request
		- session
		- application
		
		### 2)指定取值范围
		- 指定在request中取值:requestScope.stu.name
		- 指定在session中取值:sessionScope.stu.name
		- 指定在page中取值:pageScope.stu.name
		- 制定在applicatio中取值:application.stu.name
		 -->
		
		<!-- 等价于request.getAttribute("stu").getName() -->
		<p>姓名:${stu.name}</p>
		<!-- 等价于request.getAttribute("stu").getAge() -->
		<p>年龄:${stu["age"]}</p>
		<!-- 等价于request.getAttribute("stu").getCourse().getId()
			id的i不要大写 -->
		<p>课程Id:${stu.course.id}</p>
	
	<!-- 2. 支持运算 -->
		<p>年龄+5${stu.age+5}</p>
		<p>判断年龄是否在20~30之间:${stu.age>20 && stu.age<30}</p>
		<p>判断student是否为空:${empty stu}</p>
	</body>
	
	<!-- 3. 获取参数 -->
		<p>获取请求参数:${param.user}</p>
</html>