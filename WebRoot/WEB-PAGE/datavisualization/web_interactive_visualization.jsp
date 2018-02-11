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

<title>基于网页交互式可视化</title>

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
			<p>数据可视化> 基于网页交互式可视化</p>
		</div>
		<div class="container-fl">
			<ul>
				<li>>Arbor.js</li>
				<li>>CartoDB</li>
				<li>>Chroma.js</li>
				<li>>D3.js</li>
			</ul>
		</div>
		<div>
			<div class="container-content" id="container-content-1"
				style="display:block">

				<h2 id="1">Arbor.js</h2>
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
						<s:iterator id="id" value="ArborV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ArborS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ArborB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ArborD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ArborO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-2">

				<h2 id="1">CartoDB</h2>
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
						<s:iterator id="id" value="CartoDBV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="CartoDBS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="CartoDBB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="CartoDBD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="CartoDBO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-3">

				<h2 id="1">Chroma.js</h2>
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
						<s:iterator id="id" value="ChromaV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ChromaS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ChromaB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ChromaD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ChromaO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-4">

				<h2 id="1">D3.js</h2>
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
						<s:iterator id="id" value="D3V">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="D3S">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="D3B">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="D3D">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="D3O">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=web_interactive_visualization&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
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