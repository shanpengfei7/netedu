package com.bigdata.action.dataanalysisbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 数据可视化呈现
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class DataVisualization extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowdvzV;
	private List knowdvzS;
	private List knowdvzB;
	private List knowdvzD;
	private List knowdvzO;

	public List getKnowdvzV() {
		return knowdvzV;
	}

	public void setKnowdvzV(List knowdvzV) {
		this.knowdvzV = knowdvzV;
	}

	public List getKnowdvzS() {
		return knowdvzS;
	}

	public void setKnowdvzS(List knowdvzS) {
		this.knowdvzS = knowdvzS;
	}

	public List getKnowdvzB() {
		return knowdvzB;
	}

	public void setKnowdvzB(List knowdvzB) {
		this.knowdvzB = knowdvzB;
	}

	public List getKnowdvzD() {
		return knowdvzD;
	}

	public void setKnowdvzD(List knowdvzD) {
		this.knowdvzD = knowdvzD;
	}

	public List getKnowdvzO() {
		return knowdvzO;
	}

	public void setKnowdvzO(List knowdvzO) {
		this.knowdvzO = knowdvzO;
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
		knowdvzV = serviceDaoImpl.getList("DataVisualization", "知识", "视频资料");
		knowdvzS = serviceDaoImpl.getList("DataVisualization", "知识", "学习笔记");
		knowdvzB = serviceDaoImpl.getList("DataVisualization", "知识", "电子书类");
		knowdvzD = serviceDaoImpl.getList("DataVisualization", "知识", "参考文献");
		knowdvzO = serviceDaoImpl.getList("DataVisualization", "知识", "其它资料");
		return SUCCESS;
	}
}
