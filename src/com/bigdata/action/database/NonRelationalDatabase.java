package com.bigdata.action.database;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * �ǹ�ϵ�����ݿ�
 * 
 * @author ������
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
				"��Ƶ����");
		HBaseS = serviceDaoImpl.getList("NonRelationalDatabase", "HBase",
				"ѧϰ�ʼ�");
		HBaseB = serviceDaoImpl.getList("NonRelationalDatabase", "HBase",
				"��������");
		HBaseD = serviceDaoImpl.getList("NonRelationalDatabase", "HBase",
				"�ο�����");
		HBaseO = serviceDaoImpl.getList("NonRelationalDatabase", "HBase",
				"��������");

		MongoDbV = serviceDaoImpl.getList("NonRelationalDatabase", "MongoDb",
				"��Ƶ����");
		MongoDbS = serviceDaoImpl.getList("NonRelationalDatabase", "MongoDb",
				"ѧϰ�ʼ�");
		MongoDbB = serviceDaoImpl.getList("NonRelationalDatabase", "MongoDb",
				"��������");
		MongoDbD = serviceDaoImpl.getList("NonRelationalDatabase", "MongoDb",
				"�ο�����");
		MongoDbO = serviceDaoImpl.getList("NonRelationalDatabase", "MongoDb",
				"��������");

		RiakV = serviceDaoImpl.getList("NonRelationalDatabase", "Riak", "��Ƶ����");
		RiakS = serviceDaoImpl.getList("NonRelationalDatabase", "Riak", "ѧϰ�ʼ�");
		RiakB = serviceDaoImpl.getList("NonRelationalDatabase", "Riak", "��������");
		RiakD = serviceDaoImpl.getList("NonRelationalDatabase", "Riak", "�ο�����");
		RiakO = serviceDaoImpl.getList("NonRelationalDatabase", "Riak", "��������");

		OracleBDBV = serviceDaoImpl.getList("NonRelationalDatabase",
				"OracleBDB", "��Ƶ����");
		OracleBDBS = serviceDaoImpl.getList("NonRelationalDatabase",
				"OracleBDB", "ѧϰ�ʼ�");
		OracleBDBB = serviceDaoImpl.getList("NonRelationalDatabase",
				"OracleBDB", "��������");
		OracleBDBD = serviceDaoImpl.getList("NonRelationalDatabase",
				"OracleBDB", "�ο�����");
		OracleBDBO = serviceDaoImpl.getList("NonRelationalDatabase",
				"OracleBDB", "��������");

		HDFSV = serviceDaoImpl.getList("NonRelationalDatabase", "HDFS", "��Ƶ����");
		HDFSS = serviceDaoImpl.getList("NonRelationalDatabase", "HDFS", "ѧϰ�ʼ�");
		HDFSB = serviceDaoImpl.getList("NonRelationalDatabase", "HDFS", "��������");
		HDFSD = serviceDaoImpl.getList("NonRelationalDatabase", "HDFS", "�ο�����");
		HDFSO = serviceDaoImpl.getList("NonRelationalDatabase", "HDFS", "��������");
		return SUCCESS;
	}
}
