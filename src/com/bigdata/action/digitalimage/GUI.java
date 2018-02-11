package com.bigdata.action.digitalimage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 图像GUI集成界面
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class GUI extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowguiV;
	private List knowguiS;
	private List knowguiB;
	private List knowguiD;
	private List knowguiO;

	public List getKnowguiV() {
		return knowguiV;
	}

	public void setKnowguiV(List knowguiV) {
		this.knowguiV = knowguiV;
	}

	public List getKnowguiS() {
		return knowguiS;
	}

	public void setKnowguiS(List knowguiS) {
		this.knowguiS = knowguiS;
	}

	public List getKnowguiB() {
		return knowguiB;
	}

	public void setKnowguiB(List knowguiB) {
		this.knowguiB = knowguiB;
	}

	public List getKnowguiD() {
		return knowguiD;
	}

	public void setKnowguiD(List knowguiD) {
		this.knowguiD = knowguiD;
	}

	public List getKnowguiO() {
		return knowguiO;
	}

	public void setKnowguiO(List knowguiO) {
		this.knowguiO = knowguiO;
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
		knowguiV = serviceDaoImpl.getList("GUI", "知识", "视频资料");
		knowguiS = serviceDaoImpl.getList("GUI", "知识", "学习笔记");
		knowguiB = serviceDaoImpl.getList("GUI", "知识", "电子书类");
		knowguiD = serviceDaoImpl.getList("GUI", "知识", "参考文献");
		knowguiO = serviceDaoImpl.getList("GUI", "知识", "其它资料");
		return SUCCESS;
	}
}
