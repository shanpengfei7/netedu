package com.bigdata.action.updownaction;

import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ���ݲֿ�
 * 
 * @author ������
 *
 */
@Scope("prototype")
public class UploadOk extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}
}
