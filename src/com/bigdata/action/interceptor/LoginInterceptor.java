package com.bigdata.action.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * ����һ�����û��޵�½�����������������Ѿ���½�ͽ��룬û��½�ͷ��ص�½����
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
