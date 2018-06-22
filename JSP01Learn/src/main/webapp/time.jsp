<!-- 这个jsp文件主要是为了演示page import和include指令的使用,
本jsp文件主要是为了需要进行复用的组件 -->

<!-- 
	pageEncoding:是申明此文档的编码
	contentType:是申明输出的内容的格式
	import:导包
 -->
<%@page pageEncoding="utf-8" 
	contentType="text/html" 
	import="java.text.*,java.util.*" %>
<%
	Date date = new Date();
	SimpleDateFormat sdf = 
			new SimpleDateFormat("HH:mm:ss");
	String now = sdf.format(date);
%>

<!-- 此JSP被其他网页引用,是其他网页的一部分,所以不必写出完整的结构 -->
<p><%=now %></p>