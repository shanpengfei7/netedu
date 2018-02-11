package com.bigdata.action.virtualizationcloudbigdata;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 云计算管理平台
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class CloudManagementPlatform extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List openstackV;
	private List openstackS;
	private List openstackB;
	private List openstackD;
	private List openstackO;
	
	private List cloudstackV;
	private List cloudstackS;
	private List cloudstackB;
	private List cloudstackD;
	private List cloudstackO;

	public List getOpenstackV() {
		return openstackV;
	}

	public void setOpenstackV(List openstackV) {
		this.openstackV = openstackV;
	}

	public List getOpenstackS() {
		return openstackS;
	}

	public void setOpenstackS(List openstackS) {
		this.openstackS = openstackS;
	}

	public List getOpenstackB() {
		return openstackB;
	}

	public void setOpenstackB(List openstackB) {
		this.openstackB = openstackB;
	}

	public List getOpenstackD() {
		return openstackD;
	}

	public void setOpenstackD(List openstackD) {
		this.openstackD = openstackD;
	}

	public List getOpenstackO() {
		return openstackO;
	}

	public void setOpenstackO(List openstackO) {
		this.openstackO = openstackO;
	}

	public List getCloudstackV() {
		return cloudstackV;
	}

	public void setCloudstackV(List cloudstackV) {
		this.cloudstackV = cloudstackV;
	}

	public List getCloudstackS() {
		return cloudstackS;
	}

	public void setCloudstackS(List cloudstackS) {
		this.cloudstackS = cloudstackS;
	}

	public List getCloudstackB() {
		return cloudstackB;
	}

	public void setCloudstackB(List cloudstackB) {
		this.cloudstackB = cloudstackB;
	}

	public List getCloudstackD() {
		return cloudstackD;
	}

	public void setCloudstackD(List cloudstackD) {
		this.cloudstackD = cloudstackD;
	}

	public List getCloudstackO() {
		return cloudstackO;
	}

	public void setCloudstackO(List cloudstackO) {
		this.cloudstackO = cloudstackO;
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
		openstackV = serviceDaoImpl.getList("CloudManagementPlatform",
				"Openstack", "视频资料");
		openstackS = serviceDaoImpl.getList("CloudManagementPlatform",
				"Openstack", "学习笔记");
		openstackB = serviceDaoImpl.getList("CloudManagementPlatform",
				"Openstack", "电子书类");
		openstackD = serviceDaoImpl.getList("CloudManagementPlatform",
				"Openstack", "参考文献");
		openstackO = serviceDaoImpl.getList("CloudManagementPlatform",
				"Openstack", "其它资料");
		cloudstackV = serviceDaoImpl.getList("CloudManagementPlatform",
				"CloudStack", "视频资料");
		cloudstackS = serviceDaoImpl.getList("CloudManagementPlatform",
				"CloudStack", "学习笔记");
		cloudstackB = serviceDaoImpl.getList("CloudManagementPlatform",
				"CloudStack", "电子书类");
		cloudstackD = serviceDaoImpl.getList("CloudManagementPlatform",
				"CloudStack", "参考文献");
		cloudstackO = serviceDaoImpl.getList("CloudManagementPlatform",
				"CloudStack", "其它资料");
		return SUCCESS;
	}
}
