package com.bigdata.action.warehousemining;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * OLAP����������������
 * 
 * @author ������
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
		knowolapV = serviceDaoImpl.getList("OLAP", "֪ʶ", "��Ƶ����");
		knowolapS = serviceDaoImpl.getList("OLAP", "֪ʶ", "ѧϰ�ʼ�");
		knowolapB = serviceDaoImpl.getList("OLAP", "֪ʶ", "��������");
		knowolapD = serviceDaoImpl.getList("OLAP", "֪ʶ", "�ο�����");
		knowolapO = serviceDaoImpl.getList("OLAP", "֪ʶ", "��������");
		return SUCCESS;
	}
}
