package com.bigdata.action.dataanalysisbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 数据分析模型
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class DataAnalysisModel extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowdamV;
	private List knowdamS;
	private List knowdamB;
	private List knowdamD;
	private List knowdamO;

	public List getKnowdamV() {
		return knowdamV;
	}

	public void setKnowdamV(List knowdamV) {
		this.knowdamV = knowdamV;
	}

	public List getKnowdamS() {
		return knowdamS;
	}

	public void setKnowdamS(List knowdamS) {
		this.knowdamS = knowdamS;
	}

	public List getKnowdamB() {
		return knowdamB;
	}

	public void setKnowdamB(List knowdamB) {
		this.knowdamB = knowdamB;
	}

	public List getKnowdamD() {
		return knowdamD;
	}

	public void setKnowdamD(List knowdamD) {
		this.knowdamD = knowdamD;
	}

	public List getKnowdamO() {
		return knowdamO;
	}

	public void setKnowdamO(List knowdamO) {
		this.knowdamO = knowdamO;
	}

	public ServiceDaoImpl getServiceDaoImpl() {
		return serviceDaoImpl;
	}

	@Resource
	public void setServiceDaoImpl(ServiceDaoImpl serviceDaoImpl) {
		this.serviceDaoImpl = serviceDaoImpl;
	}

	@Override
	public String execute() throws Exception {
		knowdamV = serviceDaoImpl.getList("DataAnalysisModel", "知识", "视频资料");
		knowdamS = serviceDaoImpl.getList("DataAnalysisModel", "知识", "学习笔记");
		knowdamB = serviceDaoImpl.getList("DataAnalysisModel", "知识", "电子书类");
		knowdamD = serviceDaoImpl.getList("DataAnalysisModel", "知识", "参考文献");
		knowdamO = serviceDaoImpl.getList("DataAnalysisModel", "知识", "其它资料");
		return SUCCESS;
	}
}
