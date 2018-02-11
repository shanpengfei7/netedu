<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>人员管理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link type="text/css" rel="stylesheet" href="CSS/framework.css">
<script type="text/javascript" src="JS/jquery.js"></script>
<script type="text/javascript" src="JS/framework.js"></script>
<script type="text/javascript" src="JS/stop.js"></script>
<style type="text/css">
#container-content-column li a:nth-of-type(1){background: none;}
</style>
<body onclick="time()"><%@include file="../same/header.jsp"%>
	<div class="container">
		<div class="container-top">
			<p>数据可视化 > 基于软件操作可视化</p>
		</div>
		<div class="container-content" style="display:block;">
			<h2>大数据分析科研团队</h2>


			<div class="container-content-column">
				<ul id="container-content-column" style="display: block;">
					<li style="font-weight: 900;"><a
						style="width: 200px;padding-left: 50px;">姓名</a> <a
						style="width: 200px;">组别</a> <a style="width: 200px;">手机号码</a> <a
						style="width: 200px;">删除</a></li>
					<s:iterator id="id" value="members">
						<li><a style="width: 200px;padding-left: 50px;"><s:property
									value="username" /></a> <s:if test="%{#id.groupname==5}">
								<a style="width: 200px;">教师</a>
							</s:if> <s:else>

								<a style="width: 200px;"><s:property value="groupname" /></a>
							</s:else> <a style="width: 200px;"><s:property value="number" /></a> <a
							style="width: 200px;"
							href="removemem?id=<s:property value="id" />">删除</a></li>
					</s:iterator>
				</ul>
			</div>
		</div>

	</div>
	<%@include file="../same/tail.jsp"%>
</body>
</html>
