package com.bigdata.action.mathbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 统计学
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class Statistics extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowsV;
	private List knowsS;
	private List knowsB;
	private List knowsD;
	private List knowsO;

	public List getKnowsV() {
		return knowsV;
	}

	public void setKnowsV(List knowsV) {
		this.knowsV = knowsV;
	}

	public List getKnowsS() {
		return knowsS;
	}

	public void setKnowsS(List knowsS) {
		this.knowsS = knowsS;
	}

	public List getKnowsB() {
		return knowsB;
	}

	public void setKnowsB(List knowsB) {
		this.knowsB = knowsB;
	}

	public List getKnowsD() {
		return knowsD;
	}

	public void setKnowsD(List knowsD) {
		this.knowsD = knowsD;
	}

	public List getKnowsO() {
		return knowsO;
	}

	public void setKnowsO(List knowsO) {
		this.knowsO = knowsO;
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
		knowsV = serviceDaoImpl.getList("Statistics", "基础知识", "视频资料");
		knowsS = serviceDaoImpl.getList("Statistics", "基础知识", "学习笔记");
		knowsB = serviceDaoImpl.getList("Statistics", "基础知识", "电子书类");
		knowsD = serviceDaoImpl.getList("Statistics", "基础知识", "参考文献");
		knowsO = serviceDaoImpl.getList("Statistics", "基础知识", "其它资料");
		return SUCCESS;
	}
}
