package com.bigdata.action.mobileapplication;

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
public class App extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowappV;
	private List knowappS;
	private List knowappB;
	private List knowappD;
	private List knowappO;

	public List getKnowappV() {
		return knowappV;
	}

	public void setKnowappV(List knowappV) {
		this.knowappV = knowappV;
	}

	public List getKnowappS() {
		return knowappS;
	}

	public void setKnowappS(List knowappS) {
		this.knowappS = knowappS;
	}

	public List getKnowappB() {
		return knowappB;
	}

	public void setKnowappB(List knowappB) {
		this.knowappB = knowappB;
	}

	public List getKnowappD() {
		return knowappD;
	}

	public void setKnowappD(List knowappD) {
		this.knowappD = knowappD;
	}

	public List getKnowappO() {
		return knowappO;
	}

	public void setKnowappO(List knowappO) {
		this.knowappO = knowappO;
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
		knowappV = serviceDaoImpl.getList("App", "知识", "视频资料");
		knowappS = serviceDaoImpl.getList("App", "知识", "学习笔记");
		knowappB = serviceDaoImpl.getList("App", "知识", "电子书类");
		knowappD = serviceDaoImpl.getList("App", "知识", "参考文献");
		knowappO = serviceDaoImpl.getList("App", "知识", "其它资料");
		return SUCCESS;
	}
}
