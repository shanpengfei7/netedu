package com.bigdata.action.computerbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * office办公软件
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class Office extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List PPTV;
	private List PPTS;
	private List PPTB;
	private List PPTD;
	private List PPTO;

	private List WordV;
	private List WordS;
	private List WordB;
	private List WordD;
	private List WordO;

	private List ExcelV;
	private List ExcelS;
	private List ExcelB;
	private List ExcelD;
	private List ExcelO;

	public List getPPTV() {
		return PPTV;
	}

	public void setPPTV(List pPTV) {
		PPTV = pPTV;
	}

	public List getPPTS() {
		return PPTS;
	}

	public void setPPTS(List pPTS) {
		PPTS = pPTS;
	}

	public List getPPTB() {
		return PPTB;
	}

	public void setPPTB(List pPTB) {
		PPTB = pPTB;
	}

	public List getPPTD() {
		return PPTD;
	}

	public void setPPTD(List pPTD) {
		PPTD = pPTD;
	}

	public List getPPTO() {
		return PPTO;
	}

	public void setPPTO(List pPTO) {
		PPTO = pPTO;
	}

	public List getWordV() {
		return WordV;
	}

	public void setWordV(List wordV) {
		WordV = wordV;
	}

	public List getWordS() {
		return WordS;
	}

	public void setWordS(List wordS) {
		WordS = wordS;
	}

	public List getWordB() {
		return WordB;
	}

	public void setWordB(List wordB) {
		WordB = wordB;
	}

	public List getWordD() {
		return WordD;
	}

	public void setWordD(List wordD) {
		WordD = wordD;
	}

	public List getWordO() {
		return WordO;
	}

	public void setWordO(List wordO) {
		WordO = wordO;
	}

	public List getExcelV() {
		return ExcelV;
	}

	public void setExcelV(List excelV) {
		ExcelV = excelV;
	}

	public List getExcelS() {
		return ExcelS;
	}

	public void setExcelS(List excelS) {
		ExcelS = excelS;
	}

	public List getExcelB() {
		return ExcelB;
	}

	public void setExcelB(List excelB) {
		ExcelB = excelB;
	}

	public List getExcelD() {
		return ExcelD;
	}

	public void setExcelD(List excelD) {
		ExcelD = excelD;
	}

	public List getExcelO() {
		return ExcelO;
	}

	public void setExcelO(List excelO) {
		ExcelO = excelO;
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
		PPTV = serviceDaoImpl.getList("Office", "PPT", "视频资料");
		PPTS = serviceDaoImpl.getList("Office", "PPT", "学习笔记");
		PPTB = serviceDaoImpl.getList("Office", "PPT", "电子书类");
		PPTD = serviceDaoImpl.getList("Office", "PPT", "参考文献");
		PPTO = serviceDaoImpl.getList("Office", "PPT", "其它资料");

		WordV = serviceDaoImpl.getList("Office", "Word", "视频资料");
		WordS = serviceDaoImpl.getList("Office", "Word", "学习笔记");
		WordB = serviceDaoImpl.getList("Office", "Word", "电子书类");
		WordD = serviceDaoImpl.getList("Office", "Word", "参考文献");
		WordO = serviceDaoImpl.getList("Office", "Word", "其它资料");

		ExcelV = serviceDaoImpl.getList("Office", "Excel", "视频资料");
		ExcelS = serviceDaoImpl.getList("Office", "Excel", "学习笔记");
		ExcelB = serviceDaoImpl.getList("Office", "Excel", "电子书类");
		ExcelD = serviceDaoImpl.getList("Office", "Excel", "参考文献");
		ExcelO = serviceDaoImpl.getList("Office", "Excel", "其它资料");

		return SUCCESS;
	}
}
