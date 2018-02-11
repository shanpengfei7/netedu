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

<title>大数据分布式处理框架</title>

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
			<p>虚拟化、云计算、大数据处理 > 大数据分布式处理框架</p>
		</div>
		<div class="container-fl">
			<ul>
				<li>>HDFS</li>
				<li>>MapReduce</li>
				<li>>HBase</li>
				<li>Hive</li>
				<li>>Zookeeper</li>
				<li>>Avro</li>
				<li>Pig</li>
				<li>>Ambari</li>
				<li>>Sqoop</li>
			</ul>
		</div>
		<div>
			<div class="container-content" id="container-content-1"
				style="display:block">

				<h2 id="1">HDFS</h2>
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
						<s:iterator id="id" value="HDFSV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HDFSS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HDFSB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HDFSD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HDFSO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-2">

				<h2 id="1">MapReduce</h2>
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
						<s:iterator id="id" value="MapReduceV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="MapReduceS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="MapReduceB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="MapReduceD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="MapReduceO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-3">

				<h2 id="1">HBase</h2>
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
						<s:iterator id="id" value="HBaseV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HBaseS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HBaseB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HBaseD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HBaseO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-4">

				<h2 id="1">Hive</h2>
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
						<s:iterator id="id" value="HiveV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HiveS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HiveB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HiveD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="HiveO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-5">

				<h2 id="1">Zookeeper</h2>
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
						<s:iterator id="id" value="ZookeeperV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ZookeeperS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ZookeeperB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ZookeeperD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="ZookeeperO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-6">

				<h2 id="1">Avro</h2>
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
						<s:iterator id="id" value="AvroV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="AvroS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="AvroB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="AvroD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="AvroO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-7">

				<h2 id="1">Pig</h2>
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
						<s:iterator id="id" value="PigV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="PigS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="PigB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="PigD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="PigO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-8">

				<h2 id="1">Ambari</h2>
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
						<s:iterator id="id" value="AmbariV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="AmbariS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="AmbariB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="AmbariD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="AmbariO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
				</div>
			</div>
			<div class="container-content" id="container-content-9">

				<h2 id="1">Sqoop</h2>
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
						<s:iterator id="id" value="SqoopV">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="SqoopS">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="SqoopB">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="SqoopD">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
								</s:if></li>
						</s:iterator>
					</ul>
					<ul id="container-content-column">
						<s:iterator id="id" value="SqoopO">

							<li><a id="pic" href="<s:property value="name" />"
								onclick="stop_go(); return false;"><s:property value="name" /></a><a><s:property
										value="uploader" /></a> <a><s:property value="createtime" /></a><a
								href="filedownload?fileName=<s:property value="path" />\<s:property value="name" />">下载</a>
								<s:if test="%{#session.grade==1}">
									<a
										href="filedelete?tableName=bigdata_distributed_processing_framework&id=<s:property value="id" />&fileName=<s:property value="path" />\<s:property value="name" />">删除</a>
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