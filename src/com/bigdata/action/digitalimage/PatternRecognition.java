package com.bigdata.action.digitalimage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 模式识别
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class PatternRecognition extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowppV;
	private List knowppS;
	private List knowppB;
	private List knowppD;
	private List knowppO;

	public List getKnowppV() {
		return knowppV;
	}

	public void setKnowppV(List knowppV) {
		this.knowppV = knowppV;
	}

	public List getKnowppS() {
		return knowppS;
	}

	public void setKnowppS(List knowppS) {
		this.knowppS = knowppS;
	}

	public List getKnowppB() {
		return knowppB;
	}

	public void setKnowppB(List knowppB) {
		this.knowppB = knowppB;
	}

	public List getKnowppD() {
		return knowppD;
	}

	public void setKnowppD(List knowppD) {
		this.knowppD = knowppD;
	}

	public List getKnowppO() {
		return knowppO;
	}

	public void setKnowppO(List knowppO) {
		this.knowppO = knowppO;
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
		knowppV = serviceDaoImpl.getList("PatternRecognition", "知识", "视频资料");
		knowppS = serviceDaoImpl.getList("PatternRecognition", "知识", "学习笔记");
		knowppB = serviceDaoImpl.getList("PatternRecognition", "知识", "电子书类");
		knowppD = serviceDaoImpl.getList("PatternRecognition", "知识", "参考文献");
		knowppO = serviceDaoImpl.getList("PatternRecognition", "知识", "其它资料");
		return SUCCESS;
	}
}
