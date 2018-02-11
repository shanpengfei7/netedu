package com.bigdata.action.computerbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ������ͼ����
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class MeetingDrawingTools extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;

	private List VisioV;
	private List VisioS;
	private List VisioB;
	private List VisioD;
	private List VisioO;

	private List ImindmapV;
	private List ImindmapS;
	private List ImindmapB;
	private List ImindmapD;
	private List ImindmapO;

	private List TheBrainV;
	private List TheBrainS;
	private List TheBrainB;
	private List TheBrainD;
	private List TheBrainO;

	public List getVisioV() {
		return VisioV;
	}

	public void setVisioV(List visioV) {
		VisioV = visioV;
	}

	public List getVisioS() {
		return VisioS;
	}

	public void setVisioS(List visioS) {
		VisioS = visioS;
	}

	public List getVisioB() {
		return VisioB;
	}

	public void setVisioB(List visioB) {
		VisioB = visioB;
	}

	public List getVisioD() {
		return VisioD;
	}

	public void setVisioD(List visioD) {
		VisioD = visioD;
	}

	public List getVisioO() {
		return VisioO;
	}

	public void setVisioO(List visioO) {
		VisioO = visioO;
	}

	public List getImindmapV() {
		return ImindmapV;
	}

	public void setImindmapV(List imindmapV) {
		ImindmapV = imindmapV;
	}

	public List getImindmapS() {
		return ImindmapS;
	}

	public void setImindmapS(List imindmapS) {
		ImindmapS = imindmapS;
	}

	public List getImindmapB() {
		return ImindmapB;
	}

	public void setImindmapB(List imindmapB) {
		ImindmapB = imindmapB;
	}

	public List getImindmapD() {
		return ImindmapD;
	}

	public void setImindmapD(List imindmapD) {
		ImindmapD = imindmapD;
	}

	public List getImindmapO() {
		return ImindmapO;
	}

	public void setImindmapO(List imindmapO) {
		ImindmapO = imindmapO;
	}

	public List getTheBrainV() {
		return TheBrainV;
	}

	public void setTheBrainV(List theBrainV) {
		TheBrainV = theBrainV;
	}

	public List getTheBrainS() {
		return TheBrainS;
	}

	public void setTheBrainS(List theBrainS) {
		TheBrainS = theBrainS;
	}

	public List getTheBrainB() {
		return TheBrainB;
	}

	public void setTheBrainB(List theBrainB) {
		TheBrainB = theBrainB;
	}

	public List getTheBrainD() {
		return TheBrainD;
	}

	public void setTheBrainD(List theBrainD) {
		TheBrainD = theBrainD;
	}

	public List getTheBrainO() {
		return TheBrainO;
	}

	public void setTheBrainO(List theBrainO) {
		TheBrainO = theBrainO;
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
		VisioV = serviceDaoImpl.getList("MeetingDrawingTools", "Visio", "��Ƶ����");
		VisioS = serviceDaoImpl.getList("MeetingDrawingTools", "Visio", "ѧϰ�ʼ�");
		VisioB = serviceDaoImpl.getList("MeetingDrawingTools", "Visio", "��������");
		VisioD = serviceDaoImpl.getList("MeetingDrawingTools", "Visio", "�ο�����");
		VisioO = serviceDaoImpl.getList("MeetingDrawingTools", "Visio", "��������");

		ImindmapV = serviceDaoImpl.getList("MeetingDrawingTools", "Imindmap",
				"��Ƶ����");
		ImindmapS = serviceDaoImpl.getList("MeetingDrawingTools", "Imindmap",
				"ѧϰ�ʼ�");
		ImindmapB = serviceDaoImpl.getList("MeetingDrawingTools", "Imindmap",
				"��������");
		ImindmapD = serviceDaoImpl.getList("MeetingDrawingTools", "Imindmap",
				"�ο�����");
		ImindmapO = serviceDaoImpl.getList("MeetingDrawingTools", "Imindmap",
				"��������");

		TheBrainV = serviceDaoImpl.getList("MeetingDrawingTools", "TheBrain",
				"��Ƶ����");
		TheBrainS = serviceDaoImpl.getList("MeetingDrawingTools", "TheBrain",
				"ѧϰ�ʼ�");
		TheBrainB = serviceDaoImpl.getList("MeetingDrawingTools", "TheBrain",
				"��������");
		TheBrainD = serviceDaoImpl.getList("MeetingDrawingTools", "TheBrain",
				"�ο�����");
		TheBrainO = serviceDaoImpl.getList("MeetingDrawingTools", "TheBrain",
				"��������");

		return SUCCESS;
	}
}
