<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>注册界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link type="text/css" rel="stylesheet" href="CSS/registered.css">
<script type="text/javascript" src="JS/jquery.js"></script>
<script type="text/javascript" src="JS/framework.js"></script>
<script type="text/javascript" src="JS/sanjiliandong.js"></script>
<style type="text/css">
ul li input {
	margin-left: 5px;
	
}

ul li.button input, ul li.button a {
	background: #66BFE9;
	padding: 5px 10px;
	display: block;
	float: left;
	border: none;
	font-size: 16px;
	color: #FFFFFF;
	margin-right: 20px;
	font-weight: 500;
	cursor: pointer;}

ul li.button a:link, ul li.button a:visited {
	font-size: 16px;
	padding: 6px 12px;
	text-decoration: none;
}

ul li.button a:hover {
	
}
ul li span{ width:80px;  text-align: right; display:block; float:left;}
</style>
</head>

<body>
	<header>
	<div class="banner">
		<div></div>
	</div>
	</header>
	<section id="content">
	<div class="registered">
		<p style=" background:#66BFE9; color:#FFFFFF; font-weight:900;padding: 0; text-align: center;">用户注册</p>
		<form action="register" method="post">
			<ul>
				<li><span>姓名:</span><input
					type="text" name="username"></li>
				<li><span>密码:</span><input
					type="password" name="password"></li>
				<li><span>确认密码:</span><input type="password" name="password2"></li>
				<li><span>手机号:</span><input type="text"
					name="number"></li>
				<li><span>组名:</span> <select
					name="cars">
						<option value="0">请选择</option>
						<option value="1">架构与数据采集小组</option>
						<option value="2">数据分析小组</option>
						<option value="3">可视化展示小组</option>
						<option value="4">医学图像处理小组</option>
				</select></li>
				<li class="button"><input type="submit" value="注册"><input
					type="reset" value="重置"><a href="index">返回</a></li>
			</ul>

			</li>
		</form>
	</div>

	</div>

	</div>
	<%@include file="../same/tail.jsp"%>
</body>
</html>
