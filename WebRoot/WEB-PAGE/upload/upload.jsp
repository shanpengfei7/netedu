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

<title>上传</title>

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
ul li span {
	width: 80px;
	text-align: right;
	display: block;
	float: left;
}
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
		<form action="up" method="post" enctype="multipart/form-data">
			<s:property value="errors.errors[0]" />
			<p>上传</p>
			<ul class="on-1">

				<li><span>姓名:</span><input type="text"
					value="${sessionScope.username }" name="uploader"></li>
				<li><span>文件选择:</span><input type="file" id="in" name="datum"
					multiple=" multiple" /></li>
				<li class="on-3"><span>类型选择</span> <SELECT ID="x1"
					NAME="firstmenu">
						<OPTION selected></OPTION>
				</SELECT></li>
				<li class="on-3"><span>类型选择</span> <SELECT ID="x2"
					NAME="secondmenu">
						<OPTION selected>请选择</OPTION>
				</SELECT></li>
				<li class="on-3"><span>类型选择</span> <SELECT ID="x3" NAME="menu">
						<OPTION selected>请选择</OPTION>
				</SELECT></li>
				<li class="on-3"><span>类型选择</span> <SELECT ID="x4"
					NAME="extension">
						<OPTION selected>请选择</OPTION>
				</SELECT></li>
			</ul>
			<input type="submit" id="sub" value="上传资料">
		</form>
	</div>

	</div>

	</div>
	</section>
	<script language="javascript">
		//例子1-------------------------------------------------------------
		//数据源
		var array2 = new Array();
		array2[0] = new Array("计算机基础", "根目录", "计算机基础"); //数据格式 ID，父级ID，名称
		array2[1] = new Array("数学基础", "根目录", "数学基础");
		array2[2] = new Array("数据分析基础", "根目录", "数据分析基础");
		array2[3] = new Array("数据仓库、数据挖掘", "根目录", "数据仓库、数据挖掘");
		array2[4] = new Array("数据库", "根目录", "数据库");
		array2[5] = new Array("虚拟化、云计算、大数据处理", "根目录", "虚拟化、云计算、大数据处理");
		array2[6] = new Array("Web开发", "根目录", "Web开发");
		array2[7] = new Array("数据可视化", "根目录", "数据可视化");
		array2[8] = new Array("数字图像处理", "根目录", "数字图像处理");
		array2[9] = new Array("移动应用开发", "根目录", "移动应用开发");

		array2[10] = new Array("操作系统", "计算机基础", "操作系统");
		array2[11] = new Array("编程语言", "计算机基础", "编程语言");
		array2[12] = new Array("office办公软件", "计算机基础", "office办公软件");
		array2[13] = new Array("例会制图工具 ", "计算机基础", "例会制图工具 ");

		array2[14] = new Array("高等数学", "数学基础", "高等数学");
		array2[15] = new Array("线性代数", "数学基础", "线性代数");
		array2[16] = new Array("统计学", "数学基础", "统计学");
		array2[17] = new Array("概率论", "数学基础", "概率论");

		array2[18] = new Array("常用数据分析工具", "数据分析基础", "常用数据分析工具");
		array2[19] = new Array("多源数据", "数据分析基础", "多源数据");
		array2[20] = new Array("数据分析经典算法", "数据分析基础", "数据分析经典算法");
		array2[21] = new Array("数据分析模型", "数据分析基础", "数据分析模型");
		array2[22] = new Array("数据可视化呈现", "数据分析基础", "数据可视化呈现");

		array2[23] = new Array("数据仓库", "数据仓库、数据挖掘", "数据仓库");
		array2[24] = new Array("OLAP——联机分析处理", "数据仓库、数据挖掘", "OLAP——联机分析处理");
		array2[25] = new Array("数据挖掘经典算法", "数据仓库、数据挖掘", "数据挖掘经典算法");
		array2[26] = new Array("机器学习", "数据仓库、数据挖掘", "机器学习");

		array2[27] = new Array("关系型数据库", "数据库", "关系型数据库");
		array2[28] = new Array("非关系型数据库", "数据库", "非关系型数据库");

		array2[29] = new Array("大数据分布式处理框架", "虚拟化、云计算、大数据处理", "大数据分布式处理框架");
		array2[30] = new Array("云计算管理平台", "虚拟化、云计算、大数据处理", "云计算管理平台");

		array2[31] = new Array("Web前端开发", "Web开发", "Web前端开发");
		array2[32] = new Array("Web后台实现", "Web开发", "Web后台实现");

		array2[33] = new Array("基于软件操作可视化", "数据可视化", "基于软件操作可视化");
		array2[34] = new Array("基于网页交互式可视化", "数据可视化", "基于网页交互式可视化");

		array2[35] = new Array("MATLAB基础", "数字图像处理", "MATLAB基础");
		array2[36] = new Array("数字图像处理基础", "数字图像处理", "数字图像处理基础");
		array2[37] = new Array("图像预处理", "数字图像处理", "图像预处理");
		array2[38] = new Array("图像特征提取", "数字图像处理", "图像特征提取");
		array2[39] = new Array("图像处理经典算法", "数字图像处理", "图像处理经典算法");
		array2[40] = new Array("模式识别", "数字图像处理", "模式识别");
		array2[41] = new Array("图像GUI集成界面", "数字图像处理", "图像GUI集成界面");

		array2[42] = new Array("安卓App开发", "移动应用开发", "安卓App开发");

		/*三级菜单*/

		//计算机基础
		array2[43] = new Array("Linux操作系统", "操作系统", "Linux操作系统");
		array2[44] = new Array("Windows操作系统", "操作系统", "Windows操作系统");
		array2[45] = new Array("服务器操作系统", "操作系统", "服务器操作系统");

		array2[46] = new Array("C与C加加", "编程语言", "C与C加加");
		array2[47] = new Array("Java", "编程语言", "Java");
		array2[48] = new Array("Python", "编程语言", "Python");

		array2[49] = new Array("PPT", "office办公软件", "PPT");
		array2[50] = new Array("Word", "office办公软件", "Word");
		array2[51] = new Array("Excel", "office办公软件", "Excel");

		array2[52] = new Array("Visio", "例会制图工具", "Visio");
		array2[53] = new Array("Imindmap", "例会制图工具", "Imindmap");
		array2[54] = new Array("TheBrain", "例会制图工具", "TheBrain");

		//数学基础
		array2[55] = new Array("基础知识", "高等数学", "基础知识");
		array2[56] = new Array("基础知识", "线性代数", "基础知识");
		array2[57] = new Array("基础知识", "统计学", "基础知识");
		array2[58] = new Array("基础知识", "概率论", "基础知识");

		//数据分析基础
		array2[59] = new Array("R", "常用数据分析工具", "R");
		array2[60] = new Array("Python", "常用数据分析工具", "Python");
		array2[61] = new Array("Spass", "常用数据分析工具", "Spass");
		array2[62] = new Array("SAS", "常用数据分析工具", "SAS");
		array2[63] = new Array("Weka", "常用数据分析工具", "Weka");

		array2[64] = new Array("工业", "多源数据", "工业");

		array2[65] = new Array("知识", "数据分析经典算法", "知识");
		array2[66] = new Array("知识", "数据分析模型", "知识");
		array2[67] = new Array("知识", "数据可视化呈现", "知识");

		//四、数据仓库、数据挖掘

		array2[68] = new Array("知识", "数据仓库", "知识");
		array2[69] = new Array("知识", "OLAP——联机分析处理", "知识");
		array2[70] = new Array("知识", "数据挖掘经典算法", "知识");
		array2[71] = new Array("知识", "机器学习", "知识");

		//五、数据库
		array2[72] = new Array("SQLserver", "关系型数据库", "SQLserver");
		array2[73] = new Array("MySql", "关系型数据库", "MySql");

		array2[74] = new Array("HBase", "非关系型数据库", "HBase");
		array2[75] = new Array("HDFS", "非关系型数据库", "HDFS");
		array2[76] = new Array("MongoDb", "非关系型数据库", "MongoDb");
		array2[77] = new Array("OracleBDB", "非关系型数据库", "OracleBDB");
		array2[78] = new Array("Riak", "非关系型数据库", "Riak");

		//六、虚拟化、云计算、大数据处理
		array2[79] = new Array("HDFS", "大数据分布式处理框架", "HDFS");
		array2[80] = new Array("MapReduce", "大数据分布式处理框架", "MapReduce");
		array2[81] = new Array("HBase", "大数据分布式处理框架", "HBase");
		array2[82] = new Array("Hive", "大数据分布式处理框架", "Hive");
		array2[83] = new Array("Zookeeper", "大数据分布式处理框架", "Zookeeper");
		array2[84] = new Array("Avro", "大数据分布式处理框架", "Avro");
		array2[85] = new Array("Pig", "大数据分布式处理框架", "Pig");
		array2[86] = new Array("Ambari", "大数递据分布式处理框架", "Ambari");
		array2[87] = new Array("Sqoop", "大数递据分布式处理框架", "Sqoop");

		array2[88] = new Array("Openstack", "云计算管理平台", "Openstack")
		array2[89] = new Array("CloudStack", "云计算管理平台", "CloudStack")

		//七、Web开发
		array2[90] = new Array("Html5", "Web前端开发", "Html5")
		array2[91] = new Array("Css", "Web前端开发", "Css")
		array2[92] = new Array("Javascript", "Web前端开发", "Javascript")
		array2[93] = new Array("Jquery", "Web前端开发", "Jquery")
		array2[94] = new Array("Ajax", "Web前端开发", "Ajax")

		array2[95] = new Array("JDBC", "Web后台实现", "JDBC")
		array2[96] = new Array("Servlet", "Web后台实现", "Servlet")
		array2[97] = new Array("Jsp", "Web后台实现", "Jsp")
		array2[98] = new Array("Struts2", "Web后台实现", "Struts2")
		array2[99] = new Array("Hibernate", "Web后台实现", "Hibernate")
		array2[100] = new Array("Spring", "Web后台实现", "Spring")

		//八、数据可视化
		array2[101] = new Array("R语言基础画图", "基于软件操作可视化", "R语言基础画图")
		array2[102] = new Array("R语言ggplot2画图", "基于软件操作可视化", "R语言ggplot2画图")
		array2[103] = new Array("基于R语言地图数据可视化", "基于软件操作可视化", "基于R语言地图数据可视化")
		array2[104] = new Array("Spass分析工具的可视化", "基于软件操作可视化", "Spass分析工具的可视化")
		array2[105] = new Array("Tableau数据可视化", "基于软件操作可视化", "Tableau数据可视化")
		array2[106] = new Array("ECharts", "基于软件操作可视化", "ECharts")

		array2[107] = new Array("Arbor.js", "基于网页交互式可视化", "Arbor.js")
		array2[108] = new Array("CartoDB", "基于网页交互式可视化", "CartoDB")
		array2[109] = new Array("Chroma.js", "基于网页交互式可视化", "Chroma.js")
		array2[110] = new Array("D3.js", "基于网页交互式可视化", "D3.js")

		//九、数字图像处理

		array2[111] = new Array("知识", "MATLAB基础", "知识");
		array2[112] = new Array("知识", "数字图像处理基础", "知识");
		array2[113] = new Array("知识", "图像预处理", "知识");
		array2[114] = new Array("知识", "图像特征提取", "知识");
		array2[115] = new Array("知识", "图像处理经典算法", "知识");
		array2[116] = new Array("知识", "模式识别", "知识");
		array2[117] = new Array("知识", "图像GUI集成界面", "知识");

		//十、移动应用开发
		array2[118] = new Array("知识", "安卓App开发", "知识");

		/第四级联动/

		array2[119] = new Array("视频资料", "知识", "视频资料");
		array2[120] = new Array("学习笔记", "知识", "学习笔记");
		array2[121] = new Array("电子书类", "知识", "电子书类");
		array2[122] = new Array("参考文献", "知识", "参考文献");
		array2[123] = new Array("其它资料", "知识", "其它资料");

		array2[124] = new Array("视频资料", "Linux操作系统", "视频资料");
		array2[125] = new Array("学习笔记", "Linux操作系统", "学习笔记");
		array2[126] = new Array("电子书类", "Linux操作系统", "电子书类");
		array2[127] = new Array("参考文献", "Linux操作系统", "参考文献");
		array2[128] = new Array("其它资料", "Linux操作系统", "其它资料");

		array2[129] = new Array("视频资料", "Windows操作系统", "视频资料");
		array2[130] = new Array("学习笔记", "Windows操作系统", "学习笔记");
		array2[131] = new Array("电子书类", "Windows操作系统", "电子书类");
		array2[132] = new Array("参考文献", "Windows操作系统", "参考文献");
		array2[133] = new Array("其它资料", "Windows操作系统", "其它资料");

		array2[134] = new Array("视频资料", "服务器操作系统", "视频资料");
		array2[135] = new Array("学习笔记", "服务器操作系统", "学习笔记");
		array2[136] = new Array("电子书类", "服务器操作系统", "电子书类");
		array2[137] = new Array("参考文献", "服务器操作系统", "参考文献");
		array2[138] = new Array("其它资料", "服务器操作系统", "其它资料");

		array2[139] = new Array("视频资料", "C与C加加", "视频资料");
		array2[140] = new Array("学习笔记", "C与C加加", "学习笔记");
		array2[141] = new Array("电子书类", "C与C加加", "电子书类");
		array2[142] = new Array("参考文献", "C与C加加", "参考文献");
		array2[143] = new Array("其它资料", "C与C加加", "其它资料");

		array2[144] = new Array("视频资料", "Java", "视频资料");
		array2[145] = new Array("学习笔记", "Java", "学习笔记");
		array2[146] = new Array("电子书类", "Java", "电子书类");
		array2[147] = new Array("参考文献", "Java", "参考文献");
		array2[148] = new Array("其它资料", "Java", "其它资料");

		array2[149] = new Array("视频资料", "Python", "视频资料");
		array2[150] = new Array("学习笔记", "Python", "学习笔记");
		array2[151] = new Array("电子书类", "Python", "电子书类");
		array2[152] = new Array("参考文献", "Python", "参考文献");
		array2[153] = new Array("其它资料", "Python", "其它资料");

		array2[154] = new Array("视频资料", "PPT", "视频资料");
		array2[155] = new Array("学习笔记", "PPT", "学习笔记");
		array2[156] = new Array("电子书类", "PPT", "电子书类");
		array2[157] = new Array("参考文献", "PPT", "参考文献");
		array2[158] = new Array("其它资料", "PPT", "其它资料");

		array2[159] = new Array("视频资料", "Word", "视频资料");
		array2[160] = new Array("学习笔记", "Word", "学习笔记");
		array2[161] = new Array("电子书类", "Word", "电子书类");
		array2[162] = new Array("参考文献", "Word", "参考文献");
		array2[163] = new Array("其它资料", "Word", "其它资料");

		array2[164] = new Array("视频资料", "Excel", "视频资料");
		array2[165] = new Array("学习笔记", "Excel", "学习笔记");
		array2[166] = new Array("电子书类", "Excel", "电子书类");
		array2[167] = new Array("参考文献", "Excel", "参考文献");
		array2[168] = new Array("其它资料", "Excel", "其它资料");

		array2[169] = new Array("视频资料", "Visio", "视频资料");
		array2[170] = new Array("学习笔记", "Visio", "学习笔记");
		array2[171] = new Array("电子书类", "Visio", "电子书类");
		array2[172] = new Array("参考文献", "Visio", "参考文献");
		array2[173] = new Array("其它资料", "Visio", "其它资料");

		array2[174] = new Array("视频资料", "Imindmap", "视频资料");
		array2[175] = new Array("学习笔记", "Imindmap", "学习笔记");
		array2[176] = new Array("电子书类", "Imindmap", "电子书类");
		array2[177] = new Array("参考文献", "Imindmap", "参考文献");
		array2[178] = new Array("其它资料", "Imindmap", "其它资料");

		array2[179] = new Array("视频资料", "TheBrain", "视频资料");
		array2[180] = new Array("学习笔记", "TheBrain", "学习笔记");
		array2[181] = new Array("电子书类", "TheBrain", "电子书类");
		array2[182] = new Array("参考文献", "TheBrain", "参考文献");
		array2[183] = new Array("其它资料", "TheBrain", "其它资料");

		array2[184] = new Array("视频资料", "能源", "视频资料");
		array2[185] = new Array("学习笔记", "能源", "学习笔记");
		array2[186] = new Array("电子书类", "能源", "电子书类");
		array2[187] = new Array("参考文献", "能源", "参考文献");
		array2[188] = new Array("其它资料", "能源", "其它资料")

		array2[189] = new Array("视频资料", "农业", "视频资料");
		array2[190] = new Array("学习笔记", "农业", "学习笔记");
		array2[191] = new Array("电子书类", "农业", "电子书类");
		array2[192] = new Array("参考文献", "农业", "参考文献");
		array2[193] = new Array("其它资料", "农业", "其它资料")

		array2[194] = new Array("视频资料", "气象", "视频资料");
		array2[195] = new Array("学习笔记", "气象", "学习笔记");
		array2[196] = new Array("电子书类", "气象", "电子书类");
		array2[197] = new Array("参考文献", "气象", "参考文献");
		array2[198] = new Array("其它资料", "气象", "其它资料")

		array2[199] = new Array("视频资料", "食品", "视频资料");
		array2[200] = new Array("学习笔记", "食品", "学习笔记");
		array2[201] = new Array("电子书类", "食品", "电子书类");
		array2[202] = new Array("参考文献", "食品", "参考文献");
		array2[203] = new Array("其它资料", "食品", "其它资料")

		array2[204] = new Array("视频资料", "R", "视频资料");
		array2[205] = new Array("学习笔记", "R", "学习笔记");
		array2[206] = new Array("电子书类", "R", "电子书类");
		array2[207] = new Array("参考文献", "R", "参考文献");
		array2[208] = new Array("其它资料", "R", "其它资料");

		array2[209] = new Array("视频资料", "基础知识", "视频资料");
		array2[210] = new Array("学习笔记", "基础知识", "学习笔记");
		array2[211] = new Array("电子书类", "基础知识", "电子书类");
		array2[212] = new Array("参考文献", "基础知识", "参考文献");
		array2[213] = new Array("其它资料", "基础知识", "其它资料");

		array2[214] = new Array("视频资料", "Spass", "视频资料");
		array2[215] = new Array("学习笔记", "Spass", "学习笔记");
		array2[216] = new Array("电子书类", "Spass", "电子书类");
		array2[217] = new Array("参考文献", "Spass", "参考文献");
		array2[218] = new Array("其它资料", "Spass", "其它资料");

		array2[219] = new Array("视频资料", "SAS", "视频资料");
		array2[220] = new Array("学习笔记", "SAS", "学习笔记");
		array2[221] = new Array("电子书类", "SAS", "电子书类");
		array2[222] = new Array("参考文献", "SAS", "参考文献");
		array2[223] = new Array("其它资料", "SAS", "其它资料");

		array2[224] = new Array("视频资料", "Weka", "视频资料");
		array2[225] = new Array("学习笔记", "Weka", "学习笔记");
		array2[226] = new Array("电子书类", "Weka", "电子书类");
		array2[227] = new Array("参考文献", "Weka", "参考文献");
		array2[228] = new Array("其它资料", "Weka", "其它资料");

		array2[229] = new Array("视频资料", "工业", "视频资料");
		array2[230] = new Array("学习笔记", "工业", "学习笔记");
		array2[231] = new Array("电子书类", "工业", "电子书类");
		array2[232] = new Array("参考文献", "工业", "参考文献");
		array2[233] = new Array("其它资料", "工业", "其它资料");

		array2[224] = new Array("视频资料", "SQLserver", "视频资料");
		array2[225] = new Array("学习笔记", "SQLserver", "学习笔记");
		array2[226] = new Array("电子书类", "SQLserver", "电子书类");
		array2[227] = new Array("参考文献", "SQLserver", "参考文献");
		array2[228] = new Array("其它资料", "SQLserver", "其它资料");

		array2[229] = new Array("视频资料", "MySql", "视频资料");
		array2[230] = new Array("学习笔记", "MySql", "学习笔记");
		array2[231] = new Array("电子书类", "MySql", "电子书类");
		array2[232] = new Array("参考文献", "MySql", "参考文献");
		array2[233] = new Array("其它资料", "MySql", "其它资料");

		array2[234] = new Array("视频资料", "HBase", "视频资料");
		array2[235] = new Array("学习笔记", "HBase", "学习笔记");
		array2[236] = new Array("电子书类", "HBase", "电子书类");
		array2[237] = new Array("参考文献", "HBase", "参考文献");
		array2[238] = new Array("其它资料", "HBase", "其它资料");

		array2[239] = new Array("视频资料", "MongoDb", "视频资料");
		array2[240] = new Array("学习笔记", "MongoDb", "学习笔记");
		array2[241] = new Array("电子书类", "MongoDb", "电子书类");
		array2[242] = new Array("参考文献", "MongoDb", "参考文献");
		array2[243] = new Array("其它资料", "MongoDb", "其它资料");

		array2[244] = new Array("视频资料", "OracleBDB", "视频资料");
		array2[245] = new Array("学习笔记", "OracleBDB", "学习笔记");
		array2[246] = new Array("电子书类", "OracleBDB", "电子书类");
		array2[247] = new Array("参考文献", "OracleBDB", "参考文献");
		array2[248] = new Array("其它资料", "OracleBDB", "其它资料");

		array2[249] = new Array("视频资料", "Riak", "视频资料");
		array2[250] = new Array("学习笔记", "Riak", "学习笔记");
		array2[251] = new Array("电子书类", "Riak", "电子书类");
		array2[252] = new Array("参考文献", "Riak", "参考文献");
		array2[253] = new Array("其它资料", "Riak", "其它资料");

		array2[254] = new Array("视频资料", "体育", "视频资料");
		array2[255] = new Array("学习笔记", "体育", "学习笔记");
		array2[256] = new Array("电子书类", "体育", "电子书类");
		array2[257] = new Array("参考文献", "体育", "参考文献");
		array2[258] = new Array("其它资料", "体育", "其它资料");

		array2[259] = new Array("视频资料", "MapReduce", "视频资料");
		array2[260] = new Array("学习笔记", "MapReduce", "学习笔记");
		array2[261] = new Array("电子书类", "MapReduce", "电子书类");
		array2[262] = new Array("参考文献", "MapReduce", "参考文献");
		array2[263] = new Array("其它资料", "MapReduce", "其它资料");

		array2[264] = new Array("视频资料", "医疗", "视频资料");
		array2[265] = new Array("学习笔记", "医疗", "学习笔记");
		array2[266] = new Array("电子书类", "医疗", "电子书类");
		array2[267] = new Array("参考文献", "医疗", "参考文献");
		array2[268] = new Array("其它资料", "医疗", "其它资料");

		array2[269] = new Array("视频资料", "Hive", "视频资料");
		array2[270] = new Array("学习笔记", "Hive", "学习笔记");
		array2[271] = new Array("电子书类", "Hive", "电子书类");
		array2[272] = new Array("参考文献", "Hive", "参考文献");
		array2[273] = new Array("其它资料", "Hive", "其它资料");

		array2[274] = new Array("视频资料", "Zookeeper", "视频资料");
		array2[275] = new Array("学习笔记", "Zookeeper", "学习笔记");
		array2[276] = new Array("电子书类", "Zookeeper", "电子书类");
		array2[277] = new Array("参考文献", "Zookeeper", "参考文献");
		array2[278] = new Array("其它资料", "Zookeeper", "其它资料");

		array2[279] = new Array("视频资料", "Avro", "视频资料");
		array2[280] = new Array("学习笔记", "Avro", "学习笔记");
		array2[281] = new Array("电子书类", "Avro", "电子书类");
		array2[282] = new Array("参考文献", "Avro", "参考文献");
		array2[283] = new Array("其它资料", "Avro", "其它资料");

		array2[284] = new Array("视频资料", "Pig", "视频资料");
		array2[285] = new Array("学习笔记", "Pig", "学习笔记");
		array2[286] = new Array("电子书类", "Pig", "电子书类");
		array2[287] = new Array("参考文献", "Pig", "参考文献");
		array2[288] = new Array("其它资料", "Pig", "其它资料");

		array2[289] = new Array("视频资料", "Ambari", "视频资料");
		array2[290] = new Array("学习笔记", "Ambari", "学习笔记");
		array2[291] = new Array("电子书类", "Ambari", "电子书类");
		array2[292] = new Array("参考文献", "Ambari", "参考文献");
		array2[293] = new Array("其它资料", "Ambari", "其它资料");

		array2[294] = new Array("视频资料", "Sqoop", "视频资料");
		array2[295] = new Array("学习笔记", "Sqoop", "学习笔记");
		array2[296] = new Array("电子书类", "Sqoop", "电子书类");
		array2[297] = new Array("参考文献", "Sqoop", "参考文献");
		array2[298] = new Array("其它资料", "Sqoop", "其它资料");

		array2[299] = new Array("视频资料", "Openstack", "视频资料");
		array2[300] = new Array("学习笔记", "Openstack", "学习笔记");
		array2[301] = new Array("电子书类", "Openstack", "电子书类");
		array2[302] = new Array("参考文献", "Openstack", "参考文献");
		array2[303] = new Array("其它资料", "Openstack", "其它资料");

		array2[304] = new Array("视频资料", "CloudStack", "视频资料");
		array2[305] = new Array("学习笔记", "CloudStack", "学习笔记");
		array2[306] = new Array("电子书类", "CloudStack", "电子书类");
		array2[307] = new Array("参考文献", "CloudStack", "参考文献");
		array2[308] = new Array("其它资料", "CloudStack", "其它资料");

		array2[309] = new Array("视频资料", "Html5", "视频资料");
		array2[310] = new Array("学习笔记", "Html5", "学习笔记");
		array2[311] = new Array("电子书类", "Html5", "电子书类");
		array2[312] = new Array("参考文献", "Html5", "参考文献");
		array2[313] = new Array("其它资料", "Html5", "其它资料");

		array2[314] = new Array("视频资料", "Css", "视频资料");
		array2[315] = new Array("学习笔记", "Css", "学习笔记");
		array2[316] = new Array("电子书类", "Css", "电子书类");
		array2[317] = new Array("参考文献", "Css", "参考文献");
		array2[318] = new Array("其它资料", "Css", "其它资料");

		array2[319] = new Array("视频资料", "Javascript", "视频资料");
		array2[320] = new Array("学习笔记", "Javascript", "学习笔记");
		array2[321] = new Array("电子书类", "Javascript", "电子书类");
		array2[322] = new Array("参考文献", "Javascript", "参考文献");
		array2[323] = new Array("其它资料", "Javascript", "其它资料");

		array2[324] = new Array("视频资料", "Jquery", "视频资料");
		array2[325] = new Array("学习笔记", "Jquery", "学习笔记");
		array2[326] = new Array("电子书类", "Jquery", "电子书类");
		array2[327] = new Array("参考文献", "Jquery", "参考文献");
		array2[328] = new Array("其它资料", "Jquery", "其它资料");

		array2[329] = new Array("视频资料", "Ajax", "视频资料");
		array2[330] = new Array("学习笔记", "Ajax", "学习笔记");
		array2[331] = new Array("电子书类", "Ajax", "电子书类");
		array2[332] = new Array("参考文献", "Ajax", "参考文献");
		array2[333] = new Array("其它资料", "Ajax", "其它资料");

		array2[334] = new Array("视频资料", "JDBC", "视频资料");
		array2[335] = new Array("学习笔记", "JDBC", "学习笔记");
		array2[336] = new Array("电子书类", "JDBC", "电子书类");
		array2[337] = new Array("参考文献", "JDBC", "参考文献");
		array2[338] = new Array("其它资料", "JDBC", "其它资料");

		array2[339] = new Array("视频资料", "Servlet", "视频资料");
		array2[340] = new Array("学习笔记", "Servlet", "学习笔记");
		array2[341] = new Array("电子书类", "Servlet", "电子书类");
		array2[342] = new Array("参考文献", "Servlet", "参考文献");
		array2[343] = new Array("其它资料", "Servlet", "其它资料");

		array2[344] = new Array("视频资料", "Jsp", "视频资料");
		array2[345] = new Array("学习笔记", "Jsp", "学习笔记");
		array2[346] = new Array("电子书类", "Jsp", "电子书类");
		array2[347] = new Array("参考文献", "Jsp", "参考文献");
		array2[348] = new Array("其它资料", "Jsp", "其它资料");

		array2[349] = new Array("视频资料", "Struts2", "视频资料");
		array2[350] = new Array("学习笔记", "Struts2", "学习笔记");
		array2[351] = new Array("电子书类", "Struts2", "电子书类");
		array2[352] = new Array("参考文献", "Struts2", "参考文献");
		array2[353] = new Array("其它资料", "Struts2", "其它资料");

		array2[354] = new Array("视频资料", "Hibernate", "视频资料");
		array2[355] = new Array("学习笔记", "Hibernate", "学习笔记");
		array2[356] = new Array("电子书类", "Hibernate", "电子书类");
		array2[357] = new Array("参考文献", "Hibernate", "参考文献");
		array2[358] = new Array("其它资料", "Hibernate", "其它资料");

		array2[359] = new Array("视频资料", "Spring", "视频资料");
		array2[360] = new Array("学习笔记", "Spring", "学习笔记");
		array2[361] = new Array("电子书类", "Spring", "电子书类");
		array2[362] = new Array("参考文献", "Spring", "参考文献");
		array2[363] = new Array("其它资料", "Spring", "其它资料");

		array2[364] = new Array("视频资料", "R语言基础画图", "视频资料");
		array2[365] = new Array("学习笔记", "R语言基础画图", "学习笔记");
		array2[366] = new Array("电子书类", "R语言基础画图", "电子书类");
		array2[367] = new Array("参考文献", "R语言基础画图", "参考文献");
		array2[368] = new Array("其它资料", "R语言基础画图", "其它资料");

		array2[369] = new Array("视频资料", "R语言ggplot2画图", "视频资料");
		array2[370] = new Array("学习笔记", "R语言ggplot2画图", "学习笔记");
		array2[371] = new Array("电子书类", "R语言ggplot2画图", "电子书类");
		array2[372] = new Array("参考文献", "R语言ggplot2画图", "参考文献");
		array2[373] = new Array("其它资料", "R语言ggplot2画图", "其它资料");

		array2[374] = new Array("视频资料", "基于R语言地图数据可视化", "视频资料");
		array2[375] = new Array("学习笔记", "基于R语言地图数据可视化", "学习笔记");
		array2[376] = new Array("电子书类", "基于R语言地图数据可视化", "电子书类");
		array2[377] = new Array("参考文献", "基于R语言地图数据可视化", "参考文献");
		array2[378] = new Array("其它资料", "基于R语言地图数据可视化", "其它资料");

		array2[379] = new Array("视频资料", "Spass分析工具的可视化", "视频资料");
		array2[380] = new Array("学习笔记", "Spass分析工具的可视化", "学习笔记");
		array2[381] = new Array("电子书类", "Spass分析工具的可视化", "电子书类");
		array2[382] = new Array("参考文献", "Spass分析工具的可视化", "参考文献");
		array2[383] = new Array("其它资料", "Spass分析工具的可视化", "其它资料");

		array2[384] = new Array("视频资料", "Tableau数据可视化", "视频资料");
		array2[385] = new Array("学习笔记", "Tableau数据可视化", "学习笔记");
		array2[386] = new Array("电子书类", "Tableau数据可视化", "电子书类");
		array2[387] = new Array("参考文献", "Tableau数据可视化", "参考文献");
		array2[388] = new Array("其它资料", "Tableau数据可视化", "其它资料");

		array2[389] = new Array("视频资料", "ECharts", "视频资料");
		array2[390] = new Array("学习笔记", "ECharts", "学习笔记");
		array2[391] = new Array("电子书类", "ECharts", "电子书类");
		array2[392] = new Array("参考文献", "ECharts", "参考文献");
		array2[393] = new Array("其它资料", "ECharts", "其它资料");

		array2[394] = new Array("视频资料", "Arbor.js", "视频资料");
		array2[395] = new Array("学习笔记", "Arbor.js", "学习笔记");
		array2[396] = new Array("电子书类", "Arbor.js", "电子书类");
		array2[397] = new Array("参考文献", "Arbor.js", "参考文献");
		array2[398] = new Array("其它资料", "Arbor.js", "其它资料");

		array2[399] = new Array("视频资料", "CartoDB", "视频资料");
		array2[400] = new Array("学习笔记", "CartoDB", "学习笔记");
		array2[401] = new Array("电子书类", "CartoDB", "电子书类");
		array2[402] = new Array("参考文献", "CartoDB", "参考文献");
		array2[403] = new Array("其它资料", "CartoDB", "其它资料");

		array2[404] = new Array("视频资料", "Chroma.js", "视频资料");
		array2[405] = new Array("学习笔记", "Chroma.js", "学习笔记");
		array2[406] = new Array("电子书类", "Chroma.js", "电子书类");
		array2[407] = new Array("参考文献", "Chroma.js", "参考文献");
		array2[408] = new Array("其它资料", "Chroma.js", "其它资料");

		array2[409] = new Array("视频资料", "D3.js", "视频资料");
		array2[410] = new Array("学习笔记", "D3.js", "学习笔记");
		array2[411] = new Array("电子书类", "D3.js", "电子书类");
		array2[412] = new Array("参考文献", "D3.js", "参考文献");
		array2[413] = new Array("其它资料", "D3.js", "其它资料");

		array2[414] = new Array("公共卫生", "多源数据", "公共卫生");
		array2[415] = new Array("环境", "多源数据", "环境");
		array2[416] = new Array("教育", "多源数据", "教育");
		array2[417] = new Array("金融", "多源数据", "金融");
		array2[418] = new Array("能源", "多源数据", "能源");
		array2[419] = new Array("农业", "多源数据", "农业");
		array2[420] = new Array("气象", "多源数据", "气象");
		array2[421] = new Array("食品", "多源数据", "食品");
		array2[422] = new Array("体育", "多源数据", "体育");
		array2[423] = new Array("医疗", "多源数据", "医疗");

		array2[424] = new Array("视频资料", "公共卫生", "视频资料");
		array2[425] = new Array("学习笔记", "公共卫生", "学习笔记");
		array2[426] = new Array("电子书类", "公共卫生", "电子书类");
		array2[427] = new Array("参考文献", "公共卫生", "参考文献");
		array2[428] = new Array("其它资料", "公共卫生", "其它资料")

		array2[429] = new Array("视频资料", "环境", "视频资料");
		array2[430] = new Array("学习笔记", "环境", "学习笔记");
		array2[431] = new Array("电子书类", "环境", "电子书类");
		array2[432] = new Array("参考文献", "环境", "参考文献");
		array2[433] = new Array("其它资料", "环境", "其它资料")

		array2[434] = new Array("视频资料", "教育", "视频资料");
		array2[435] = new Array("学习笔记", "教育", "学习笔记");
		array2[436] = new Array("电子书类", "教育", "电子书类");
		array2[437] = new Array("参考文献", "教育", "参考文献");
		array2[438] = new Array("其它资料", "教育", "其它资料")

		array2[439] = new Array("视频资料", "金融", "视频资料");
		array2[440] = new Array("学习笔记", "金融", "学习笔记");
		array2[441] = new Array("电子书类", "金融", "电子书类");
		array2[442] = new Array("参考文献", "金融", "参考文献");
		array2[443] = new Array("其它资料", "金融", "其它资料")

		array2[444] = new Array("视频资料", "能源", "视频资料");
		array2[445] = new Array("学习笔记", "能源", "学习笔记");
		array2[446] = new Array("电子书类", "能源", "电子书类");
		array2[447] = new Array("参考文献", "能源", "参考文献");
		array2[448] = new Array("其它资料", "能源", "其它资料")

		array2[449] = new Array("视频资料", "农业", "视频资料");
		array2[450] = new Array("学习笔记", "农业", "学习笔记");
		array2[451] = new Array("电子书类", "农业", "电子书类");
		array2[452] = new Array("参考文献", "农业", "参考文献");
		array2[453] = new Array("其它资料", "农业", "其它资料")

		array2[454] = new Array("视频资料", "气象", "视频资料");
		array2[455] = new Array("学习笔记", "气象", "学习笔记");
		array2[456] = new Array("电子书类", "气象", "电子书类");
		array2[457] = new Array("参考文献", "气象", "参考文献");
		array2[458] = new Array("其它资料", "气象", "其它资料")

		array2[459] = new Array("视频资料", "食品", "视频资料");
		array2[460] = new Array("学习笔记", "食品", "学习笔记");
		array2[461] = new Array("电子书类", "食品", "电子书类");
		array2[462] = new Array("参考文献", "食品", "参考文献");
		array2[463] = new Array("其它资料", "食品", "其它资料")

		//--------------------------------------------
		//这是调用代码
		var liandong2 = new CLASS_LIANDONG_YAO(array2);
		//设置第一个选择框
		liandong2.firstSelectChange("根目录", "firstmenu");
		//设置子选择框
		liandong2.subSelectChange("firstmenu", "secondmenu")
		liandong2.subSelectChange("secondmenu", "menu")
		liandong2.subSelectChange("menu", "extension")
	</script>
	<footer> <br>
	<p>CopyRight 2014 &copy |医学数据挖掘与大数据分析科研团队 Java团队 QQ群号:313429021</p>

	<p>本站请使用IE9或以上版本 1366*768为最佳效果</p>
	</footer>
</body>
</html>
