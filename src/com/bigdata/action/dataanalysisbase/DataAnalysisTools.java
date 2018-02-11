package com.bigdata.action.dataanalysisbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * �������ݷ�������
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class DataAnalysisTools extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List RV;
	private List RS;
	private List RB;
	private List RD;
	private List RO;

	private List PythonV;
	private List PythonS;
	private List PythonB;
	private List PythonD;
	private List PythonO;

	private List SpassV;
	private List SpassS;
	private List SpassB;
	private List SpassD;
	private List SpassO;

	private List SASV;
	private List SASS;
	private List SASB;
	private List SASD;
	private List SASO;

	private List WekaV;
	private List WekaS;
	private List WekaB;
	private List WekaD;
	private List WekaO;

	public List getRV() {
		return RV;
	}

	public void setRV(List rV) {
		RV = rV;
	}

	public List getRS() {
		return RS;
	}

	public void setRS(List rS) {
		RS = rS;
	}

	public List getRB() {
		return RB;
	}

	public void setRB(List rB) {
		RB = rB;
	}

	public List getRD() {
		return RD;
	}

	public void setRD(List rD) {
		RD = rD;
	}

	public List getRO() {
		return RO;
	}

	public void setRO(List rO) {
		RO = rO;
	}

	public List getPythonV() {
		return PythonV;
	}

	public void setPythonV(List pythonV) {
		PythonV = pythonV;
	}

	public List getPythonS() {
		return PythonS;
	}

	public void setPythonS(List pythonS) {
		PythonS = pythonS;
	}

	public List getPythonB() {
		return PythonB;
	}

	public void setPythonB(List pythonB) {
		PythonB = pythonB;
	}

	public List getPythonD() {
		return PythonD;
	}

	public void setPythonD(List pythonD) {
		PythonD = pythonD;
	}

	public List getPythonO() {
		return PythonO;
	}

	public void setPythonO(List pythonO) {
		PythonO = pythonO;
	}

	public List getSpassV() {
		return SpassV;
	}

	public void setSpassV(List spassV) {
		SpassV = spassV;
	}

	public List getSpassS() {
		return SpassS;
	}

	public void setSpassS(List spassS) {
		SpassS = spassS;
	}

	public List getSpassB() {
		return SpassB;
	}

	public void setSpassB(List spassB) {
		SpassB = spassB;
	}

	public List getSpassD() {
		return SpassD;
	}

	public void setSpassD(List spassD) {
		SpassD = spassD;
	}

	public List getSpassO() {
		return SpassO;
	}

	public void setSpassO(List spassO) {
		SpassO = spassO;
	}

	public List getSASV() {
		return SASV;
	}

	public void setSASV(List sASV) {
		SASV = sASV;
	}

	public List getSASS() {
		return SASS;
	}

	public void setSASS(List sASS) {
		SASS = sASS;
	}

	public List getSASB() {
		return SASB;
	}

	public void setSASB(List sASB) {
		SASB = sASB;
	}

	public List getSASD() {
		return SASD;
	}

	public void setSASD(List sASD) {
		SASD = sASD;
	}

	public List getSASO() {
		return SASO;
	}

	public void setSASO(List sASO) {
		SASO = sASO;
	}

	public List getWekaV() {
		return WekaV;
	}

	public void setWekaV(List wekaV) {
		WekaV = wekaV;
	}

	public List getWekaS() {
		return WekaS;
	}

	public void setWekaS(List wekaS) {
		WekaS = wekaS;
	}

	public List getWekaB() {
		return WekaB;
	}

	public void setWekaB(List wekaB) {
		WekaB = wekaB;
	}

	public List getWekaD() {
		return WekaD;
	}

	public void setWekaD(List wekaD) {
		WekaD = wekaD;
	}

	public List getWekaO() {
		return WekaO;
	}

	public void setWekaO(List wekaO) {
		WekaO = wekaO;
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
		RV = serviceDaoImpl.getList("DataAnalysisTools", "R", "��Ƶ����");
		RS = serviceDaoImpl.getList("DataAnalysisTools", "R", "ѧϰ�ʼ�");
		RB = serviceDaoImpl.getList("DataAnalysisTools", "R", "��������");
		RD = serviceDaoImpl.getList("DataAnalysisTools", "R", "�ο�����");
		RO = serviceDaoImpl.getList("DataAnalysisTools", "R", "��������");

		PythonV = serviceDaoImpl.getList("DataAnalysisTools", "Python", "��Ƶ����");
		PythonS = serviceDaoImpl.getList("DataAnalysisTools", "Python", "ѧϰ�ʼ�");
		PythonB = serviceDaoImpl.getList("DataAnalysisTools", "Python", "��������");
		PythonD = serviceDaoImpl.getList("DataAnalysisTools", "Python", "�ο�����");
		PythonO = serviceDaoImpl.getList("DataAnalysisTools", "Python", "��������");

		SpassV = serviceDaoImpl.getList("DataAnalysisTools", "Spass", "��Ƶ����");
		SpassS = serviceDaoImpl.getList("DataAnalysisTools", "Spass", "ѧϰ�ʼ�");
		SpassB = serviceDaoImpl.getList("DataAnalysisTools", "Spass", "��������");
		SpassD = serviceDaoImpl.getList("DataAnalysisTools", "Spass", "�ο�����");
		SpassO = serviceDaoImpl.getList("DataAnalysisTools", "Spass", "��������");

		SASV = serviceDaoImpl.getList("DataAnalysisTools", "SAS", "��Ƶ����");
		SASS = serviceDaoImpl.getList("DataAnalysisTools", "SAS", "ѧϰ�ʼ�");
		SASB = serviceDaoImpl.getList("DataAnalysisTools", "SAS", "��������");
		SASD = serviceDaoImpl.getList("DataAnalysisTools", "SAS", "�ο�����");
		SASO = serviceDaoImpl.getList("DataAnalysisTools", "SAS", "��������");

		WekaV = serviceDaoImpl.getList("DataAnalysisTools", "Weka", "��Ƶ����");
		WekaS = serviceDaoImpl.getList("DataAnalysisTools", "Weka", "ѧϰ�ʼ�");
		WekaB = serviceDaoImpl.getList("DataAnalysisTools", "Weka", "��������");
		WekaD = serviceDaoImpl.getList("DataAnalysisTools", "Weka", "�ο�����");
		WekaO = serviceDaoImpl.getList("DataAnalysisTools", "Weka", "��������");
		return SUCCESS;
	}
}
