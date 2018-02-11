package com.bigdata.action.dataanalysisbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ���ݷ��������㷨
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class DataAnalysisAlgorithms extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowdaaV;
	private List knowdaaS;
	private List knowdaaB;
	private List knowdaaD;
	private List knowdaaO;

	public List getKnowdaaV() {
		return knowdaaV;
	}

	public void setKnowdaaV(List knowdaaV) {
		this.knowdaaV = knowdaaV;
	}

	public List getKnowdaaS() {
		return knowdaaS;
	}

	public void setKnowdaaS(List knowdaaS) {
		this.knowdaaS = knowdaaS;
	}

	public List getKnowdaaB() {
		return knowdaaB;
	}

	public void setKnowdaaB(List knowdaaB) {
		this.knowdaaB = knowdaaB;
	}

	public List getKnowdaaD() {
		return knowdaaD;
	}

	public void setKnowdaaD(List knowdaaD) {
		this.knowdaaD = knowdaaD;
	}

	public List getKnowdaaO() {
		return knowdaaO;
	}

	public void setKnowdaaO(List knowdaaO) {
		this.knowdaaO = knowdaaO;
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
		knowdaaV = serviceDaoImpl.getList("DataAnalysisAlgorithms", "֪ʶ",
				"��Ƶ����");
		knowdaaS = serviceDaoImpl.getList("DataAnalysisAlgorithms", "֪ʶ",
				"ѧϰ�ʼ�");
		knowdaaB = serviceDaoImpl.getList("DataAnalysisAlgorithms", "֪ʶ",
				"��������");
		knowdaaD = serviceDaoImpl.getList("DataAnalysisAlgorithms", "֪ʶ",
				"�ο�����");
		knowdaaO = serviceDaoImpl.getList("DataAnalysisAlgorithms", "֪ʶ",
				"��������");
		return SUCCESS;
	}
}
