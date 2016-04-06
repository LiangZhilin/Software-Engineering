<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!-- navigation start -->
<!DOCTYPE HTML >
<html>
<head>
<jsp:include page="common/head.jsp"></jsp:include>
</head>
<body style="background-color:#4F4F4F">


	<jsp:include page="common/bigTital.jsp"></jsp:include>

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
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">

							<ul class="nav navbar-nav">

								<li><a href="danli.jsp">单利计算</a></li>
								<li><a href="navigation.jsp">复利计算</a></li>
								<li><a href="benjin.jsp">本金计算</a></li>
								<li><a href="gupiao.jsp">投资时长计算</a></li>
								<li><a href="lilv.jsp">利率计算</a></li>
								<li class="active"><a href="#">定投计算<span
										class="sr-only">(current)</span></a></li>
								<li><a href="dengE.jsp">等额本息</a></li>
								<li><a href="guanli.jsp">投资管理</a></li>
							</ul>
						</div>
					</div>
				</nav>
				<div class="panel-body" style="margin:50px;text-align: center">
					<form action="<%=path%>/calculateDingtou.action" method="post">
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">年金</span> <input
								type="text" name="deposit" class="form-control"
								value="${request.deposit}" placeholder="请输入您的本金"
								aria-describedby="sizing-addon1">
						</div>
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">利率</span> <input
								type="text" name="interest_rate" class="form-control"
								value="${request.interest_rate}" placeholder="请输入年利率"
								aria-describedby="sizing-addon1">
						</div>
						<table>
							<tr>
								<td>

									<div class="input-group input-group-lg">
										<span class="input-group-addon" id="sizing-addon1">时长</span> <input
											type="text" name="nper" class="form-control"
											value="${request.nper}" placeholder="请输入您的投资时长"
											aria-describedby="sizing-addon1">

									</div>
								</td>
								<td>
									<div>
										<div class="radio-line">
											<label> <input type="radio" name="optionsRadios"
												id="optionsRadios1" value=1 checked>年
											</label>
											<!-- 										</div> -->

											<!-- 										<div class="radio-line"> -->
											<label> <input type="radio" name="optionsRadios"
												id="optionsRadios2" value=2>月
											</label>
										</div>
									</div>
								</td>
							</tr>
						</table>

						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">终额</span> <input
								type="text" name="result" class="form-control" placeholder="待计算"
								aria-describedby="sizing-addon1" value="${request.result}">
						</div>
						<div style="margin-top: 20px">
							<input type="submit" value="计算" width="200px"
								style="font-size: 20px;color: green">
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