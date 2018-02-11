package com.bigdata.action.database;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 非关系型数据库
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class NonRelationalDatabase extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List HBaseV;
	private List HBaseS;
	private List HBaseB;
	private List HBaseD;
	private List HBaseO;

	private List MongoDbV;
	private List MongoDbS;
	private List MongoDbB;
	private List MongoDbD;
	private List MongoDbO;

	private List RiakV;
	private List RiakS;
	private List RiakB;
	private List RiakD;
	private List RiakO;

	private List OracleBDBV;
	private List OracleBDBS;
	private List OracleBDBB;
	private List OracleBDBD;
	private List OracleBDBO;

	private List HDFSV;
	private List HDFSS;
	private List HDFSB;
	private List HDFSD;
	private List HDFSO;

	public List getHBaseV() {
		return HBaseV;
	}

	public void setHBaseV(List hBaseV) {
		HBaseV = hBaseV;
	}

	public List getHBaseS() {
		return HBaseS;
	}

	public void setHBaseS(List hBaseS) {
		HBaseS = hBaseS;
	}

	public List getHBaseB() {
		return HBaseB;
	}

	public void setHBaseB(List hBaseB) {
		HBaseB = hBaseB;
	}

	public List getHBaseD() {
		return HBaseD;
	}

	public void setHBaseD(List hBaseD) {
		HBaseD = hBaseD;
	}

	public List getHBaseO() {
		return HBaseO;
	}

	public void setHBaseO(List hBaseO) {
		HBaseO = hBaseO;
	}

	public List getMongoDbV() {
		return MongoDbV;
	}

	public void setMongoDbV(List mongoDbV) {
		MongoDbV = mongoDbV;
	}

	public List getMongoDbS() {
		return MongoDbS;
	}

	public void setMongoDbS(List mongoDbS) {
		MongoDbS = mongoDbS;
	}

	public List getMongoDbB() {
		return MongoDbB;
	}

	public void setMongoDbB(List mongoDbB) {
		MongoDbB = mongoDbB;
	}

	public List getMongoDbD() {
		return MongoDbD;
	}

	public void setMongoDbD(List mongoDbD) {
		MongoDbD = mongoDbD;
	}

	public List getMongoDbO() {
		return MongoDbO;
	}

	public void setMongoDbO(List mongoDbO) {
		MongoDbO = mongoDbO;
	}

	public List getRiakV() {
		return RiakV;
	}

	public void setRiakV(List riakV) {
		RiakV = riakV;
	}

	public List getRiakS() {
		return RiakS;
	}

	public void setRiakS(List riakS) {
		RiakS = riakS;
	}

	public List getRiakB() {
		return RiakB;
	}

	public void setRiakB(List riakB) {
		RiakB = riakB;
	}

	public List getRiakD() {
		return RiakD;
	}

	public void setRiakD(List riakD) {
		RiakD = riakD;
	}

	public List getRiakO() {
		return RiakO;
	}

	public void setRiakO(List riakO) {
		RiakO = riakO;
	}

	public List getOracleBDBV() {
		return OracleBDBV;
	}

	public void setOracleBDBV(List oracleBDBV) {
		OracleBDBV = oracleBDBV;
	}

	public List getOracleBDBS() {
		return OracleBDBS;
	}

	public void setOracleBDBS(List oracleBDBS) {
		OracleBDBS = oracleBDBS;
	}

	public List getOracleBDBB() {
		return OracleBDBB;
	}

	public void setOracleBDBB(List oracleBDBB) {
		OracleBDBB = oracleBDBB;
	}

	public List getOracleBDBD() {
		return OracleBDBD;
	}

	public void setOracleBDBD(List oracleBDBD) {
		OracleBDBD = oracleBDBD;
	}

	public List getOracleBDBO() {
		return OracleBDBO;
	}

	public void setOracleBDBO(List oracleBDBO) {
		OracleBDBO = oracleBDBO;
	}

	public List getHDFSV() {
		return HDFSV;
	}

	public void setHDFSV(List hDFSV) {
		HDFSV = hDFSV;
	}

	public List getHDFSS() {
		return HDFSS;
	}

	public void setHDFSS(List hDFSS) {
		HDFSS = hDFSS;
	}

	public List getHDFSB() {
		return HDFSB;
	}

	public void setHDFSB(List hDFSB) {
		HDFSB = hDFSB;
	}

	public List getHDFSD() {
		return HDFSD;
	}

	public void setHDFSD(List hDFSD) {
		HDFSD = hDFSD;
	}

	public List getHDFSO() {
		return HDFSO;
	}

	public void setHDFSO(List hDFSO) {
		HDFSO = hDFSO;
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
		HBaseV = serviceDaoImpl.getList("NonRelationalDatabase", "HBase",
				"视频资料");
		HBaseS = serviceDaoImpl.getList("NonRelationalDatabase", "HBase",
				"学习笔记");
		HBaseB = serviceDaoImpl.getList("NonRelationalDatabase", "HBase",
				"电子书类");
		HBaseD = serviceDaoImpl.getList("NonRelationalDatabase", "HBase",
				"参考文献");
		HBaseO = serviceDaoImpl.getList("NonRelationalDatabase", "HBase",
				"其它资料");

		MongoDbV = serviceDaoImpl.getList("NonRelationalDatabase", "MongoDb",
				"视频资料");
		MongoDbS = serviceDaoImpl.getList("NonRelationalDatabase", "MongoDb",
				"学习笔记");
		MongoDbB = serviceDaoImpl.getList("NonRelationalDatabase", "MongoDb",
				"电子书类");
		MongoDbD = serviceDaoImpl.getList("NonRelationalDatabase", "MongoDb",
				"参考文献");
		MongoDbO = serviceDaoImpl.getList("NonRelationalDatabase", "MongoDb",
				"其它资料");

		RiakV = serviceDaoImpl.getList("NonRelationalDatabase", "Riak", "视频资料");
		RiakS = serviceDaoImpl.getList("NonRelationalDatabase", "Riak", "学习笔记");
		RiakB = serviceDaoImpl.getList("NonRelationalDatabase", "Riak", "电子书类");
		RiakD = serviceDaoImpl.getList("NonRelationalDatabase", "Riak", "参考文献");
		RiakO = serviceDaoImpl.getList("NonRelationalDatabase", "Riak", "其它资料");

		OracleBDBV = serviceDaoImpl.getList("NonRelationalDatabase",
				"OracleBDB", "视频资料");
		OracleBDBS = serviceDaoImpl.getList("NonRelationalDatabase",
				"OracleBDB", "学习笔记");
		OracleBDBB = serviceDaoImpl.getList("NonRelationalDatabase",
				"OracleBDB", "电子书类");
		OracleBDBD = serviceDaoImpl.getList("NonRelationalDatabase",
				"OracleBDB", "参考文献");
		OracleBDBO = serviceDaoImpl.getList("NonRelationalDatabase",
				"OracleBDB", "其它资料");

		HDFSV = serviceDaoImpl.getList("NonRelationalDatabase", "HDFS", "视频资料");
		HDFSS = serviceDaoImpl.getList("NonRelationalDatabase", "HDFS", "学习笔记");
		HDFSB = serviceDaoImpl.getList("NonRelationalDatabase", "HDFS", "电子书类");
		HDFSD = serviceDaoImpl.getList("NonRelationalDatabase", "HDFS", "参考文献");
		HDFSO = serviceDaoImpl.getList("NonRelationalDatabase", "HDFS", "其它资料");
		return SUCCESS;
	}
}
