<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><%@taglib
	prefix="s" uri="/struts-tags"%>
<header>
	
	<div class="banner">
	<div class="header-top">
		<ul class="top-li">
			<li><a href="index">首页</a></li>
			<li><a href="register">注册</a></li>
			<li><a href="leave">退出</a></li>
			<li><a href="up" target="_black">上传</a></li>
			<s:if test="%{#session.grade==1}">
				<li><a href="member">人员管理</a></li>
			</s:if>
		</ul>
		<p id="g-pclock"></p>
		<p class="debark">欢迎&nbsp;${sessionScope.username }&nbsp;的登录</p>
	</div>
		<form action="search" method="get">
			<input type="search" name="putin" placeholder="请输入您所搜索的内容"
				class="search"> <input type="submit"
				placeholder="请输入您所搜索的内容" value="" class="button">
		</form>
	</div>
</header>
<section id="content">
	<div class="content">
	<nav>
		<h3 style="font-size: 25px;">资料目录</h3>
		<ul>
			<li>
				<h3>
					<a>计算机基础</a>
				</h3>

				<div class="box">

					<a href="os">操作系统</a> <a href="pl">编程语言</a> <a href="office">office办公软件</a>
					<a href="mdt">例会制图工具 </a>
				</div>
			</li>
			<li>
				<h3>数学基础</h3>

				<div class="box">
					<a href="am">高等数学</a> <a href="la">线性代数</a> <a href="statistics">统计学</a>
					<a href="pt">概率论</a>
				</div>
			</li>
			<li>
				<h3>数据分析基础</h3>
				<div class="box">
					<a href="dat">常用数据分析工具</a> <a href="msd">多源数据</a><a href="daa">数据分析经典算法</a><a
						href="dam">数据分析模型</a><a href="dv">数据可视化呈现</a>
				</div>
			</li>
			<li>
				<h3>数据仓库、数据挖掘</h3>
				<div class="box">
					<a href="dw">数据仓库</a> <a href="olap">OLAP——联机分析处理</a> <a href="dma">数据挖掘经典算法</a>
					<a href="ml">机器学习</a>
				</div>
			</li>
			<li>
				<h3>数据库</h3>
				<div class="box">
					<a href="rd">关系型数据库</a> <a href="nrd">非关系型数据库</a>
				</div>
			</li>
			<li>
				<h3>虚拟化、云计算、大数据处理</h3>
				<div class="box">
					<a href="bdpf">大数据分布式处理框架</a> <a href="cmp">云计算管理平台</a>
				</div>
			</li>
			<li>
				<h3>Web开发</h3>
				<div class="box">
					<a href="wf">Web前端开发</a> <a href="wb">Web后台实现</a>
				</div>
			</li>
			<li>
				<h3>数据可视化</h3>
				<div class="box">
					<a href="sov">基于软件操作可视化</a> <a href="wiv">基于网页交互式可视化</a>
				</div>
			</li>
			<li>
				<h3>数字图像处理</h3>
				<div class="box">
					<a href="matlab">MATLAB基础</a> <a href="dip">数字图像处理基础</a> <a
						href="ipp">图像预处理</a> <a href="ice">图像特征提取</a> <a href="ipa">图像处理经典算法</a>
					<a href="pr">模式识别</a> <a href="gui">图像GUI集成界面</a>
				</div>
			</li>
			<li>
				<h3>移动应用开发</h3>
				<div class="box">
					<a href="app">移动app开发</a>
				</div>
			</li>
		</ul>
	</nav>