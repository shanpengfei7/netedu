package com.bigdata.action.computerbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * �������
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class ProgramLanguage extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List CCV;
	private List CCS;
	private List CCB;
	private List CCD;
	private List CCO;

	private List JavaV;
	private List JavaS;
	private List JavaB;
	private List JavaD;
	private List JavaO;

	private List PythonV;
	private List PythonS;
	private List PythonB;
	private List PythonD;
	private List PythonO;

	public List getCCV() {
		return CCV;
	}

	public void setCCV(List cCV) {
		CCV = cCV;
	}

	public List getCCS() {
		return CCS;
	}

	public void setCCS(List cCS) {
		CCS = cCS;
	}

	public List getCCB() {
		return CCB;
	}

	public void setCCB(List cCB) {
		CCB = cCB;
	}

	public List getCCD() {
		return CCD;
	}

	public void setCCD(List cCD) {
		CCD = cCD;
	}

	public List getCCO() {
		return CCO;
	}

	public void setCCO(List cCO) {
		CCO = cCO;
	}

	public List getJavaV() {
		return JavaV;
	}

	public void setJavaV(List javaV) {
		JavaV = javaV;
	}

	public List getJavaS() {
		return JavaS;
	}

	public void setJavaS(List javaS) {
		JavaS = javaS;
	}

	public List getJavaB() {
		return JavaB;
	}

	public void setJavaB(List javaB) {
		JavaB = javaB;
	}

	public List getJavaD() {
		return JavaD;
	}

	public void setJavaD(List javaD) {
		JavaD = javaD;
	}

	public List getJavaO() {
		return JavaO;
	}

	public void setJavaO(List javaO) {
		JavaO = javaO;
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

	public ServiceDaoImpl getServiceDaoImpl() {
		return serviceDaoImpl;
	}

	@Resource
	public void setServiceDaoImpl(ServiceDaoImpl serviceDaoImpl) {
		this.serviceDaoImpl = serviceDaoImpl;
	}

	@Override
	public String execute() throws Exception {
		CCV = serviceDaoImpl.getList("ProgramLanguage", "C��C�Ӽ�", "��Ƶ����");
		CCS = serviceDaoImpl.getList("ProgramLanguage", "C��C�Ӽ�", "ѧϰ�ʼ�");
		CCB = serviceDaoImpl.getList("ProgramLanguage", "C��C�Ӽ�", "��������");
		CCD = serviceDaoImpl.getList("ProgramLanguage", "C��C�Ӽ�", "�ο�����");
		CCO = serviceDaoImpl.getList("ProgramLanguage", "C��C�Ӽ�", "��������");

		JavaV = serviceDaoImpl.getList("ProgramLanguage", "Java", "��Ƶ����");
		JavaS = serviceDaoImpl.getList("ProgramLanguage", "Java", "ѧϰ�ʼ�");
		JavaB = serviceDaoImpl.getList("ProgramLanguage", "Java", "��������");
		JavaD = serviceDaoImpl.getList("ProgramLanguage", "Java", "�ο�����");
		JavaO = serviceDaoImpl.getList("ProgramLanguage", "Java", "��������");

		PythonV = serviceDaoImpl.getList("ProgramLanguage", "Python", "��Ƶ����");
		PythonS = serviceDaoImpl.getList("ProgramLanguage", "Python", "ѧϰ�ʼ�");
		PythonB = serviceDaoImpl.getList("ProgramLanguage", "Python", "��������");
		PythonD = serviceDaoImpl.getList("ProgramLanguage", "Python", "�ο�����");
		PythonO = serviceDaoImpl.getList("ProgramLanguage", "Python", "��������");
		return SUCCESS;
	}
}
