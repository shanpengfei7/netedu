package com.bigdata.action.computerbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ����ϵͳ
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class OperatingSystem extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List LinuxV;
	private List LinuxS;
	private List LinuxB;
	private List LinuxD;
	private List LinuxO;

	private List WindowsV;
	private List WindowsS;
	private List WindowsB;
	private List WindowsD;
	private List WindowsO;

	private List servV;
	private List servS;
	private List servB;
	private List servD;
	private List servO;

	public List getLinuxV() {
		return LinuxV;
	}

	public void setLinuxV(List linuxV) {
		LinuxV = linuxV;
	}

	public List getLinuxS() {
		return LinuxS;
	}

	public void setLinuxS(List linuxS) {
		LinuxS = linuxS;
	}

	public List getLinuxB() {
		return LinuxB;
	}

	public void setLinuxB(List linuxB) {
		LinuxB = linuxB;
	}

	public List getLinuxD() {
		return LinuxD;
	}

	public void setLinuxD(List linuxD) {
		LinuxD = linuxD;
	}

	public List getLinuxO() {
		return LinuxO;
	}

	public void setLinuxO(List linuxO) {
		LinuxO = linuxO;
	}

	public List getWindowsV() {
		return WindowsV;
	}

	public void setWindowsV(List windowsV) {
		WindowsV = windowsV;
	}

	public List getWindowsS() {
		return WindowsS;
	}

	public void setWindowsS(List windowsS) {
		WindowsS = windowsS;
	}

	public List getWindowsB() {
		return WindowsB;
	}

	public void setWindowsB(List windowsB) {
		WindowsB = windowsB;
	}

	public List getWindowsD() {
		return WindowsD;
	}

	public void setWindowsD(List windowsD) {
		WindowsD = windowsD;
	}

	public List getWindowsO() {
		return WindowsO;
	}

	public void setWindowsO(List windowsO) {
		WindowsO = windowsO;
	}

	public List getServV() {
		return servV;
	}

	public void setServV(List servV) {
		this.servV = servV;
	}

	public List getServS() {
		return servS;
	}

	public void setServS(List servS) {
		this.servS = servS;
	}

	public List getServB() {
		return servB;
	}

	public void setServB(List servB) {
		this.servB = servB;
	}

	public List getServD() {
		return servD;
	}

	public void setServD(List servD) {
		this.servD = servD;
	}

	public List getServO() {
		return servO;
	}

	public void setServO(List servO) {
		this.servO = servO;
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
		LinuxV = serviceDaoImpl.getList("OperatingSystem", "Linux����ϵͳ", "��Ƶ����");
		LinuxS = serviceDaoImpl.getList("OperatingSystem", "Linux����ϵͳ", "ѧϰ�ʼ�");
		LinuxB = serviceDaoImpl.getList("OperatingSystem", "Linux����ϵͳ", "��������");
		LinuxD = serviceDaoImpl.getList("OperatingSystem", "Linux����ϵͳ", "�ο�����");
		LinuxO = serviceDaoImpl.getList("OperatingSystem", "Linux����ϵͳ", "��������");

		WindowsV = serviceDaoImpl.getList("OperatingSystem", "Windows����ϵͳ",
				"��Ƶ����");
		WindowsS = serviceDaoImpl.getList("OperatingSystem", "Windows����ϵͳ",
				"ѧϰ�ʼ�");
		WindowsB = serviceDaoImpl.getList("OperatingSystem", "Windows����ϵͳ",
				"��������");
		WindowsD = serviceDaoImpl.getList("OperatingSystem", "Windows����ϵͳ",
				"�ο�����");
		WindowsO = serviceDaoImpl.getList("OperatingSystem", "Windows����ϵͳ",
				"��������");

		servV = serviceDaoImpl.getList("OperatingSystem", "����������ϵͳ", "��Ƶ����");
		servS = serviceDaoImpl.getList("OperatingSystem", "����������ϵͳ", "ѧϰ�ʼ�");
		servB = serviceDaoImpl.getList("OperatingSystem", "����������ϵͳ", "��������");
		servD = serviceDaoImpl.getList("OperatingSystem", "����������ϵͳ", "�ο�����");
		servO = serviceDaoImpl.getList("OperatingSystem", "����������ϵͳ", "��������");

		return SUCCESS;
	}
}
