package com.bigdata.action.digitalimage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 图像处理经典算法
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class ImageProcessingAlgorithm extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowsfV;
	private List knowsfS;
	private List knowsfB;
	private List knowsfD;
	private List knowsfO;

	public List getKnowsfV() {
		return knowsfV;
	}

	public void setKnowsfV(List knowsfV) {
		this.knowsfV = knowsfV;
	}

	public List getKnowsfS() {
		return knowsfS;
	}

	public void setKnowsfS(List knowsfS) {
		this.knowsfS = knowsfS;
	}

	public List getKnowsfB() {
		return knowsfB;
	}

	public void setKnowsfB(List knowsfB) {
		this.knowsfB = knowsfB;
	}

	public List getKnowsfD() {
		return knowsfD;
	}

	public void setKnowsfD(List knowsfD) {
		this.knowsfD = knowsfD;
	}

	public List getKnowsfO() {
		return knowsfO;
	}

	public void setKnowsfO(List knowsfO) {
		this.knowsfO = knowsfO;
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
		knowsfV = serviceDaoImpl.getList("ImageProcessingAlgorithm", "知识",
				"视频资料");
		knowsfS = serviceDaoImpl.getList("ImageProcessingAlgorithm", "知识",
				"学习笔记");
		knowsfB = serviceDaoImpl.getList("ImageProcessingAlgorithm", "知识",
				"电子书类");
		knowsfD = serviceDaoImpl.getList("ImageProcessingAlgorithm", "知识",
				"参考文献");
		knowsfO = serviceDaoImpl.getList("ImageProcessingAlgorithm", "知识",
				"其它资料");
		return SUCCESS;
	}
}
