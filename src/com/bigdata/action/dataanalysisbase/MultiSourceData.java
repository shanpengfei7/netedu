package com.bigdata.action.dataanalysisbase;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ��Դ����
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class MultiSourceData extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List<MultiSourceData> medicine;
	private List<MultiSourceData> sanitation;
	private List<MultiSourceData> education;
	private List<MultiSourceData> finance;
	private List<MultiSourceData> sport;
	private List<MultiSourceData> food;
	private List<MultiSourceData> energy;
	private List<MultiSourceData> weather;
	private List<MultiSourceData> environment;
	private List<MultiSourceData> manufacture;
	private List<MultiSourceData> agriculture;

	public List<MultiSourceData> getMedicine() {
		return medicine;
	}

	public void setMedicine(List<MultiSourceData> medicine) {
		this.medicine = medicine;
	}

	public List<MultiSourceData> getSanitation() {
		return sanitation;
	}

	public void setSanitation(List<MultiSourceData> sanitation) {
		this.sanitation = sanitation;
	}

	public List<MultiSourceData> getEducation() {
		return education;
	}

	public void setEducation(List<MultiSourceData> education) {
		this.education = education;
	}

	public List<MultiSourceData> getFinance() {
		return finance;
	}

	public void setFinance(List<MultiSourceData> finance) {
		this.finance = finance;
	}

	public List<MultiSourceData> getSport() {
		return sport;
	}

	public void setSport(List<MultiSourceData> sport) {
		this.sport = sport;
	}

	public List<MultiSourceData> getFood() {
		return food;
	}

	public void setFood(List<MultiSourceData> food) {
		this.food = food;
	}

	public List<MultiSourceData> getEnergy() {
		return energy;
	}

	public void setEnergy(List<MultiSourceData> energy) {
		this.energy = energy;
	}

	public List<MultiSourceData> getWeather() {
		return weather;
	}

	public void setWeather(List<MultiSourceData> weather) {
		this.weather = weather;
	}

	public List<MultiSourceData> getEnvironment() {
		return environment;
	}

	public void setEnvironment(List<MultiSourceData> environment) {
		this.environment = environment;
	}

	public List<MultiSourceData> getManufacture() {
		return manufacture;
	}

	public void setManufacture(List<MultiSourceData> manufacture) {
		this.manufacture = manufacture;
	}

	public List<MultiSourceData> getAgriculture() {
		return agriculture;
	}

	public void setAgriculture(List<MultiSourceData> agriculture) {
		this.agriculture = agriculture;
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

		medicine = serviceDaoImpl.getDataList("ҽ��");
		sanitation = serviceDaoImpl.getDataList("��������");
		education = serviceDaoImpl.getDataList("����");
		finance = serviceDaoImpl.getDataList("����");
		sport = serviceDaoImpl.getDataList("����");
		food = serviceDaoImpl.getDataList("ʳƷ");
		energy = serviceDaoImpl.getDataList("��Դ");
		weather = serviceDaoImpl.getDataList("����");
		environment = serviceDaoImpl.getDataList("����");
		manufacture = serviceDaoImpl.getDataList("��ҵ");
		agriculture = serviceDaoImpl.getDataList("ũҵ");
		return SUCCESS;
	}
}
