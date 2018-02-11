package com.bigdata.action.mathbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ͳ��ѧ
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class Statistics extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowsV;
	private List knowsS;
	private List knowsB;
	private List knowsD;
	private List knowsO;

	public List getKnowsV() {
		return knowsV;
	}

	public void setKnowsV(List knowsV) {
		this.knowsV = knowsV;
	}

	public List getKnowsS() {
		return knowsS;
	}

	public void setKnowsS(List knowsS) {
		this.knowsS = knowsS;
	}

	public List getKnowsB() {
		return knowsB;
	}

	public void setKnowsB(List knowsB) {
		this.knowsB = knowsB;
	}

	public List getKnowsD() {
		return knowsD;
	}

	public void setKnowsD(List knowsD) {
		this.knowsD = knowsD;
	}

	public List getKnowsO() {
		return knowsO;
	}

	public void setKnowsO(List knowsO) {
		this.knowsO = knowsO;
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
		knowsV = serviceDaoImpl.getList("Statistics", "����֪ʶ", "��Ƶ����");
		knowsS = serviceDaoImpl.getList("Statistics", "����֪ʶ", "ѧϰ�ʼ�");
		knowsB = serviceDaoImpl.getList("Statistics", "����֪ʶ", "��������");
		knowsD = serviceDaoImpl.getList("Statistics", "����֪ʶ", "�ο�����");
		knowsO = serviceDaoImpl.getList("Statistics", "����֪ʶ", "��������");
		return SUCCESS;
	}
}
