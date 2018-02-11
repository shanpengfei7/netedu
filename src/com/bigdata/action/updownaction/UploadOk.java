package com.bigdata.action.updownaction;

import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Êý¾Ý²Ö¿â
 * 
 * @author µ¥Åô·É
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
