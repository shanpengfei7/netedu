package com.bigdata.action.delete;

import java.io.File;

import javax.annotation.Resource;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 用于删除文件和数据库中的记录
 * 
 * @author 单鹏飞
 *
 */
public class Delete extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private String tableName;
	private int id;
	private String fileName;
	private String returnresult;

	public String getReturnresult() {
		return returnresult;
	}

	public void setReturnresult(String returnresult) {
		this.returnresult = returnresult;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ServiceDaoImpl getServiceDaoImpl() {
		return serviceDaoImpl;
	}

	@Resource
	public void setServiceDaoImpl(ServiceDaoImpl serviceDaoImpl) {
		this.serviceDaoImpl = serviceDaoImpl;
	}

	public String execute() throws Exception {

		String pathname = this.getFrontPath() + "DATA~!" + fileName;
		File file = new File(pathname);
		if (file.exists()) {
			file.delete();
		}
		
		serviceDaoImpl.deleteByQuery(tableName, id);
		this.getReturnResultName(tableName);
		return SUCCESS;
	}

	/**
	 * 拿到tomcat下项目的路径
	 * 
	 * @return
	 */
	public String getFrontPath() {
		String frontpath = this.getClass().getResource("/").getPath();
		frontpath = frontpath.substring(1, frontpath.length() - 16);
		return frontpath;
	}

	public String getReturnResultName(String tableName) {
		switch (tableName) {
		case "operating_system":
			returnresult = "os";
			break;
		case "program_language":
			returnresult = "pl";
			break;
		case "office":
			returnresult = "office";
			break;
		case "meeting_drawing_tools":
			returnresult = "mdt";
			break;
		case "advanced_mathematics":
			returnresult = "am";
			break;
		case "linear_algebra":
			returnresult = "la";
			break;
		case "statistics":
			returnresult = "statistics";
			break;
		case "probability_theory":
			returnresult = "pt";
			break;
		case "data_analysis_tools":
			returnresult = "dat";
			break;
		case "multi_source_data":
			returnresult = "msd";
			break;
		case "data_analysis_algorithms":
			returnresult = "daa";
			break;
		case "data_analysis_model":
			returnresult = "dam";
			break;
		case "data_visualization":
			returnresult = "dv";
			break;
		case "dw":
			returnresult = "dw";
			break;
		case "olap":
			returnresult = "olap";
			break;
		case "data_mining_algorithms":
			returnresult = "dma";
			break;
		case "machine_learning":
			returnresult = "ml";
			break;
		case "relational_database":
			returnresult = "rd";
			break;
		case "non_relational_database":
			returnresult = "nrd";
			break;
		case "bigdata_distributed_processing_framework":
			returnresult = "bdpf";
			break;
		case "cloud_management_platform":
			returnresult = "cmp";
			break;
		case "web_front":
			returnresult = "wf";
			break;
		case "web_background":
			returnresult = "wb";
			break;
		case "software_operation_visualization":
			returnresult = "sov";
			break;
		case "web_interactive_visualization":
			returnresult = "wiv";
			break;
		case "matlab":
			returnresult = "matlab";
			break;
		case "digital_image_processing":
			returnresult = "dip";
			break;
		case "image_pre_processing":
			returnresult = "ipp";
			break;
		case "image_characteristics_extraction":
			returnresult = "ice";
			break;
		case "image_processing_algorithm":
			returnresult = "ipa";
			break;
		case "pattern_recognition":
			returnresult = "pr";
			break;
		case "gui":
			returnresult = "gui";
			break;
		case "app":
			returnresult = "app";
			break;

		default:
			break;
		}
		return returnresult;
	}

}
