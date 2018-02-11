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

<title>首页</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" href="CSS/index.css">
<script type="text/javascript" src="JS/jquery.js"></script>
<script type="text/javascript" src="JS/framework.js"></script>
<script src="JS/jquery-1.7.1.min.js"></script>
<script src="JS/superfish.js"></script>
<script src="JS/jquery.easing.1.3.js"></script>
<script src="JS/tms-0.4.1.js"></script>
<script src="JS/slider.js"></script>

</head>

<body>
	<header>
	<div class="inner">
		<h1 class="logo">
			<a href="home.html">AgroPlus - Agriculture company</a>
		</h1>

		<div class="wold"></div>
	</div>
	<div class="slider-container">
		<div class="mp-slider">
			<ul class="items">
				<li><img src="IMAGES/slide-1.jpg" alt="" />
					<div class="banner mp-ban-1">
						<span class="row-1">We're</span><span class="row-2">a
							family</span><span class="row-3"> 我们是一家人</span>
					</div></li>
				<li><img src="IMAGES/slide-2.jpg" alt="" />
					<div class="banner mp-ban-2">
						<span class="row-1">互联网+时代</span><span class="row-2"></span><span
							class="row-3">大数据才是王道</span>
					</div></li>


			</ul>
		</div>
	</div>
	<a href="#" class="mp-prev"></a> <a href="#" class="mp-next"></a> </header>
	<section id="content">
	<div class="conter">
		<div class="num">
			<h2>资料分类:</h2>
			<p>
				<span>计算机基础</span> <a
					<s:if test="%{#session.username!=null}"> href="os"</s:if>>操作系统</a>
				<a href="pl">编程语言</a> <a href="office">office办公软件</a> <a href="mdt">例会制图工具
				</a>
			</p>
			<p>
				<span>数学基础</span> <a href="am">高等数学</a> <a href="la">线性代数</a> <a
					href="statistics">统计学</a> <a href="pt">概率论</a>
			</p>
			<p>
				<span>数学分析工具</span> <a href="dat">常用数据分析工具</a> <a href="msd">多源数据</a><a
					href="daa">数据分析经典算法</a><a href="dam">数据分析模型</a><a href="dv">数据可视化呈现</a>
			</p>
			<p>
				<span>数据仓库、数据挖掘</span> <a href="dw">数据仓库</a> <a href="olap">OLAP——联机分析处理</a>
				<a href="dma">数据挖掘经典算法</a> <a href="ml">机器学习</a>
			</p>
			<p>
				<span>数据库</span><a href="rd">关系型数据库</a> <a href="nrd">非关系型数据库</a>

			</p>
			<p>
				<span>虚拟化、云计算、大数据处理</span> <a href="bdpf">大数据分布式处理框架</a> <a
					href="cmp">云计算管理平台</a>

			</p>
			<p>
				<span>web开发</span> <a href="wf">Web前端开发</a> <a href="wb">Web后台实现</a>

			</p>
			<p>
				<span>数据可视化</span> <a href="sov">基于软件操作可视化</a> <a href="wiv">基于网页交互式可视化</a>

			</p>
			<p>
				<span>数字图像处理</span> <a href="matlab">MATLAB基础</a> <a href="dip">数字图像处理基础</a>
				<a href="ipp">图像预处理</a> <a href="ice">图像特征提取</a> <a href="ipa">图像处理经典算法</a>
				<a href="pr">模式识别</a> <a href="gui">图像GUI集成界面</a>

			</p>
			<p>
				<span>移动应用开发</span> <a href="app">安卓App开发</a>


			</p>

		</div>
	
		<div class="deng-new">

			<div class="new">
				<h2>新闻</h2>
				<ul class="new-ul">
					<li><img src="IMAGES/new-1.jpg"><a href="index">这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题</a></li>
					<li><img src="IMAGES/new-1.jpg"><a href="index">这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题</a></li>
					<li><img src="IMAGES/new-1.jpg"><a href="index">这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题</a></li>
					<li><img src="IMAGES/new-1.jpg"><a href="index">这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题</a></li>
					<li><img src="IMAGES/new-1.jpg"><a href="index">这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题</a></li>
					<li><img src="IMAGES/new-1.jpg"><a href="index">这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题</a></li>
					<li><img src="IMAGES/new-1.jpg"><a href="index">这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题这个是新闻的标题</a></li>
				</ul>
				<p>
					<a href="index">更多</a>
				</p>
			</div>
		</div>
		<div id="Main">
			<input type="radio" name="tab" id="tab1" class="tabs"
				checked="checked"> <label for="tab1">
				<div class="bg1">
					<dl id="dl1">
						<dt>
							<img src="IMAGES/but1.png" width="40" />
						</dt>
						<dd class="title">精心挑选，倾情推荐</dd>
						<dd>推荐精品应用，享受多彩上网</dd>
					</dl>
				</div>
			</label> <input type="radio" name="tab" id="tab2" class="tabs"> <label
				for="tab2">
				<div class="bg2">
					<dl id="dl2">
						<dt>
							<img src="IMAGES/but2.png" width="40" />
						</dt>
						<dd class="title">精心挑选，倾情推荐</dd>
						<dd>推荐精品应用，享受多彩上网</dd>
					</dl>
				</div>
			</label> <input type="radio" name="tab" id="tab3" class="tabs"> <label
				for="tab3">
				<div class="bg3">
					<dl id="dl3">
						<dt>
							<img src="IMAGES/but3.png" width="40" />
						</dt>
						<dd class="title">精心挑选，倾情推荐</dd>
						<dd>推荐精品应用，享受多彩上网</dd>
					</dl>
				</div>
			</label> <input type="radio" name="tab" id="tab4" class="tabs"> <label
				for="tab4">
				<div class="bg4">
					<dl id="dl4">
						<dt>
							<img src="IMAGES/but4.png" width="40" />
						</dt>
						<dd class="title">精心挑选，倾情推荐</dd>
						<dd>推荐精品应用，享受多彩上网</dd>
					</dl>
				</div>
			</label> <img src="IMAGES/1.png" class="tp" id="img1" /> <img
				src="IMAGES/2.png" class="tp" id="img2" /> <img src="IMAGES/3.png"
				class="tp" id="img3" /> <img src="IMAGES/4.png" class="tp"
				id="img4" />



		</div>
		<div class="friendlink">

			<h2>友情链接</h2>


			<div id="marquee1" class="marqueeleft">
				<div style="width:8000px;">
					<ul id="marquee1_1">
						<li><a href="index" target="_blank"><img src="IMAGES/1.png"
								width="200px" ; height="60px;" /></a></li>
						<li><a href="index" target="_blank"><img src="IMAGES/2.png"
								width="200px" ; height="60px;" /></a></li>
						<li><a href="index" target="_blank"><img src="IMAGES/3.png"
								width="200px" ; height="60px;" /></a></li>
						<li><a href="index" target="_blank"><img src="IMAGES/4.png"
								width="200px" ; height="60px;" /></a></li>
						<li><a href="index" target="_blank"><img src="IMAGES/1.png"
								width="200px" ; height="60px;" /></a></li>
					</ul>
					<ul id="marquee1_2"></ul>
				</div>
			</div>
			<!--marqueeleft end-->
			<script type="text/javascript">
				marqueeStart(1, "left");
			</script>
		</div>
		<!--marqueeleft end-->


	</div>

	</div>
	<%@include file="../same/tail.jsp"%>
</body>
</html>
