package com.bigdata.action.virtualizationcloudbigdata;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * �����ݷֲ�ʽ������
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class BigDataDistributedProcessingFramework extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List HDFSV;
	private List HDFSS;
	private List HDFSB;
	private List HDFSD;
	private List HDFSO;

	private List MapReduceV;
	private List MapReduceS;
	private List MapReduceB;
	private List MapReduceD;
	private List MapReduceO;

	private List HBaseV;
	private List HBaseS;
	private List HBaseB;
	private List HBaseD;
	private List HBaseO;

	private List HiveV;
	private List HiveS;
	private List HiveB;
	private List HiveD;
	private List HiveO;

	private List ZookeeperV;
	private List ZookeeperS;
	private List ZookeeperB;
	private List ZookeeperD;
	private List ZookeeperO;

	private List AvroV;
	private List AvroS;
	private List AvroB;
	private List AvroD;
	private List AvroO;

	private List PigV;
	private List PigS;
	private List PigB;
	private List PigD;
	private List PigO;

	private List AmbariV;
	private List AmbariS;
	private List AmbariB;
	private List AmbariD;
	private List AmbariO;

	private List SqoopV;
	private List SqoopS;
	private List SqoopB;
	private List SqoopD;
	private List SqoopO;

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

	public List getMapReduceV() {
		return MapReduceV;
	}

	public void setMapReduceV(List mapReduceV) {
		MapReduceV = mapReduceV;
	}

	public List getMapReduceS() {
		return MapReduceS;
	}

	public void setMapReduceS(List mapReduceS) {
		MapReduceS = mapReduceS;
	}

	public List getMapReduceB() {
		return MapReduceB;
	}

	public void setMapReduceB(List mapReduceB) {
		MapReduceB = mapReduceB;
	}

	public List getMapReduceD() {
		return MapReduceD;
	}

	public void setMapReduceD(List mapReduceD) {
		MapReduceD = mapReduceD;
	}

	public List getMapReduceO() {
		return MapReduceO;
	}

	public void setMapReduceO(List mapReduceO) {
		MapReduceO = mapReduceO;
	}

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

	public List getHiveV() {
		return HiveV;
	}

	public void setHiveV(List hiveV) {
		HiveV = hiveV;
	}

	public List getHiveS() {
		return HiveS;
	}

	public void setHiveS(List hiveS) {
		HiveS = hiveS;
	}

	public List getHiveB() {
		return HiveB;
	}

	public void setHiveB(List hiveB) {
		HiveB = hiveB;
	}

	public List getHiveD() {
		return HiveD;
	}

	public void setHiveD(List hiveD) {
		HiveD = hiveD;
	}

	public List getHiveO() {
		return HiveO;
	}

	public void setHiveO(List hiveO) {
		HiveO = hiveO;
	}

	public List getZookeeperV() {
		return ZookeeperV;
	}

	public void setZookeeperV(List zookeeperV) {
		ZookeeperV = zookeeperV;
	}

	public List getZookeeperS() {
		return ZookeeperS;
	}

	public void setZookeeperS(List zookeeperS) {
		ZookeeperS = zookeeperS;
	}

	public List getZookeeperB() {
		return ZookeeperB;
	}

	public void setZookeeperB(List zookeeperB) {
		ZookeeperB = zookeeperB;
	}

	public List getZookeeperD() {
		return ZookeeperD;
	}

	public void setZookeeperD(List zookeeperD) {
		ZookeeperD = zookeeperD;
	}

	public List getZookeeperO() {
		return ZookeeperO;
	}

	public void setZookeeperO(List zookeeperO) {
		ZookeeperO = zookeeperO;
	}

	public List getAvroV() {
		return AvroV;
	}

	public void setAvroV(List avroV) {
		AvroV = avroV;
	}

	public List getAvroS() {
		return AvroS;
	}

	public void setAvroS(List avroS) {
		AvroS = avroS;
	}

	public List getAvroB() {
		return AvroB;
	}

	public void setAvroB(List avroB) {
		AvroB = avroB;
	}

	public List getAvroD() {
		return AvroD;
	}

	public void setAvroD(List avroD) {
		AvroD = avroD;
	}

	public List getAvroO() {
		return AvroO;
	}

	public void setAvroO(List avroO) {
		AvroO = avroO;
	}

	public List getPigV() {
		return PigV;
	}

	public void setPigV(List pigV) {
		PigV = pigV;
	}

	public List getPigS() {
		return PigS;
	}

	public void setPigS(List pigS) {
		PigS = pigS;
	}

	public List getPigB() {
		return PigB;
	}

	public void setPigB(List pigB) {
		PigB = pigB;
	}

	public List getPigD() {
		return PigD;
	}

	public void setPigD(List pigD) {
		PigD = pigD;
	}

	public List getPigO() {
		return PigO;
	}

	public void setPigO(List pigO) {
		PigO = pigO;
	}

	public List getAmbariV() {
		return AmbariV;
	}

	public void setAmbariV(List ambariV) {
		AmbariV = ambariV;
	}

	public List getAmbariS() {
		return AmbariS;
	}

	public void setAmbariS(List ambariS) {
		AmbariS = ambariS;
	}

	public List getAmbariB() {
		return AmbariB;
	}

	public void setAmbariB(List ambariB) {
		AmbariB = ambariB;
	}

	public List getAmbariD() {
		return AmbariD;
	}

	public void setAmbariD(List ambariD) {
		AmbariD = ambariD;
	}

	public List getAmbariO() {
		return AmbariO;
	}

	public void setAmbariO(List ambariO) {
		AmbariO = ambariO;
	}

	public List getSqoopV() {
		return SqoopV;
	}

	public void setSqoopV(List sqoopV) {
		SqoopV = sqoopV;
	}

	public List getSqoopS() {
		return SqoopS;
	}

	public void setSqoopS(List sqoopS) {
		SqoopS = sqoopS;
	}

	public List getSqoopB() {
		return SqoopB;
	}

	public void setSqoopB(List sqoopB) {
		SqoopB = sqoopB;
	}

	public List getSqoopD() {
		return SqoopD;
	}

	public void setSqoopD(List sqoopD) {
		SqoopD = sqoopD;
	}

	public List getSqoopO() {
		return SqoopO;
	}

	public void setSqoopO(List sqoopO) {
		SqoopO = sqoopO;
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
		HDFSV = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"֪ʶ", "��Ƶ����");
		HDFSS = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"HDFS", "ѧϰ�ʼ�");
		HDFSB = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"HDFS", "��������");
		HDFSD = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"HDFS", "�ο�����");
		HDFSO = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"HDFS", "��������");

		MapReduceV = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "MapReduce", "��Ƶ����");
		MapReduceS = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "MapReduce", "ѧϰ�ʼ�");
		MapReduceB = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "MapReduce", "��������");
		MapReduceD = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "MapReduce", "�ο�����");
		MapReduceO = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "MapReduce", "��������");

		HBaseV = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "HBase", "��Ƶ����");
		HBaseS = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "HBase", "ѧϰ�ʼ�");
		HBaseB = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "HBase", "��������");
		HBaseD = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "HBase", "�ο�����");
		HBaseO = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "HBase", "��������");

		HiveV = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Hive", "��Ƶ����");
		HiveS = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Hive", "ѧϰ�ʼ�");
		HiveB = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Hive", "��������");
		HiveD = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Hive", "�ο�����");
		HiveO = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Hive", "��������");

		ZookeeperV = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Zookeeper", "��Ƶ����");
		ZookeeperS = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Zookeeper", "ѧϰ�ʼ�");
		ZookeeperB = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Zookeeper", "��������");
		ZookeeperD = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Zookeeper", "�ο�����");
		ZookeeperO = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Zookeeper", "��������");

		AvroV = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Avro", "��Ƶ����");
		AvroS = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Avro", "ѧϰ�ʼ�");
		AvroB = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Avro", "��������");
		AvroD = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Avro", "�ο�����");
		AvroO = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Avro", "��������");

		PigV = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Pig", "��Ƶ����");
		PigS = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Pig", "ѧϰ�ʼ�");
		PigB = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Pig", "��������");
		PigD = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Pig", "�ο�����");
		PigO = serviceDaoImpl.getList("BigDataDistributedProcessingFramework",
				"Pig", "��������");

		AmbariV = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Ambari", "��Ƶ����");
		AmbariS = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Ambari", "ѧϰ�ʼ�");
		AmbariB = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Ambari", "��������");
		AmbariD = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Ambari", "�ο�����");
		AmbariO = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Ambari", "��������");

		SqoopV = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Sqoop", "��Ƶ����");
		SqoopS = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Sqoop", "ѧϰ�ʼ�");
		SqoopB = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Sqoop", "��������");
		SqoopD = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Sqoop", "�ο�����");
		SqoopO = serviceDaoImpl.getList(
				"BigDataDistributedProcessingFramework", "Sqoop", "��������");
		return SUCCESS;
	}
}
