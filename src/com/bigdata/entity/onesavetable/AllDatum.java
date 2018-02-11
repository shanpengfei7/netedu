package com.bigdata.entity.onesavetable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * 所有的上传的资料信息都在这里存一份
 * 
 * @author 单鹏飞
 *
 */
@Entity
@Table(name = "all_datum")
@Component
public class AllDatum {

	private int id;
	private String name;
	private String path;
	private String uploader;
	private String createtime;
	private String firstmenu;
	private String secondmenu;
	private String thirdmenu;
	private String fourthmenu;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
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

	public String getThirdmenu() {
		return thirdmenu;
	}

	public void setThirdmenu(String thirdmenu) {
		this.thirdmenu = thirdmenu;
	}

	public String getFourthmenu() {
		return fourthmenu;
	}

	public void setFourthmenu(String fourthmenu) {
		this.fourthmenu = fourthmenu;
	}

}
