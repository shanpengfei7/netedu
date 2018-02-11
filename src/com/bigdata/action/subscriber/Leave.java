package com.bigdata.action.subscriber;

import java.util.Map;

import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ÍË³ö
 * 
 * @author µ¥Åô·É
 *
 */
@Scope("prototype")
public class Leave extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Map<String, Object> session = ActionContext.getContext().getSession();

	@Override
	public String execute() throws Exception {

		session.remove("username");
		session.remove("grade");
		return SUCCESS;
	}
}