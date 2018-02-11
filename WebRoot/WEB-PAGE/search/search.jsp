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

<title>搜索界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" href="CSS/style1.css" type="text/css" />
<link type="text/css" rel="stylesheet" href="CSS/framework.css">
<script type="text/javascript" src="JS/jquery.js"></script>
<script type="text/javascript" src="JS/framework.js"></script>
<script type="text/javascript" src="JS/stop.js"></script>

</head>

<body onLoad="time()">
	<%@include file="../same/header.jsp"%>
	<div class="container">
		<div class="container-top">
			<p>信息检索 > 信息查询</p>
		</div>
		<div class="container-fl">
			<ul>
				<li>>查询的信息( <span> <strong>注：</strong>资料可能已被删除
				</span>)
				</li>
			</ul>
		</div>


		<div class="container-ctn">

			<div class="container-ctn_one">


				<div id="ls">
					<ul id="container-content-column" style="display: block; ">
						<li style="font-weight: 900;"><a
							style="width: 350px; background:none; padding-left: 50px;">资料名称</a> <a
							style="width: 80px;">上传者</a> <a style="width: 110px;">上传时间</a> <a
							style="width: 120px;">第一级目录</a> <a
							style="width: 120px;">第二级目录</a>
				
						</li>
						
					<s:iterator id="id" value="information">
						
						<li>
								<a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;" style="width: 
								350px;padding-left: 50px;"><s:property value="name" /></a>
								<a style="width: 80px;"><s:property
										value="uploader" /></a>
								<a style="width: 110px;"><s:property
										value="createtime" /></a>
								<a style="width: 120px;"><s:property
										value="firstmenu" /></a>
										<a style="width: 120px;"><s:property
										value="secondmenu" /></a>
					
						</li>
						
					</s:iterator>
					</ul></div>
				
				
			</div>

		</div>
	</div>
	<%@include file="../same/tail.jsp"%>
</body>
</html>
