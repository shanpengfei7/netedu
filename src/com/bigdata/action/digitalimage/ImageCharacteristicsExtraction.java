package com.bigdata.action.digitalimage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ͼ��������ȡ
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class ImageCharacteristicsExtraction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List knowiceV;
	private List knowiceS;
	private List knowiceB;
	private List knowiceD;
	private List knowiceO;

	public List getKnowiceV() {
		return knowiceV;
	}

	public void setKnowiceV(List knowiceV) {
		this.knowiceV = knowiceV;
	}

	public List getKnowiceS() {
		return knowiceS;
	}

	public void setKnowiceS(List knowiceS) {
		this.knowiceS = knowiceS;
	}

	public List getKnowiceB() {
		return knowiceB;
	}

	public void setKnowiceB(List knowiceB) {
		this.knowiceB = knowiceB;
	}

	public List getKnowiceD() {
		return knowiceD;
	}

	public void setKnowiceD(List knowiceD) {
		this.knowiceD = knowiceD;
	}

	public List getKnowiceO() {
		return knowiceO;
	}

	public void setKnowiceO(List knowiceO) {
		this.knowiceO = knowiceO;
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
		knowiceV = serviceDaoImpl.getList("ImageCharacteristicsExtraction",
				"֪ʶ", "��Ƶ����");
		knowiceS = serviceDaoImpl.getList("ImageCharacteristicsExtraction",
				"֪ʶ", "ѧϰ�ʼ�");
		knowiceB = serviceDaoImpl.getList("ImageCharacteristicsExtraction",
				"֪ʶ", "��������");
		knowiceD = serviceDaoImpl.getList("ImageCharacteristicsExtraction",
				"֪ʶ", "�ο�����");
		knowiceO = serviceDaoImpl.getList("ImageCharacteristicsExtraction",
				"֪ʶ", "��������");
		return SUCCESS;
	}
}
