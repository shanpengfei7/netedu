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

<title>Web后台实现</title>

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
			<p>Web开发 > Web后台实现</p>
		</div>
		<div class="container-fl">
			<ul>
				<li>>JDBC</li>
				<li>>Servlet</li>
				<li>>Jsp</li>
				<li>>Struts2</li>
				<li>>Hibernate</li>
				<li>>Spring</li>
			</ul>
		</div>
		<div>
			<div class="container-content" id="container-content-1"
				style="display:block">

				<h2 id="1">JDBC</h2>
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
						<s:iterator id="id" value="jdbcV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="jdbcS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="jdbcB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="jdbcD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="jdbcO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-2">

				<h2 id="1">Servlet</h2>
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
						<s:iterator id="id" value="servletV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="servletS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="servletB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="servletD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="servletO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-3">

				<h2 id="1">JSP</h2>
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
						<s:iterator id="id" value="jspV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="jspS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="jspB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="jspD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="jspO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-4">

				<h2 id="1">struts2</h2>
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
						<s:iterator id="id" value="struts2V">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="struts2S">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="struts2B">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="struts2D">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="struts2O">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-5">

				<h2 id="1">Hibernate</h2>
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
						<s:iterator id="id" value="hibernateV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="hibernateS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="hibernateB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="hibernateD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="hibernateO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-6">

				<h2 id="1">Spring</h2>
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
						<s:iterator id="id" value="springV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="springS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="springB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="springD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="springO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_background&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
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