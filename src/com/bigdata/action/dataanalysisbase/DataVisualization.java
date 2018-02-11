package com.bigdata.action.dataanalysisbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ���ݿ��ӻ�����
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class DataVisualization extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowdvzV;
	private List knowdvzS;
	private List knowdvzB;
	private List knowdvzD;
	private List knowdvzO;

	public List getKnowdvzV() {
		return knowdvzV;
	}

	public void setKnowdvzV(List knowdvzV) {
		this.knowdvzV = knowdvzV;
	}

	public List getKnowdvzS() {
		return knowdvzS;
	}

	public void setKnowdvzS(List knowdvzS) {
		this.knowdvzS = knowdvzS;
	}

	public List getKnowdvzB() {
		return knowdvzB;
	}

	public void setKnowdvzB(List knowdvzB) {
		this.knowdvzB = knowdvzB;
	}

	public List getKnowdvzD() {
		return knowdvzD;
	}

	public void setKnowdvzD(List knowdvzD) {
		this.knowdvzD = knowdvzD;
	}

	public List getKnowdvzO() {
		return knowdvzO;
	}

	public void setKnowdvzO(List knowdvzO) {
		this.knowdvzO = knowdvzO;
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
		knowdvzV = serviceDaoImpl.getList("DataVisualization", "֪ʶ", "��Ƶ����");
		knowdvzS = serviceDaoImpl.getList("DataVisualization", "֪ʶ", "ѧϰ�ʼ�");
		knowdvzB = serviceDaoImpl.getList("DataVisualization", "֪ʶ", "��������");
		knowdvzD = serviceDaoImpl.getList("DataVisualization", "֪ʶ", "�ο�����");
		knowdvzO = serviceDaoImpl.getList("DataVisualization", "֪ʶ", "��������");
		return SUCCESS;
	}
}
