<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
		<div style="width: 1500px;margin: auto;margin-top: 10px">
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
								<li><a href="dingtou.jsp">定投计算</a></li>
								<li><a href="dengE.jsp">等额本息</a></li>
								<li class="active"><a href="#"><span class="sr-only">(current)</span>投资管理</a></li>
							</ul>
						</div>
					</div>
				</nav>
				<div class="panel-body" style="margin:50px;text-align: center">
					<table border="3px" style="margin: 0px">
						<tr>
							<td style="width: 215px">投资金额</td>
							<td style="width: 215px">投资年份</td>
							<td style="width: 215px">投资类型</td>
							<td style="width: 215px">投资利率</td>
							<td style="width: 215px">现值计算公式</td>
							<td style="width: 215px">
							<div>
							<form action="test.action">现值查询：<input type="text"  name="thisYear"/><a></a>
							<input type="submit" value="查询">
							</form></td>
							</div>
							<td style="width: 215px">
							投资管理
							</td>
							<td style="width: 215px">新增投资</td>
						</tr>
						<tr style="height: 100px">
						    <td style="width: 215px">
								<div>
								    <s:if test="#request.records!=null">
									<s:set value="#request.records" id="record"></s:set>
									<s:iterator value="#record" id="record">
										<s:property value="#record.investent_deposit" />&nbsp;
										<br>
									</s:iterator>
									</s:if>
								</div>
							</td>
							<td style="width: 215px">
								<div>
								    <s:if test="#request.records!=null">
									<s:set value="#request.records" id="record"></s:set>
									<s:iterator value="#record" id="record">
										<s:property value="#record.investent_year" />&nbsp;
										<br>
									</s:iterator>
									</s:if>
								</div>
							</td>
							<td style="width: 215px">
								<div>
								    <s:if test="#request.varieties!=null">
									<s:set value="#request.varieties" id="varietiy"></s:set>
									<s:iterator value="#varietiy" id="varietiy">
										<s:property value="#varietiy.type_name" />&nbsp;
										<br>
									</s:iterator>
									</s:if>
								</div>
							</td>
							<td>
							    <div>
								    <s:if test="#request.records!=null">
									<s:set value="#request.records" id="record"></s:set>
									<s:iterator value="#record" id="record">
										<s:property value="#record.investent_rate" />&nbsp;
										<br>
									</s:iterator>
									</s:if>
								</div>
							</td>
							
							<td style="width: 215px">
								<div>
								    <s:if test="#request.varieties!=null">
									<s:set value="#request.varieties" id="varietiy"></s:set>
									<s:iterator value="#varietiy" id="varietiy">
										<s:property value="#varietiy.formula" />&nbsp;
										<br>
									</s:iterator>
									</s:if>
								</div>
							</td>
							<td style="width: 215px">
								<div>
								    <s:if test="#request.records!=null">
									<s:set value="#request.records" id="record"></s:set>
									<s:iterator value="#record" id="record">
										<s:property value="#record.nowValue" />&nbsp;
										<br>
									</s:iterator>
									</s:if>
								</div>
							</td>
							<td style="width: 215px">
								<div>
								    <s:if test="#request.records!=null">
									<s:set value="#request.records" id="record"></s:set>
									<s:iterator value="#record" id="record">
										<a href="upData.action?record_id=<s:property value="#record.id"/>">删除</a>&nbsp;
										<a href="">修改</a>
										<br>
									</s:iterator>
									</s:if>
								</div>
							</td>
							<td style="width: 215px">
								<div>
									<form action="<%=path%>/addRecord.action" method="post">
                                        <div class="input-group input-group-lg">
											<span class="input-group-addon" id="sizing-addon1">投资资金</span>
											<input type="text" name="deposit" class="form-control"
												placeholder="投资资金" aria-describedby="sizing-addon1">
										</div>
										<div class="input-group input-group-lg">
											<span class="input-group-addon" id="sizing-addon1">投资年份</span>
											<input type="text" name="investent_year" class="form-control"
												placeholder="投资年份" aria-describedby="sizing-addon1">
										</div>
										<div class="input-group input-group-lg">
											<span class="input-group-addon" id="sizing-addon1">投资利息</span>
											<input type="text" name="interest_rate" class="form-control"
												 placeholder="投资利息"
												aria-describedby="sizing-addon1">
										</div>

										<div class="radio-line" style="margin-top: 10px">
											<label> <input type="radio" name="investent_type"
												id="optionsRadios1" value=1 checked>单利
											</label> <label> <input type="radio" name="optionsRadios"
												id="optionsRadios2" value=2>复利
											</label>
										</div>


										<div style="margin-top: 20px">
											<input type="submit" value="新增" width="215px"
												style="font-size: 20px;color: green">

										</div>
									</form>
							</td>

						</tr>
					</table>
					<div><jsp:include page="common/footer.jsp"></jsp:include></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>


<!-- navigation end -->