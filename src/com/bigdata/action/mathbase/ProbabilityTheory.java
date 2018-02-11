package com.bigdata.action.mathbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ������
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class ProbabilityTheory extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowpV;
	private List knowpS;
	private List knowpB;
	private List knowpD;
	private List knowpO;

	public List getKnowpV() {
		return knowpV;
	}

	public void setKnowpV(List knowpV) {
		this.knowpV = knowpV;
	}

	public List getKnowpS() {
		return knowpS;
	}

	public void setKnowpS(List knowpS) {
		this.knowpS = knowpS;
	}

	public List getKnowpB() {
		return knowpB;
	}

	public void setKnowpB(List knowpB) {
		this.knowpB = knowpB;
	}

	public List getKnowpD() {
		return knowpD;
	}

	public void setKnowpD(List knowpD) {
		this.knowpD = knowpD;
	}

	public List getKnowpO() {
		return knowpO;
	}

	public void setKnowpO(List knowpO) {
		this.knowpO = knowpO;
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
		knowpV = serviceDaoImpl.getList("ProbabilityTheory", "����֪ʶ", "��Ƶ����");
		knowpS = serviceDaoImpl.getList("ProbabilityTheory", "����֪ʶ", "ѧϰ�ʼ�");
		knowpB = serviceDaoImpl.getList("ProbabilityTheory", "����֪ʶ", "��������");
		knowpD = serviceDaoImpl.getList("ProbabilityTheory", "����֪ʶ", "�ο�����");
		knowpO = serviceDaoImpl.getList("ProbabilityTheory", "����֪ʶ", "��������");
		return SUCCESS;
	}
}
