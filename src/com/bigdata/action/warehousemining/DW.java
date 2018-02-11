package com.bigdata.action.warehousemining;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ���ݲֿ�
 * 
 * @author ������
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
		knowdwV = serviceDaoImpl.getList("DW", "֪ʶ", "��Ƶ����");
		knowdwS = serviceDaoImpl.getList("DW", "֪ʶ", "ѧϰ�ʼ�");
		knowdwB = serviceDaoImpl.getList("DW", "֪ʶ", "��������");
		knowdwD = serviceDaoImpl.getList("DW", "֪ʶ", "�ο�����");
		knowdwO = serviceDaoImpl.getList("DW", "֪ʶ", "��������");
		return SUCCESS;
	}
}
