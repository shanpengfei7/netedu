package com.bigdata.action.warehousemining;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * OLAP——联机分析处理
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class OLAP extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowolapV;
	private List knowolapS;
	private List knowolapB;
	private List knowolapD;
	private List knowolapO;

	public List getKnowolapV() {
		return knowolapV;
	}

	public void setKnowolapV(List knowolapV) {
		this.knowolapV = knowolapV;
	}

	public List getKnowolapS() {
		return knowolapS;
	}

	public void setKnowolapS(List knowolapS) {
		this.knowolapS = knowolapS;
	}

	public List getKnowolapB() {
		return knowolapB;
	}

	public void setKnowolapB(List knowolapB) {
		this.knowolapB = knowolapB;
	}

	public List getKnowolapD() {
		return knowolapD;
	}

	public void setKnowolapD(List knowolapD) {
		this.knowolapD = knowolapD;
	}

	public List getKnowolapO() {
		return knowolapO;
	}

	public void setKnowolapO(List knowolapO) {
		this.knowolapO = knowolapO;
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
		knowolapV = serviceDaoImpl.getList("OLAP", "知识", "视频资料");
		knowolapS = serviceDaoImpl.getList("OLAP", "知识", "学习笔记");
		knowolapB = serviceDaoImpl.getList("OLAP", "知识", "电子书类");
		knowolapD = serviceDaoImpl.getList("OLAP", "知识", "参考文献");
		knowolapO = serviceDaoImpl.getList("OLAP", "知识", "其它资料");
		return SUCCESS;
	}
}
