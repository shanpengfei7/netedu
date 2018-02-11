package com.bigdata.action.delete;

import javax.annotation.Resource;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ����ɾ���ļ������ݿ��еļ�¼
 * 
 * @author ������
 *
 */
public class Remove extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ServiceDaoImpl getServiceDaoImpl() {
		return serviceDaoImpl;
	}

	@Resource
	public void setServiceDaoImpl(ServiceDaoImpl serviceDaoImpl) {
		this.serviceDaoImpl = serviceDaoImpl;
	}

	public String execute() throws Exception {

		serviceDaoImpl.deleteByQuery("subscriber", id);
		return SUCCESS;
	}

}
