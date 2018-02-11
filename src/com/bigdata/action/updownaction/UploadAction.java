package com.bigdata.action.updownaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.bigdata.entity.onesavetable.AllDatum;
import com.bigdata.util.Cut;
import com.bigdata.util.DateToStringMethod;
import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<File> datum;
	private List<String> datumContentType;
	private List<String> datumFileName;
	private String menu;
	private String extension;
	private String firstmenu;
	private String secondmenu;
	private String uploader;
	private String tablename;
	private ServiceDaoImpl serviceDaoImpl;
	private AllDatum allDatum;
	private String allowedTypes;

	@Override
	public String execute() throws Exception {
		if (datumFileName == null) {
			return ActionSupport.LOGIN;
		}
		if (extension.equals("请选择")) {
			addFieldError("errors", "您未把四种类型全部选择上");
			return ActionSupport.INPUT;
		}
		String datumType = datumContentType.get(0);
		for (String fileType : datumContentType) {
			while (!datumType.equals(fileType)) {
				addFieldError("errors", "您选择的四种文件类型不一致");
				return ActionSupport.INPUT;
			}
		}

		for (String fileName : datumFileName) {

			if ((serviceDaoImpl.getObjectByname(this.getTableName(secondmenu),
					fileName)).size() > 0) {
				addFieldError("errors", "错误未知，请联系管理员!(可能是" + fileName
						+ "已被上传,请重新上传。)");
				return ActionSupport.INPUT;
			}
		}
		ServletContext servletContext = ServletActionContext
				.getServletContext();

		for (int i = 0; i < datum.size(); i++) {
			String path = servletContext.getRealPath("/DATA~!/" + firstmenu
					+ "/" + secondmenu + "/" + menu + "/" + extension);
			FileInputStream in = new FileInputStream(datum.get(i));
			FileOutputStream out = new FileOutputStream(path + "/"
					+ datumFileName.get(i));
			byte[] buffer = new byte[1024];
			int len = 0;

			while ((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len);
			}
			out.close();
			in.close();
			datum.get(i).delete();
			String createtime = DateToStringMethod.DateToStr(new Date());
			this.saveToOneTable(createtime, path, datumFileName.get(i));

			path = Cut.filterStr(path);
			this.saveToEveryTable(createtime, path, datumFileName.get(i));
		}
		return ActionSupport.SUCCESS;

	}

	public void saveToOneTable(String createtime, String path, String fileName) {
		allDatum.setCreatetime(createtime);
		allDatum.setFirstmenu(firstmenu);
		allDatum.setFourthmenu(extension);
		allDatum.setName(fileName);
		allDatum.setPath(path);
		allDatum.setSecondmenu(secondmenu);
		allDatum.setThirdmenu(menu);
		allDatum.setUploader(uploader);
		serviceDaoImpl.save(allDatum);
	}

	public void saveToEveryTable(String createtime, String path, String fileName) {
		serviceDaoImpl.saveByQuery(this.getTableName(secondmenu), createtime,
				extension, menu, fileName, path, uploader);
	}

	public String getTableName(String secondmenu) {
		switch (secondmenu) {
		case "操作系统":
			tablename = "operating_system";
			break;
		case "编程语言":
			tablename = "program_language";
			break;
		case "office办公软件":
			tablename = "office";
			break;
		case "例会制图工具":
			tablename = "meeting_drawing_tools";
			break;
		case "高等数学":
			tablename = "advanced_mathematics";
			break;
		case "线性代数":
			tablename = "linear_algebra";
			break;
		case "统计学":
			tablename = "statistics";
			break;
		case "概率论":
			tablename = "probability_theory";
			break;
		case "常用数据分析工具":
			tablename = "data_analysis_tools";
			break;
		case "多源数据":
			tablename = "multi_source_data";
			break;
		case "数据分析经典算法":
			tablename = "data_analysis_algorithms";
			break;
		case "数据分析模型":
			tablename = "data_analysis_model";
			break;
		case "数据可视化呈现":
			tablename = "data_visualization";
			break;
		case "数据仓库":
			tablename = "dw";
			break;
		case "OLAP——联机分析处理":
			tablename = "olap";
			break;
		case "数据挖掘经典算法":
			tablename = "data_mining_algorithms";
			break;
		case "机器学习":
			tablename = "machine_learning";
			break;
		case "关系型数据库":
			tablename = "relational_database";
			break;
		case "非关系型数据库":
			tablename = "non_relational_database";
			break;
		case "大数据分布式处理框架":
			tablename = "bigdata_distributed_processing_framework";
			break;
		case "云计算管理平台":
			tablename = "cloud_management_platform";
			break;
		case "Web前端开发":
			tablename = "web_front";
			break;
		case "Web后台实现":
			tablename = "web_background";
			break;
		case "基于软件操作可视化":
			tablename = "software_operation_visualization";
			break;
		case "基于网页交互式可视化":
			tablename = "web_interactive_visualization";
			break;
		case "MATLAB基础":
			tablename = "matlab";
			break;
		case "数字图像处理基础":
			tablename = "digital_image_processing";
			break;
		case "图像预处理":
			tablename = "image_pre_processing";
			break;
		case "图像特征提取":
			tablename = "image_characteristics_extraction";
			break;
		case "图像处理经典算法":
			tablename = "image_processing_algorithm";
			break;
		case "模式识别":
			tablename = "pattern_recognition";
			break;
		case "图像GUI集成界面":
			tablename = "gui";
			break;
		case "安卓App开发":
			tablename = "app";
			break;

		default:
			break;
		}
		return tablename;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public AllDatum getAllDatum() {
		return allDatum;
	}

	@Resource
	public void setAllDatum(AllDatum allDatum) {
		this.allDatum = allDatum;
	}

	public ServiceDaoImpl getServiceDaoImpl() {
		return serviceDaoImpl;
	}

	@Resource
	public void setServiceDaoImpl(ServiceDaoImpl serviceDaoImpl) {
		this.serviceDaoImpl = serviceDaoImpl;
	}

	public List<File> getDatum() {
		return datum;
	}

	public void setDatum(List<File> datum) {
		this.datum = datum;
	}

	public List<String> getDatumContentType() {
		return datumContentType;
	}

	public void setDatumContentType(List<String> datumContentType) {
		this.datumContentType = datumContentType;
	}

	public List<String> getDatumFileName() {
		return datumFileName;
	}

	public void setDatumFileName(List<String> datumFileName) {
		this.datumFileName = datumFileName;
	}

	public String getAllowedTypes() {
		return allowedTypes;
	}

	public void setAllowedTypes(String allowedTypes) {
		this.allowedTypes = allowedTypes;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getFirstmenu() {
		return firstmenu;
	}

	public void setFirstmenu(String firstmenu) {
		this.firstmenu = firstmenu;
	}

	public String getSecondmenu() {
		return secondmenu;
	}

	public void setSecondmenu(String secondmenu) {
		this.secondmenu = secondmenu;
	}

}
