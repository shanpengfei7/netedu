package com.bigdata.action.subscriber;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 搜索功能，搜索并跳到搜索界面
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class Subscriber extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List<com.bigdata.entity.subscriber.Subscriber> members;



	public List<com.bigdata.entity.subscriber.Subscriber> getMembers() {
		return members;
	}

	public void setMembers(List<com.bigdata.entity.subscriber.Subscriber> members) {
		this.members = members;
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

		members = serviceDaoImpl.getAllSubscriber();
	
		return SUCCESS;
	}

}
