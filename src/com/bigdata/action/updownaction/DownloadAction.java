package com.bigdata.action.updownaction;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;

@Scope("prototype")
public class DownloadAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private InputStream fileInput;
	private String fileName;

	public InputStream getFileInput() {
		return fileInput;
	}

	public void setFileInput(InputStream fileInput) {
		this.fileInput = fileInput;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String execute() throws Exception {
		fileInput = ServletActionContext.getServletContext()
				.getResourceAsStream("/DATA~!" + fileName);
		return SUCCESS;
	}

}