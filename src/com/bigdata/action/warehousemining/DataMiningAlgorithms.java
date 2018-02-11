package com.bigdata.action.warehousemining;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * �����ھ򾭵��㷨
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class DataMiningAlgorithms extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowmiV;
	private List knowmiS;
	private List knowmiB;
	private List knowmiD;
	private List knowmiO;

	public List getKnowmiV() {
		return knowmiV;
	}

	public void setKnowmiV(List knowmiV) {
		this.knowmiV = knowmiV;
	}

	public List getKnowmiS() {
		return knowmiS;
	}

	public void setKnowmiS(List knowmiS) {
		this.knowmiS = knowmiS;
	}

	public List getKnowmiB() {
		return knowmiB;
	}

	public void setKnowmiB(List knowmiB) {
		this.knowmiB = knowmiB;
	}

	public List getKnowmiD() {
		return knowmiD;
	}

	public void setKnowmiD(List knowmiD) {
		this.knowmiD = knowmiD;
	}

	public List getKnowmiO() {
		return knowmiO;
	}

	public void setKnowmiO(List knowmiO) {
		this.knowmiO = knowmiO;
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
		knowmiV = serviceDaoImpl.getList("DataMiningAlgorithms", "֪ʶ", "��Ƶ����");
		knowmiS = serviceDaoImpl.getList("DataMiningAlgorithms", "֪ʶ", "ѧϰ�ʼ�");
		knowmiB = serviceDaoImpl.getList("DataMiningAlgorithms", "֪ʶ", "��������");
		knowmiD = serviceDaoImpl.getList("DataMiningAlgorithms", "֪ʶ", "�ο�����");
		knowmiO = serviceDaoImpl.getList("DataMiningAlgorithms", "֪ʶ", "��������");
		return SUCCESS;
	}
}
