package com.bigdata.action.database;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 关系型数据库
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class RelationalDatabase extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List SQLserverV;
	private List SQLserverS;
	private List SQLserverB;
	private List SQLserverD;
	private List SQLserverO;

	private List MySqlV;
	private List MySqlS;
	private List MySqlB;
	private List MySqlD;
	private List MySqlO;

	public List getSQLserverV() {
		return SQLserverV;
	}

	public void setSQLserverV(List sQLserverV) {
		SQLserverV = sQLserverV;
	}

	public List getSQLserverS() {
		return SQLserverS;
	}

	public void setSQLserverS(List sQLserverS) {
		SQLserverS = sQLserverS;
	}

	public List getSQLserverB() {
		return SQLserverB;
	}

	public void setSQLserverB(List sQLserverB) {
		SQLserverB = sQLserverB;
	}

	public List getSQLserverD() {
		return SQLserverD;
	}

	public void setSQLserverD(List sQLserverD) {
		SQLserverD = sQLserverD;
	}

	public List getSQLserverO() {
		return SQLserverO;
	}

	public void setSQLserverO(List sQLserverO) {
		SQLserverO = sQLserverO;
	}

	public List getMySqlV() {
		return MySqlV;
	}

	public void setMySqlV(List mySqlV) {
		MySqlV = mySqlV;
	}

	public List getMySqlS() {
		return MySqlS;
	}

	public void setMySqlS(List mySqlS) {
		MySqlS = mySqlS;
	}

	public List getMySqlB() {
		return MySqlB;
	}

	public void setMySqlB(List mySqlB) {
		MySqlB = mySqlB;
	}

	public List getMySqlD() {
		return MySqlD;
	}

	public void setMySqlD(List mySqlD) {
		MySqlD = mySqlD;
	}

	public List getMySqlO() {
		return MySqlO;
	}

	public void setMySqlO(List mySqlO) {
		MySqlO = mySqlO;
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
		SQLserverV = serviceDaoImpl.getList("RelationalDatabase", "SQLserver",
				"视频资料");
		SQLserverS = serviceDaoImpl.getList("RelationalDatabase", "SQLserver",
				"学习笔记");
		SQLserverB = serviceDaoImpl.getList("RelationalDatabase", "SQLserver",
				"电子书类");
		SQLserverD = serviceDaoImpl.getList("RelationalDatabase", "SQLserver",
				"参考文献");
		SQLserverO = serviceDaoImpl.getList("RelationalDatabase", "SQLserver",
				"其它资料");

		MySqlV = serviceDaoImpl.getList("RelationalDatabase", "MySql", "视频资料");
		MySqlS = serviceDaoImpl.getList("RelationalDatabase", "MySql", "学习笔记");
		MySqlB = serviceDaoImpl.getList("RelationalDatabase", "MySql", "电子书类");
		MySqlD = serviceDaoImpl.getList("RelationalDatabase", "MySql", "参考文献");
		MySqlO = serviceDaoImpl.getList("RelationalDatabase", "MySql", "其它资料");
		return SUCCESS;
	}
}
