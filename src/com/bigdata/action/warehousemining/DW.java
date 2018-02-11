package com.bigdata.action.warehousemining;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 数据仓库
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class DW extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowdwV;
	private List knowdwS;
	private List knowdwB;
	private List knowdwD;
	private List knowdwO;

	public List getKnowdwV() {
		return knowdwV;
	}

	public void setKnowdwV(List knowdwV) {
		this.knowdwV = knowdwV;
	}

	public List getKnowdwS() {
		return knowdwS;
	}

	public void setKnowdwS(List knowdwS) {
		this.knowdwS = knowdwS;
	}

	public List getKnowdwB() {
		return knowdwB;
	}

	public void setKnowdwB(List knowdwB) {
		this.knowdwB = knowdwB;
	}

	public List getKnowdwD() {
		return knowdwD;
	}

	public void setKnowdwD(List knowdwD) {
		this.knowdwD = knowdwD;
	}

	public List getKnowdwO() {
		return knowdwO;
	}

	public void setKnowdwO(List knowdwO) {
		this.knowdwO = knowdwO;
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
		knowdwV = serviceDaoImpl.getList("DW", "知识", "视频资料");
		knowdwS = serviceDaoImpl.getList("DW", "知识", "学习笔记");
		knowdwB = serviceDaoImpl.getList("DW", "知识", "电子书类");
		knowdwD = serviceDaoImpl.getList("DW", "知识", "参考文献");
		knowdwO = serviceDaoImpl.getList("DW", "知识", "其它资料");
		return SUCCESS;
	}
}
