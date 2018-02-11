package com.bigdata.action.mathbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 高等数学
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class AdvancedMathematics extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowaV;
	private List knowaS;
	private List knowaB;
	private List knowaD;
	private List knowaO;

	public List getKnowaV() {
		return knowaV;
	}

	public void setKnowaV(List knowaV) {
		this.knowaV = knowaV;
	}

	public List getKnowaS() {
		return knowaS;
	}

	public void setKnowaS(List knowaS) {
		this.knowaS = knowaS;
	}

	public List getKnowaB() {
		return knowaB;
	}

	public void setKnowaB(List knowaB) {
		this.knowaB = knowaB;
	}

	public List getKnowaD() {
		return knowaD;
	}

	public void setKnowaD(List knowaD) {
		this.knowaD = knowaD;
	}

	public List getKnowaO() {
		return knowaO;
	}

	public void setKnowaO(List knowaO) {
		this.knowaO = knowaO;
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
		knowaV = serviceDaoImpl.getList("AdvancedMathematics", "基础知识", "视频资料");
		knowaS = serviceDaoImpl.getList("AdvancedMathematics", "基础知识", "学习笔记");
		knowaB = serviceDaoImpl.getList("AdvancedMathematics", "基础知识", "电子书类");
		knowaD = serviceDaoImpl.getList("AdvancedMathematics", "基础知识", "参考文献");
		knowaO = serviceDaoImpl.getList("AdvancedMathematics", "基础知识", "其它资料");
		return SUCCESS;
	}
}
