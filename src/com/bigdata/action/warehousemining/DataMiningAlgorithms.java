package com.bigdata.action.warehousemining;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 数据挖掘经典算法
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class DataMiningAlgorithms extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowmiV;
	private List knowmiS;
	private List knowmiB;
	private List knowmiD;
	private List knowmiO;

	public List getKnowmiV() {
		return knowmiV;
	}

	public void setKnowmiV(List knowmiV) {
		this.knowmiV = knowmiV;
	}

	public List getKnowmiS() {
		return knowmiS;
	}

	public void setKnowmiS(List knowmiS) {
		this.knowmiS = knowmiS;
	}

	public List getKnowmiB() {
		return knowmiB;
	}

	public void setKnowmiB(List knowmiB) {
		this.knowmiB = knowmiB;
	}

	public List getKnowmiD() {
		return knowmiD;
	}

	public void setKnowmiD(List knowmiD) {
		this.knowmiD = knowmiD;
	}

	public List getKnowmiO() {
		return knowmiO;
	}

	public void setKnowmiO(List knowmiO) {
		this.knowmiO = knowmiO;
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
		knowmiV = serviceDaoImpl.getList("DataMiningAlgorithms", "知识", "视频资料");
		knowmiS = serviceDaoImpl.getList("DataMiningAlgorithms", "知识", "学习笔记");
		knowmiB = serviceDaoImpl.getList("DataMiningAlgorithms", "知识", "电子书类");
		knowmiD = serviceDaoImpl.getList("DataMiningAlgorithms", "知识", "参考文献");
		knowmiO = serviceDaoImpl.getList("DataMiningAlgorithms", "知识", "其它资料");
		return SUCCESS;
	}
}
