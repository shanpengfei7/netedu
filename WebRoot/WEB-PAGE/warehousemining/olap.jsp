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

<title>OLAP——联机分析处理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<%@include file="../same/dress.jsp"%>

</head>

<body onLoad="time()">
	<%@include file="../same/header.jsp"%>
	<div class="container">
		<div class="container-top">
			<p>数据仓库、数据挖掘 > OLAP——联机分析处理</p>
		</div>
		<div class="container-fl">
			<ul>
				<li>>资料</li>
			</ul>
		</div>
		<div>
			<div class="container-content" id="container-content-1"
				style="display:block">

				<h2 id="1">OLAP——联机分析处理</h2>
				<ul class="container-content-li">
					<li>视频资料</li>
					<li>学习笔记</li>
					<li>电子书类</li>
					<li>参考文献</li>
					<li>其它资料</li>
					<span class="hover_bar"></span>
				</ul>


				<div class="container-content-column">
					<ul id="container-content-column" style="display: block;">
						<s:iterator id="id" value="knowolapV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=olap&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="knowolapS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=olap&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="knowolapB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=olap&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="knowolapD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=olap&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="knowolapO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=olap&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<%@include file="../same/tail.jsp"%>
</body>
</html>