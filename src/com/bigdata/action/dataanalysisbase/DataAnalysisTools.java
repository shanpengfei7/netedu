package com.bigdata.action.dataanalysisbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 常用数据分析工具
 * 
 * @author 单鹏飞
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
		RV = serviceDaoImpl.getList("DataAnalysisTools", "R", "视频资料");
		RS = serviceDaoImpl.getList("DataAnalysisTools", "R", "学习笔记");
		RB = serviceDaoImpl.getList("DataAnalysisTools", "R", "电子书类");
		RD = serviceDaoImpl.getList("DataAnalysisTools", "R", "参考文献");
		RO = serviceDaoImpl.getList("DataAnalysisTools", "R", "其它资料");

		PythonV = serviceDaoImpl.getList("DataAnalysisTools", "Python", "视频资料");
		PythonS = serviceDaoImpl.getList("DataAnalysisTools", "Python", "学习笔记");
		PythonB = serviceDaoImpl.getList("DataAnalysisTools", "Python", "电子书类");
		PythonD = serviceDaoImpl.getList("DataAnalysisTools", "Python", "参考文献");
		PythonO = serviceDaoImpl.getList("DataAnalysisTools", "Python", "其它资料");

		SpassV = serviceDaoImpl.getList("DataAnalysisTools", "Spass", "视频资料");
		SpassS = serviceDaoImpl.getList("DataAnalysisTools", "Spass", "学习笔记");
		SpassB = serviceDaoImpl.getList("DataAnalysisTools", "Spass", "电子书类");
		SpassD = serviceDaoImpl.getList("DataAnalysisTools", "Spass", "参考文献");
		SpassO = serviceDaoImpl.getList("DataAnalysisTools", "Spass", "其它资料");

		SASV = serviceDaoImpl.getList("DataAnalysisTools", "SAS", "视频资料");
		SASS = serviceDaoImpl.getList("DataAnalysisTools", "SAS", "学习笔记");
		SASB = serviceDaoImpl.getList("DataAnalysisTools", "SAS", "电子书类");
		SASD = serviceDaoImpl.getList("DataAnalysisTools", "SAS", "参考文献");
		SASO = serviceDaoImpl.getList("DataAnalysisTools", "SAS", "其它资料");

		WekaV = serviceDaoImpl.getList("DataAnalysisTools", "Weka", "视频资料");
		WekaS = serviceDaoImpl.getList("DataAnalysisTools", "Weka", "学习笔记");
		WekaB = serviceDaoImpl.getList("DataAnalysisTools", "Weka", "电子书类");
		WekaD = serviceDaoImpl.getList("DataAnalysisTools", "Weka", "参考文献");
		WekaO = serviceDaoImpl.getList("DataAnalysisTools", "Weka", "其它资料");
		return SUCCESS;
	}
}
