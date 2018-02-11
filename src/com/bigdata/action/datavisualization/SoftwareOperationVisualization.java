package com.bigdata.action.datavisualization;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 基于软件操作可视化
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class SoftwareOperationVisualization extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List rbV;
	private List rbS;
	private List rbB;
	private List rbD;
	private List rbO;

	private List rgV;
	private List rgS;
	private List rgB;
	private List rgD;
	private List rgO;

	private List rvV;
	private List rvS;
	private List rvB;
	private List rvD;
	private List rvO;

	private List SpassV;
	private List SpassS;
	private List SpassB;
	private List SpassD;
	private List SpassO;

	private List TableauV;
	private List TableauS;
	private List TableauB;
	private List TableauD;
	private List TableauO;

	private List EChartsV;
	private List EChartsS;
	private List EChartsB;
	private List EChartsD;
	private List EChartsO;

	public List getRbV() {
		return rbV;
	}

	public void setRbV(List rbV) {
		this.rbV = rbV;
	}

	public List getRbS() {
		return rbS;
	}

	public void setRbS(List rbS) {
		this.rbS = rbS;
	}

	public List getRbB() {
		return rbB;
	}

	public void setRbB(List rbB) {
		this.rbB = rbB;
	}

	public List getRbD() {
		return rbD;
	}

	public void setRbD(List rbD) {
		this.rbD = rbD;
	}

	public List getRbO() {
		return rbO;
	}

	public void setRbO(List rbO) {
		this.rbO = rbO;
	}

	public List getRgV() {
		return rgV;
	}

	public void setRgV(List rgV) {
		this.rgV = rgV;
	}

	public List getRgS() {
		return rgS;
	}

	public void setRgS(List rgS) {
		this.rgS = rgS;
	}

	public List getRgB() {
		return rgB;
	}

	public void setRgB(List rgB) {
		this.rgB = rgB;
	}

	public List getRgD() {
		return rgD;
	}

	public void setRgD(List rgD) {
		this.rgD = rgD;
	}

	public List getRgO() {
		return rgO;
	}

	public void setRgO(List rgO) {
		this.rgO = rgO;
	}

	public List getRvV() {
		return rvV;
	}

	public void setRvV(List rvV) {
		this.rvV = rvV;
	}

	public List getRvS() {
		return rvS;
	}

	public void setRvS(List rvS) {
		this.rvS = rvS;
	}

	public List getRvB() {
		return rvB;
	}

	public void setRvB(List rvB) {
		this.rvB = rvB;
	}

	public List getRvD() {
		return rvD;
	}

	public void setRvD(List rvD) {
		this.rvD = rvD;
	}

	public List getRvO() {
		return rvO;
	}

	public void setRvO(List rvO) {
		this.rvO = rvO;
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

	public List getTableauV() {
		return TableauV;
	}

	public void setTableauV(List tableauV) {
		TableauV = tableauV;
	}

	public List getTableauS() {
		return TableauS;
	}

	public void setTableauS(List tableauS) {
		TableauS = tableauS;
	}

	public List getTableauB() {
		return TableauB;
	}

	public void setTableauB(List tableauB) {
		TableauB = tableauB;
	}

	public List getTableauD() {
		return TableauD;
	}

	public void setTableauD(List tableauD) {
		TableauD = tableauD;
	}

	public List getTableauO() {
		return TableauO;
	}

	public void setTableauO(List tableauO) {
		TableauO = tableauO;
	}

	public List getEChartsV() {
		return EChartsV;
	}

	public void setEChartsV(List eChartsV) {
		EChartsV = eChartsV;
	}

	public List getEChartsS() {
		return EChartsS;
	}

	public void setEChartsS(List eChartsS) {
		EChartsS = eChartsS;
	}

	public List getEChartsB() {
		return EChartsB;
	}

	public void setEChartsB(List eChartsB) {
		EChartsB = eChartsB;
	}

	public List getEChartsD() {
		return EChartsD;
	}

	public void setEChartsD(List eChartsD) {
		EChartsD = eChartsD;
	}

	public List getEChartsO() {
		return EChartsO;
	}

	public void setEChartsO(List eChartsO) {
		EChartsO = eChartsO;
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
		rbV = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"R语言基础画图", "视频资料");
		rbS = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"R语言基础画图", "学习笔记");
		rbB = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"R语言基础画图", "电子书类");
		rbD = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"R语言基础画图", "参考文献");
		rbO = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"R语言基础画图", "其它资料");

		rgV = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"R语言ggplot2画图", "视频资料");
		rgS = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"R语言ggplot2画图", "学习笔记");
		rgB = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"R语言ggplot2画图", "电子书类");
		rgD = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"R语言ggplot2画图", "参考文献");
		rgO = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"R语言ggplot2画图", "其它资料");

		rvV = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"基于R语言地图数据可视化", "视频资料");
		rvS = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"基于R语言地图数据可视化", "学习笔记");
		rvB = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"基于R语言地图数据可视化", "电子书类");
		rvD = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"基于R语言地图数据可视化", "参考文献");
		rvO = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"基于R语言地图数据可视化", "其它资料");

		SpassV = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"Spass分析工具的可视化", "视频资料");
		SpassS = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"Spass分析工具的可视化", "学习笔记");
		SpassB = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"Spass分析工具的可视化", "电子书类");
		SpassD = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"Spass分析工具的可视化", "参考文献");
		SpassO = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"Spass分析工具的可视化", "其它资料");

		TableauV = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"Tableau数据可视化", "视频资料");
		TableauS = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"Tableau数据可视化", "学习笔记");
		TableauB = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"Tableau数据可视化", "电子书类");
		TableauD = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"Tableau数据可视化", "参考文献");
		TableauO = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"Tableau数据可视化", "其它资料");

		EChartsV = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"ECharts", "视频资料");
		EChartsS = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"ECharts", "学习笔记");
		EChartsB = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"ECharts", "电子书类");
		EChartsD = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"ECharts", "参考文献");
		EChartsO = serviceDaoImpl.getList("SoftwareOperationVisualization",
				"ECharts", "其它资料");
		return SUCCESS;
	}
}
