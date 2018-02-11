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

<title>上传成功</title>

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
	background: url(IMAGES/sc.png) no-repeat;
	float: left;
	padding-bottom: 100px;
}
</style>



</head>

<body>
	<header>
	<div class="banner"></div>
	</header>
	<section id="content" style="width:550px;">
	<div class="pic"></div>
	<div class="rig"
		style="width:250px;float:left;height:230px;font-size:24px;color:#0033FF;padding-left:60px;">
		<h2 style="padding-top:50px;padding-left:50px;padding-bottom:75px;">恭喜你已经上传成功！</h2>
		<a href="up">
			<button
				style="background:#0080C0;width:100px;height:40px;border:none;color:#CCCCCC;border-radius:3px;font-size:16px;font-weight:bold;">继续上传</button>
		</a> &nbsp;&nbsp;&nbsp; <a href="index"
			style="background:#0080C0;padding-left:17px;display:block;width:83px;height:40px;line-height:40px;float:right;border:none;color:#CCCCCC;border-radius:3px;font-size:16px;font-weight:bold;text-decoration:none;">返回首页</a>

	</div>
	<%@include file="../same/tail.jsp"%>
</body>
</html>
