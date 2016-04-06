<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!-- navigation start -->
<!DOCTYPE HTML >
<html>
<head>
<title>首页</title>
<jsp:include page="common/head.jsp"></jsp:include>
</head>
<body style="background-color:#4F4F4F">


	<jsp:include page="common/bigTital.jsp"></jsp:include>

	<h3>输入错误</h3>
	<h3><a href="navigation.jsp">重新输入</a></h3>
</body>
</html>


<!-- navigation end -->