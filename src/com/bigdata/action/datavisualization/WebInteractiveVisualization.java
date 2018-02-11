package com.bigdata.action.datavisualization;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ������ҳ����ʽ���ӻ�
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class WebInteractiveVisualization extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List ArborV;
	private List ArborS;
	private List ArborB;
	private List ArborD;
	private List ArborO;

	private List CartoDBV;
	private List CartoDBS;
	private List CartoDBB;
	private List CartoDBD;
	private List CartoDBO;

	private List ChromaV;
	private List ChromaS;
	private List ChromaB;
	private List ChromaD;
	private List ChromaO;

	private List D3V;
	private List D3S;
	private List D3B;
	private List D3D;
	private List D3O;

	public List getArborV() {
		return ArborV;
	}

	public void setArborV(List arborV) {
		ArborV = arborV;
	}

	public List getArborS() {
		return ArborS;
	}

	public void setArborS(List arborS) {
		ArborS = arborS;
	}

	public List getArborB() {
		return ArborB;
	}

	public void setArborB(List arborB) {
		ArborB = arborB;
	}

	public List getArborD() {
		return ArborD;
	}

	public void setArborD(List arborD) {
		ArborD = arborD;
	}

	public List getArborO() {
		return ArborO;
	}

	public void setArborO(List arborO) {
		ArborO = arborO;
	}

	public List getCartoDBV() {
		return CartoDBV;
	}

	public void setCartoDBV(List cartoDBV) {
		CartoDBV = cartoDBV;
	}

	public List getCartoDBS() {
		return CartoDBS;
	}

	public void setCartoDBS(List cartoDBS) {
		CartoDBS = cartoDBS;
	}

	public List getCartoDBB() {
		return CartoDBB;
	}

	public void setCartoDBB(List cartoDBB) {
		CartoDBB = cartoDBB;
	}

	public List getCartoDBD() {
		return CartoDBD;
	}

	public void setCartoDBD(List cartoDBD) {
		CartoDBD = cartoDBD;
	}

	public List getCartoDBO() {
		return CartoDBO;
	}

	public void setCartoDBO(List cartoDBO) {
		CartoDBO = cartoDBO;
	}

	public List getChromaV() {
		return ChromaV;
	}

	public void setChromaV(List chromaV) {
		ChromaV = chromaV;
	}

	public List getChromaS() {
		return ChromaS;
	}

	public void setChromaS(List chromaS) {
		ChromaS = chromaS;
	}

	public List getChromaB() {
		return ChromaB;
	}

	public void setChromaB(List chromaB) {
		ChromaB = chromaB;
	}

	public List getChromaD() {
		return ChromaD;
	}

	public void setChromaD(List chromaD) {
		ChromaD = chromaD;
	}

	public List getChromaO() {
		return ChromaO;
	}

	public void setChromaO(List chromaO) {
		ChromaO = chromaO;
	}

	public List getD3V() {
		return D3V;
	}

	public void setD3V(List d3v) {
		D3V = d3v;
	}

	public List getD3S() {
		return D3S;
	}

	public void setD3S(List d3s) {
		D3S = d3s;
	}

	public List getD3B() {
		return D3B;
	}

	public void setD3B(List d3b) {
		D3B = d3b;
	}

	public List getD3D() {
		return D3D;
	}

	public void setD3D(List d3d) {
		D3D = d3d;
	}

	public List getD3O() {
		return D3O;
	}

	public void setD3O(List d3o) {
		D3O = d3o;
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
		ArborV = serviceDaoImpl.getList("WebInteractiveVisualization",
				"Arbor.js", "��Ƶ����");
		ArborS = serviceDaoImpl.getList("WebInteractiveVisualization",
				"Arbor.js", "ѧϰ�ʼ�");
		ArborB = serviceDaoImpl.getList("WebInteractiveVisualization",
				"Arbor.js", "��������");
		ArborD = serviceDaoImpl.getList("WebInteractiveVisualization",
				"Arbor.js", "�ο�����");
		ArborO = serviceDaoImpl.getList("WebInteractiveVisualization",
				"Arbor.js", "��������");

		CartoDBV = serviceDaoImpl.getList("WebInteractiveVisualization",
				"CartoDB", "��Ƶ����");
		CartoDBS = serviceDaoImpl.getList("WebInteractiveVisualization",
				"CartoDB", "ѧϰ�ʼ�");
		CartoDBB = serviceDaoImpl.getList("WebInteractiveVisualization",
				"CartoDB", "��������");
		CartoDBD = serviceDaoImpl.getList("WebInteractiveVisualization",
				"CartoDB", "�ο�����");
		CartoDBO = serviceDaoImpl.getList("WebInteractiveVisualization",
				"CartoDB", "��������");

		ChromaV = serviceDaoImpl.getList("WebInteractiveVisualization",
				"Chroma.js", "��Ƶ����");
		ChromaS = serviceDaoImpl.getList("WebInteractiveVisualization",
				"Chroma.js", "ѧϰ�ʼ�");
		ChromaB = serviceDaoImpl.getList("WebInteractiveVisualization",
				"Chroma.js", "��������");
		ChromaD = serviceDaoImpl.getList("WebInteractiveVisualization",
				"Chroma.js", "�ο�����");
		ChromaO = serviceDaoImpl.getList("WebInteractiveVisualization",
				"Chroma.js", "��������");

		D3V = serviceDaoImpl.getList("WebInteractiveVisualization", "D3.js",
				"��Ƶ����");
		D3S = serviceDaoImpl.getList("WebInteractiveVisualization", "D3.js",
				"ѧϰ�ʼ�");
		D3B = serviceDaoImpl.getList("WebInteractiveVisualization", "D3.js",
				"��������");
		D3D = serviceDaoImpl.getList("WebInteractiveVisualization", "D3.js",
				"�ο�����");
		D3O = serviceDaoImpl.getList("WebInteractiveVisualization", "D3.js",
				"��������");
		return SUCCESS;
	}
}
