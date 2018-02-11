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

<title>上传失败</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link type="text/css" rel="stylesheet" href="CSS/registered.css">
<script type="text/javascript" src="JS/jquery.js"></script>
<script type="text/javascript" src="JS/framework.js"></script>
<style type="text/css">
.pic {
	width: 200px;
	height: 200px;
	background: url(IMAGES/fail.png) no-repeat;
	float: left;
	padding-bottom: 100px;
}
</style>



</head>

<body onLoad="time()">
	<header>
	<div class="banner"></div>
	</header>
	<section id="content" style="width:550px;">
	<div class="pic"></div>
	<div class="rig"
		style="width:250px;float:left;height:230px;font-size:24px;color:#0033FF;padding-left:60px;">
		<h2 style="padding-top:50px;padding-left:50px;padding-bottom:75px;">对不起，<font color="red">由于<s:property value="errors.errors[0]" /></font>，您的上传失败了，请返回重新上传！</h2>

		<a href="up"
			style="background:#0080C0;
			margin-left:40px;
			
			padding-left:70px;
			display:block;
			width:123px;
			height:40px;
			line-height:40px;
			border:none;
			color:#CCCCCC;
			border-radius:3px;
			font-size:20px;
			font-weight:bold;
			text-decoration:none;">返回</a>

	</div>
	<%@include file="../same/tail.jsp"%>
</body>
</html>
