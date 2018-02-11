package com.bigdata.action.subscriber;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.bigdata.entity.subscriber.Subscriber;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 登陆
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class Login extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Map<String, Object> session = ActionContext.getContext().getSession();
	private ServiceDaoImpl serviceDaoImpl;
	private Subscriber subscriber;
	private String number;
	private String password;

	public Subscriber getSubscriber() {
		return subscriber;
	}

	@Resource
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		if (number != null && password != null) {

			subscriber = serviceDaoImpl.getSubscriberByNumber(number);
			if (subscriber == null) {
				addFieldError("loginError", "对不起，您 的号码有误！");
				return LOGIN;
			} else if (password.equals(subscriber.getPassword())) {
				session.put("username", subscriber.getUsername());
				session.put("grade", subscriber.getGrade());
				return SUCCESS;
			} else {
				addFieldError("loginError", "对不起，您 的密码有误！");
				return LOGIN;
			}
		}
		return LOGIN;
	}
}