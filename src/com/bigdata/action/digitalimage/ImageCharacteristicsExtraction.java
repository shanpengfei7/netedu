package com.bigdata.action.digitalimage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 图像特征提取
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class ImageCharacteristicsExtraction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowiceV;
	private List knowiceS;
	private List knowiceB;
	private List knowiceD;
	private List knowiceO;

	public List getKnowiceV() {
		return knowiceV;
	}

	public void setKnowiceV(List knowiceV) {
		this.knowiceV = knowiceV;
	}

	public List getKnowiceS() {
		return knowiceS;
	}

	public void setKnowiceS(List knowiceS) {
		this.knowiceS = knowiceS;
	}

	public List getKnowiceB() {
		return knowiceB;
	}

	public void setKnowiceB(List knowiceB) {
		this.knowiceB = knowiceB;
	}

	public List getKnowiceD() {
		return knowiceD;
	}

	public void setKnowiceD(List knowiceD) {
		this.knowiceD = knowiceD;
	}

	public List getKnowiceO() {
		return knowiceO;
	}

	public void setKnowiceO(List knowiceO) {
		this.knowiceO = knowiceO;
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
		knowiceV = serviceDaoImpl.getList("ImageCharacteristicsExtraction",
				"知识", "视频资料");
		knowiceS = serviceDaoImpl.getList("ImageCharacteristicsExtraction",
				"知识", "学习笔记");
		knowiceB = serviceDaoImpl.getList("ImageCharacteristicsExtraction",
				"知识", "电子书类");
		knowiceD = serviceDaoImpl.getList("ImageCharacteristicsExtraction",
				"知识", "参考文献");
		knowiceO = serviceDaoImpl.getList("ImageCharacteristicsExtraction",
				"知识", "其它资料");
		return SUCCESS;
	}
}
