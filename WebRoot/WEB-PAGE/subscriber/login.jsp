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

<title>登陆界面</title>

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
ul {
	margin-top: px;
}

ul li {
	padding-top: 10px;
	margin-bottom: 20px;
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
}

ul li.button a:link, ul li.button a:visited {
	font-size: 16px;
	padding: 5px 10px;
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
		<p
			style=" padding:0px; background:#66BFE9; color:#FFFFFF; font-weight:900;text-align: center;">用户登
			录</p>
		<form action="login" method="post">
			<ul class="on-1">
				<li><span>手机号码</span><input type="text"
					placeholder="<s:property value="errors.loginError[0]" />输入手机号码/用户名"
					name="number"></li>
				<li><span>用户密码</span><input type="password" placeholder="请输入密码"
					name="password"></li>
				<li class="button"><input type="submit" value="登陆"><input
					type="reset" value="重置"><a href="register">注册</a></li>
			</ul>
		</form>
	</div>
	</div>
	</div>
	</section>
	<footer>
	<div>
		<p>
			<small>CopyRight 2014 &copy |医学数据挖掘与大数据分析科研团队 Java团队
				QQ群号:313429021</small>
		</p>
		<p>
			<small>本站请使用IE9或以上版本 1366*768为最佳效果</small>
		</p>

	</div>
	</footer>
</body>


</html>
