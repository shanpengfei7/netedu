package com.bigdata.action.digitalimage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 数字图像处理基础
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class DigitalImageProcessing extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowdipV;
	private List knowdipS;
	private List knowdipB;
	private List knowdipD;
	private List knowdipO;

	public List getKnowdipV() {
		return knowdipV;
	}

	public void setKnowdipV(List knowdipV) {
		this.knowdipV = knowdipV;
	}

	public List getKnowdipS() {
		return knowdipS;
	}

	public void setKnowdipS(List knowdipS) {
		this.knowdipS = knowdipS;
	}

	public List getKnowdipB() {
		return knowdipB;
	}

	public void setKnowdipB(List knowdipB) {
		this.knowdipB = knowdipB;
	}

	public List getKnowdipD() {
		return knowdipD;
	}

	public void setKnowdipD(List knowdipD) {
		this.knowdipD = knowdipD;
	}

	public List getKnowdipO() {
		return knowdipO;
	}

	public void setKnowdipO(List knowdipO) {
		this.knowdipO = knowdipO;
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
		knowdipV = serviceDaoImpl.getList("App", "知识", "视频资料");
		knowdipS = serviceDaoImpl.getList("App", "知识", "学习笔记");
		knowdipB = serviceDaoImpl.getList("App", "知识", "电子书类");
		knowdipD = serviceDaoImpl.getList("App", "知识", "参考文献");
		knowdipO = serviceDaoImpl.getList("App", "知识", "其它资料");
		return SUCCESS;
	}
}
