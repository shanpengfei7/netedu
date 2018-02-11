package com.bigdata.action.dataanalysisbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ���ݷ���ģ��
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class DataAnalysisModel extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowdamV;
	private List knowdamS;
	private List knowdamB;
	private List knowdamD;
	private List knowdamO;

	public List getKnowdamV() {
		return knowdamV;
	}

	public void setKnowdamV(List knowdamV) {
		this.knowdamV = knowdamV;
	}

	public List getKnowdamS() {
		return knowdamS;
	}

	public void setKnowdamS(List knowdamS) {
		this.knowdamS = knowdamS;
	}

	public List getKnowdamB() {
		return knowdamB;
	}

	public void setKnowdamB(List knowdamB) {
		this.knowdamB = knowdamB;
	}

	public List getKnowdamD() {
		return knowdamD;
	}

	public void setKnowdamD(List knowdamD) {
		this.knowdamD = knowdamD;
	}

	public List getKnowdamO() {
		return knowdamO;
	}

	public void setKnowdamO(List knowdamO) {
		this.knowdamO = knowdamO;
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
		knowdamV = serviceDaoImpl.getList("DataAnalysisModel", "֪ʶ", "��Ƶ����");
		knowdamS = serviceDaoImpl.getList("DataAnalysisModel", "֪ʶ", "ѧϰ�ʼ�");
		knowdamB = serviceDaoImpl.getList("DataAnalysisModel", "֪ʶ", "��������");
		knowdamD = serviceDaoImpl.getList("DataAnalysisModel", "֪ʶ", "�ο�����");
		knowdamO = serviceDaoImpl.getList("DataAnalysisModel", "֪ʶ", "��������");
		return SUCCESS;
	}
}
