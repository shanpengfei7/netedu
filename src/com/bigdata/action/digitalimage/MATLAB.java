package com.bigdata.action.digitalimage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * MATLAB基础
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class MATLAB extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowmV;
	private List knowmS;
	private List knowmB;
	private List knowmD;
	private List knowmO;

	public List getKnowmV() {
		return knowmV;
	}

	public void setKnowmV(List knowmV) {
		this.knowmV = knowmV;
	}

	public List getKnowmS() {
		return knowmS;
	}

	public void setKnowmS(List knowmS) {
		this.knowmS = knowmS;
	}

	public List getKnowmB() {
		return knowmB;
	}

	public void setKnowmB(List knowmB) {
		this.knowmB = knowmB;
	}

	public List getKnowmD() {
		return knowmD;
	}

	public void setKnowmD(List knowmD) {
		this.knowmD = knowmD;
	}

	public List getKnowmO() {
		return knowmO;
	}

	public void setKnowmO(List knowmO) {
		this.knowmO = knowmO;
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
		knowmV = serviceDaoImpl.getList("MATLAB", "知识", "视频资料");
		knowmS = serviceDaoImpl.getList("MATLAB", "知识", "学习笔记");
		knowmB = serviceDaoImpl.getList("MATLAB", "知识", "电子书类");
		knowmD = serviceDaoImpl.getList("MATLAB", "知识", "参考文献");
		knowmO = serviceDaoImpl.getList("MATLAB", "知识", "其它资料");
		return SUCCESS;
	}
}
