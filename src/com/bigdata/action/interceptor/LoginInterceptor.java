package com.bigdata.action.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 这是一个防用户无登陆进入的拦截器：如果已经登陆就进入，没登陆就返回登陆界面
 * 
 * @author Administrator
 *
 */
public final class LoginInterceptor extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("username");
		if (name == null) {
			return "login";
		} else {
			return arg0.invoke();
		}
	}

}
