package com.bigdata.action.updownaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.bigdata.entity.onesavetable.AllDatum;
import com.bigdata.util.Cut;
import com.bigdata.util.DateToStringMethod;
import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<File> datum;
	private List<String> datumContentType;
	private List<String> datumFileName;
	private String menu;
	private String extension;
	private String firstmenu;
	private String secondmenu;
	private String uploader;
	private String tablename;
	private ServiceDaoImpl serviceDaoImpl;
	private AllDatum allDatum;
	private String allowedTypes;

	@Override
	public String execute() throws Exception {
		if (datumFileName == null) {
			return ActionSupport.LOGIN;
		}
		if (extension.equals("��ѡ��")) {
			addFieldError("errors", "��δ����������ȫ��ѡ����");
			return ActionSupport.INPUT;
		}
		String datumType = datumContentType.get(0);
		for (String fileType : datumContentType) {
			while (!datumType.equals(fileType)) {
				addFieldError("errors", "��ѡ��������ļ����Ͳ�һ��");
				return ActionSupport.INPUT;
			}
		}

		for (String fileName : datumFileName) {

			if ((serviceDaoImpl.getObjectByname(this.getTableName(secondmenu),
					fileName)).size() > 0) {
				addFieldError("errors", "����δ֪������ϵ����Ա!(������" + fileName
						+ "�ѱ��ϴ�,�������ϴ���)");
				return ActionSupport.INPUT;
			}
		}
		ServletContext servletContext = ServletActionContext
				.getServletContext();

		for (int i = 0; i < datum.size(); i++) {
			String path = servletContext.getRealPath("/DATA~!/" + firstmenu
					+ "/" + secondmenu + "/" + menu + "/" + extension);
			FileInputStream in = new FileInputStream(datum.get(i));
			FileOutputStream out = new FileOutputStream(path + "/"
					+ datumFileName.get(i));
			byte[] buffer = new byte[1024];
			int len = 0;

			while ((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len);
			}
			out.close();
			in.close();
			datum.get(i).delete();
			String createtime = DateToStringMethod.DateToStr(new Date());
			this.saveToOneTable(createtime, path, datumFileName.get(i));

			path = Cut.filterStr(path);
			this.saveToEveryTable(createtime, path, datumFileName.get(i));
		}
		return ActionSupport.SUCCESS;

	}

	public void saveToOneTable(String createtime, String path, String fileName) {
		allDatum.setCreatetime(createtime);
		allDatum.setFirstmenu(firstmenu);
		allDatum.setFourthmenu(extension);
		allDatum.setName(fileName);
		allDatum.setPath(path);
		allDatum.setSecondmenu(secondmenu);
		allDatum.setThirdmenu(menu);
		allDatum.setUploader(uploader);
		serviceDaoImpl.save(allDatum);
	}

	public void saveToEveryTable(String createtime, String path, String fileName) {
		serviceDaoImpl.saveByQuery(this.getTableName(secondmenu), createtime,
				extension, menu, fileName, path, uploader);
	}

	public String getTableName(String secondmenu) {
		switch (secondmenu) {
		case "����ϵͳ":
			tablename = "operating_system";
			break;
		case "�������":
			tablename = "program_language";
			break;
		case "office�칫���":
			tablename = "office";
			break;
		case "������ͼ����":
			tablename = "meeting_drawing_tools";
			break;
		case "�ߵ���ѧ":
			tablename = "advanced_mathematics";
			break;
		case "���Դ���":
			tablename = "linear_algebra";
			break;
		case "ͳ��ѧ":
			tablename = "statistics";
			break;
		case "������":
			tablename = "probability_theory";
			break;
		case "�������ݷ�������":
			tablename = "data_analysis_tools";
			break;
		case "��Դ����":
			tablename = "multi_source_data";
			break;
		case "���ݷ��������㷨":
			tablename = "data_analysis_algorithms";
			break;
		case "���ݷ���ģ��":
			tablename = "data_analysis_model";
			break;
		case "���ݿ��ӻ�����":
			tablename = "data_visualization";
			break;
		case "���ݲֿ�":
			tablename = "dw";
			break;
		case "OLAP����������������":
			tablename = "olap";
			break;
		case "�����ھ򾭵��㷨":
			tablename = "data_mining_algorithms";
			break;
		case "����ѧϰ":
			tablename = "machine_learning";
			break;
		case "��ϵ�����ݿ�":
			tablename = "relational_database";
			break;
		case "�ǹ�ϵ�����ݿ�":
			tablename = "non_relational_database";
			break;
		case "�����ݷֲ�ʽ������":
			tablename = "bigdata_distributed_processing_framework";
			break;
		case "�Ƽ������ƽ̨":
			tablename = "cloud_management_platform";
			break;
		case "Webǰ�˿���":
			tablename = "web_front";
			break;
		case "Web��̨ʵ��":
			tablename = "web_background";
			break;
		case "��������������ӻ�":
			tablename = "software_operation_visualization";
			break;
		case "������ҳ����ʽ���ӻ�":
			tablename = "web_interactive_visualization";
			break;
		case "MATLAB����":
			tablename = "matlab";
			break;
		case "����ͼ�������":
			tablename = "digital_image_processing";
			break;
		case "ͼ��Ԥ����":
			tablename = "image_pre_processing";
			break;
		case "ͼ��������ȡ":
			tablename = "image_characteristics_extraction";
			break;
		case "ͼ�������㷨":
			tablename = "image_processing_algorithm";
			break;
		case "ģʽʶ��":
			tablename = "pattern_recognition";
			break;
		case "ͼ��GUI���ɽ���":
			tablename = "gui";
			break;
		case "��׿App����":
			tablename = "app";
			break;

		default:
			break;
		}
		return tablename;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public AllDatum getAllDatum() {
		return allDatum;
	}

	@Resource
	public void setAllDatum(AllDatum allDatum) {
		this.allDatum = allDatum;
	}

	public ServiceDaoImpl getServiceDaoImpl() {
		return serviceDaoImpl;
	}

	@Resource
	public void setServiceDaoImpl(ServiceDaoImpl serviceDaoImpl) {
		this.serviceDaoImpl = serviceDaoImpl;
	}

	public List<File> getDatum() {
		return datum;
	}

	public void setDatum(List<File> datum) {
		this.datum = datum;
	}

	public List<String> getDatumContentType() {
		return datumContentType;
	}

	public void setDatumContentType(List<String> datumContentType) {
		this.datumContentType = datumContentType;
	}

	public List<String> getDatumFileName() {
		return datumFileName;
	}

	public void setDatumFileName(List<String> datumFileName) {
		this.datumFileName = datumFileName;
	}

	public String getAllowedTypes() {
		return allowedTypes;
	}

	public void setAllowedTypes(String allowedTypes) {
		this.allowedTypes = allowedTypes;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getFirstmenu() {
		return firstmenu;
	}

	public void setFirstmenu(String firstmenu) {
		this.firstmenu = firstmenu;
	}

	public String getSecondmenu() {
		return secondmenu;
	}

	public void setSecondmenu(String secondmenu) {
		this.secondmenu = secondmenu;
	}

}
