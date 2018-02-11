package com.bigdata.action.search;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.bigdata.entity.onesavetable.AllDatum;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 搜索功能，搜索并跳到搜索界面
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class Search extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private String putin;
	private List<AllDatum> information;

	public List<AllDatum> getInformation() {
		return information;
	}

	public void setInformation(List<AllDatum> information) {
		this.information = information;
	}

	public String getPutin() {
		return putin;
	}

	public void setPutin(String putin) {
		this.putin = putin;
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

		information = serviceDaoImpl.getSearchDatum(putin);
		return SUCCESS;
	}

}
