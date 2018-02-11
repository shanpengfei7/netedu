package com.bigdata.action.digitalimage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ͼ��Ԥ����
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class ImagePreProcessing extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowippV;
	private List knowippS;
	private List knowippB;
	private List knowippD;
	private List knowippO;

	public List getKnowippV() {
		return knowippV;
	}

	public void setKnowippV(List knowippV) {
		this.knowippV = knowippV;
	}

	public List getKnowippS() {
		return knowippS;
	}

	public void setKnowippS(List knowippS) {
		this.knowippS = knowippS;
	}

	public List getKnowippB() {
		return knowippB;
	}

	public void setKnowippB(List knowippB) {
		this.knowippB = knowippB;
	}

	public List getKnowippD() {
		return knowippD;
	}

	public void setKnowippD(List knowippD) {
		this.knowippD = knowippD;
	}

	public List getKnowippO() {
		return knowippO;
	}

	public void setKnowippO(List knowippO) {
		this.knowippO = knowippO;
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
		knowippV = serviceDaoImpl.getList("ImagePreProcessing", "֪ʶ", "��Ƶ����");
		knowippS = serviceDaoImpl.getList("ImagePreProcessing", "֪ʶ", "ѧϰ�ʼ�");
		knowippB = serviceDaoImpl.getList("ImagePreProcessing", "֪ʶ", "��������");
		knowippD = serviceDaoImpl.getList("ImagePreProcessing", "֪ʶ", "�ο�����");
		knowippO = serviceDaoImpl.getList("ImagePreProcessing", "֪ʶ", "��������");
		return SUCCESS;
	}
}
