package com.bigdata.action.mobileapplication;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * �ߵ���ѧ
 * 
 * @author ������
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
		knowappV = serviceDaoImpl.getList("App", "֪ʶ", "��Ƶ����");
		knowappS = serviceDaoImpl.getList("App", "֪ʶ", "ѧϰ�ʼ�");
		knowappB = serviceDaoImpl.getList("App", "֪ʶ", "��������");
		knowappD = serviceDaoImpl.getList("App", "֪ʶ", "�ο�����");
		knowappO = serviceDaoImpl.getList("App", "֪ʶ", "��������");
		return SUCCESS;
	}
}
