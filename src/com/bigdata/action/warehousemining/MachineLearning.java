package com.bigdata.action.warehousemining;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ����ѧϰ
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class MachineLearning extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowmV;
	private List knowmS;
	private List knowmB;
	private List knowmD;
	private List knowmO;

	public List getKnowmV() {
		return knowmV;
	}

	public void setKnowmV(List knowmV) {
		this.knowmV = knowmV;
	}

	public List getKnowmS() {
		return knowmS;
	}

	public void setKnowmS(List knowmS) {
		this.knowmS = knowmS;
	}

	public List getKnowmB() {
		return knowmB;
	}

	public void setKnowmB(List knowmB) {
		this.knowmB = knowmB;
	}

	public List getKnowmD() {
		return knowmD;
	}

	public void setKnowmD(List knowmD) {
		this.knowmD = knowmD;
	}

	public List getKnowmO() {
		return knowmO;
	}

	public void setKnowmO(List knowmO) {
		this.knowmO = knowmO;
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

		knowmV = serviceDaoImpl.getList("MachineLearning", "֪ʶ", "��Ƶ����");
		knowmS = serviceDaoImpl.getList("MachineLearning", "֪ʶ", "ѧϰ�ʼ�");
		knowmB = serviceDaoImpl.getList("MachineLearning", "֪ʶ", "��������");
		knowmD = serviceDaoImpl.getList("MachineLearning", "֪ʶ", "�ο�����");
		knowmO = serviceDaoImpl.getList("MachineLearning", "֪ʶ", "��������");
		return SUCCESS;
	}
}
