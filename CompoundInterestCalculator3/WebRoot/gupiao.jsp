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


	<div style="background-color:#272727">
		<div style="font-size: 50px;color:#FFFFFF;text-align: center;">复利计算器--在线版</div>
	</div>

	<div>
		<div style="width: 600px;margin: auto;margin-top: 10px">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">复利计算器</h3>
				</div>
				<nav class="navbar navbar-default">
					<div class="container-fluid">
						<!-- Brand and toggle get grouped for better mobile display -->
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse"
								data-target="#bs-example-navbar-collapse-1"
								aria-expanded="false">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
						</div>

						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li><a href="danli.jsp">单利计算</a></li>
								<li><a href="navigation.jsp">复利计算</a></li>
								<li><a href="benjin.jsp">本金计算</a></li>
								<li class="active"><a href="gupiao.jsp">投资时长计算<span
										class="sr-only">(current)</span></a></li>
								<li><a href="lilv.jsp">利率计算</a></li>
								<li><a href="dingtou.jsp">定投计算</a></li>
								<li><a href="dengE.jsp">等额本息</a></li>
								<li><a href="guanli.jsp">投资管理</a></li>
							</ul>
						</div>
					</div>
				</nav>
				<div class="panel-body" style="margin:50px;text-align: center">
					<div>
						<form action="<%=path%>/calculateShichang.action" method="post">

							<div class="input-group input-group-lg">
								<span class="input-group-addon" id="sizing-addon1">投资额</span> <input
									type="text" name="deposit" class="form-control"
									value="${request.deposit}" placeholder="请输入您的投资额"
									aria-describedby="sizing-addon1">
							</div>
							<div class="input-group input-group-lg">
								<span class="input-group-addon" id="sizing-addon1">报酬率</span> <input
									type="text" name="interest_rate" class="form-control"
									value="${request.interest_rate}" placeholder="请输入您要存的期数"
									aria-describedby="sizing-addon1">
							</div>

							<div class="input-group input-group-lg">
								<span class="input-group-addon" id="sizing-addon1">最终值</span> <input
									type="text" name="result" class="form-control"
									value="${request.result}" placeholder="请输入您期待的终额"
									aria-describedby="sizing-addon1">
							</div>

							<div class="input-group input-group-lg">
								<span class="input-group-addon" id="sizing-addon1">需时长</span> <input
									type="text" name="nper" class="form-control"
									value="${request.nper}" placeholder="最终计算结果"
									aria-describedby="sizing-addon1">
							</div>
							<div style="margin-top: 20px">
								<input type="submit" value="计算" width="200px"
									style="font-size: 20px;color: green">
							</div>
						</form>
						<div><jsp:include page="common/footer.jsp"></jsp:include></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>


<!-- navigation end -->