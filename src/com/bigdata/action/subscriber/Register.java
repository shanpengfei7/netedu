package com.bigdata.action.subscriber;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.bigdata.entity.subscriber.Subscriber;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ×¢²á
 * 
 * @author µ¥Åô·É
 *
 */
@Scope("prototype")
public class Register extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Map<String, Object> session = ActionContext.getContext().getSession();
	private ServiceDaoImpl serviceDaoImpl;
	private String username;
	private String password;
	private String password2;
	private Subscriber subscriber;
	private String cars;
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCars() {
		return cars;
	}

	public void setCars(String cars) {
		this.cars = cars;
	}

	public Subscriber getSubscriber() {
		return subscriber;
	}

	@Resource
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
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
		if (username == null && password == null && password2 == null
				&& number == null && cars == null) {
			return LOGIN;
		}
		if (username != null || password != null || password2 != null
				|| number != null || cars != "0") {
			if (serviceDaoImpl.getSubscriberByNumber(number) == null) {
				if (password.equals(password2)) {
					int i = 2;
					subscriber.setGroupname(cars);
					subscriber.setGrade(i);
					subscriber.setNumber(number);
					subscriber.setPassword(password);
					subscriber.setUsername(username);
					serviceDaoImpl.save(subscriber);
					
					session.put("username", subscriber.getUsername());
					session.put("grade", subscriber.getGrade());
					return SUCCESS;
				}
			}
		}
		return LOGIN;
	}
}
