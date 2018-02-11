package com.bigdata.action.mathbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 线性代数
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class LinearAlgebra extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowlV;
	private List knowlS;
	private List knowlB;
	private List knowlD;
	private List knowlO;

	public List getKnowlV() {
		return knowlV;
	}

	public void setKnowlV(List knowlV) {
		this.knowlV = knowlV;
	}

	public List getKnowlS() {
		return knowlS;
	}

	public void setKnowlS(List knowlS) {
		this.knowlS = knowlS;
	}

	public List getKnowlB() {
		return knowlB;
	}

	public void setKnowlB(List knowlB) {
		this.knowlB = knowlB;
	}

	public List getKnowlD() {
		return knowlD;
	}

	public void setKnowlD(List knowlD) {
		this.knowlD = knowlD;
	}

	public List getKnowlO() {
		return knowlO;
	}

	public void setKnowlO(List knowlO) {
		this.knowlO = knowlO;
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
		knowlV = serviceDaoImpl.getList("LinearAlgebra", "基础知识", "视频资料");
		knowlS = serviceDaoImpl.getList("LinearAlgebra", "基础知识", "学习笔记");
		knowlB = serviceDaoImpl.getList("LinearAlgebra", "基础知识", "电子书类");
		knowlD = serviceDaoImpl.getList("LinearAlgebra", "基础知识", "参考文献");
		knowlO = serviceDaoImpl.getList("LinearAlgebra", "基础知识", "其它资料");
		return SUCCESS;
	}
}
