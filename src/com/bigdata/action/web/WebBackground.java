package com.bigdata.action.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Web后台实现
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class WebBackground extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List jdbcV;
	private List jdbcS;
	private List jdbcB;
	private List jdbcD;
	private List jdbcO;

	private List servletV;
	private List servletS;
	private List servletB;
	private List servletD;
	private List servletO;

	private List jspV;
	private List jspS;
	private List jspB;
	private List jspD;
	private List jspO;

	private List struts2V;
	private List struts2S;
	private List struts2B;
	private List struts2D;
	private List struts2O;

	private List hibernateV;
	private List hibernateS;
	private List hibernateB;
	private List hibernateD;
	private List hibernateO;

	private List springV;
	private List springS;
	private List springB;
	private List springD;
	private List springO;

	public ServiceDaoImpl getServiceDaoImpl() {
		return serviceDaoImpl;
	}

	@Resource
	public void setServiceDaoImpl(ServiceDaoImpl serviceDaoImpl) {
		this.serviceDaoImpl = serviceDaoImpl;
	}

	public List getJdbcO() {
		return jdbcO;
	}

	public void setJdbcO(List jdbcO) {
		this.jdbcO = jdbcO;
	}

	public List getServletO() {
		return servletO;
	}

	public void setServletO(List servletO) {
		this.servletO = servletO;
	}

	public List getJspO() {
		return jspO;
	}

	public void setJspO(List jspO) {
		this.jspO = jspO;
	}

	public List getStruts2O() {
		return struts2O;
	}

	public void setStruts2O(List struts2o) {
		struts2O = struts2o;
	}

	public List getHibernateO() {
		return hibernateO;
	}

	public void setHibernateO(List hibernateO) {
		this.hibernateO = hibernateO;
	}

	public List getSpringO() {
		return springO;
	}

	public void setSpringO(List springO) {
		this.springO = springO;
	}

	public void setSpringV(List springV) {
		this.springV = springV;
	}

	public List getJdbcV() {
		return jdbcV;
	}

	public void setJdbcV(List jdbcV) {
		this.jdbcV = jdbcV;
	}

	public List getJdbcS() {
		return jdbcS;
	}

	public void setJdbcS(List jdbcS) {
		this.jdbcS = jdbcS;
	}

	public List getJdbcB() {
		return jdbcB;
	}

	public void setJdbcB(List jdbcB) {
		this.jdbcB = jdbcB;
	}

	public List getJdbcD() {
		return jdbcD;
	}

	public void setJdbcD(List jdbcD) {
		this.jdbcD = jdbcD;
	}

	public List getServletV() {
		return servletV;
	}

	public void setServletV(List servletV) {
		this.servletV = servletV;
	}

	public List getServletS() {
		return servletS;
	}

	public void setServletS(List servletS) {
		this.servletS = servletS;
	}

	public List getServletB() {
		return servletB;
	}

	public void setServletB(List servletB) {
		this.servletB = servletB;
	}

	public List getServletD() {
		return servletD;
	}

	public void setServletD(List servletD) {
		this.servletD = servletD;
	}

	public List getJspV() {
		return jspV;
	}

	public void setJspV(List jspV) {
		this.jspV = jspV;
	}

	public List getJspS() {
		return jspS;
	}

	public void setJspS(List jspS) {
		this.jspS = jspS;
	}

	public List getJspB() {
		return jspB;
	}

	public void setJspB(List jspB) {
		this.jspB = jspB;
	}

	public List getJspD() {
		return jspD;
	}

	public void setJspD(List jspD) {
		this.jspD = jspD;
	}

	public List getStruts2V() {
		return struts2V;
	}

	public void setStruts2V(List struts2v) {
		struts2V = struts2v;
	}

	public List getStruts2S() {
		return struts2S;
	}

	public void setStruts2S(List struts2s) {
		struts2S = struts2s;
	}

	public List getStruts2B() {
		return struts2B;
	}

	public void setStruts2B(List struts2b) {
		struts2B = struts2b;
	}

	public List getStruts2D() {
		return struts2D;
	}

	public void setStruts2D(List struts2d) {
		struts2D = struts2d;
	}

	public List getHibernateV() {
		return hibernateV;
	}

	public void setHibernateV(List hibernateV) {
		this.hibernateV = hibernateV;
	}

	public List getHibernateS() {
		return hibernateS;
	}

	public void setHibernateS(List hibernateS) {
		this.hibernateS = hibernateS;
	}

	public List getHibernateB() {
		return hibernateB;
	}

	public void setHibernateB(List hibernateB) {
		this.hibernateB = hibernateB;
	}

	public List getHibernateD() {
		return hibernateD;
	}

	public void setHibernateD(List hibernateD) {
		this.hibernateD = hibernateD;
	}

	public List getSpringV() {
		return springV;
	}

	public void setSpring(List springV) {
		this.springV = springV;
	}

	public List getSpringS() {
		return springS;
	}

	public void setSpringS(List springS) {
		this.springS = springS;
	}

	public List getSpringB() {
		return springB;
	}

	public void setSpringB(List springB) {
		this.springB = springB;
	}

	public List getSpringD() {
		return springD;
	}

	public void setSpringD(List springD) {
		this.springD = springD;
	}

	@Override
	public String execute() throws Exception {

		jdbcV = serviceDaoImpl.getList("WebBackground", "jdbc", "视频资料");
		jdbcS = serviceDaoImpl.getList("WebBackground", "jdbc", "学习笔记");
		jdbcB = serviceDaoImpl.getList("WebBackground", "jdbc", "电子书类");
		jdbcD = serviceDaoImpl.getList("WebBackground", "jdbc", "参考文献");
		jdbcO = serviceDaoImpl.getList("WebBackground", "jdbc", "其它资料");

		servletV = serviceDaoImpl.getList("WebBackground", "servlet", "视频资料");
		servletS = serviceDaoImpl.getList("WebBackground", "servlet", "学习笔记");
		servletB = serviceDaoImpl.getList("WebBackground", "servlet", "电子书类");
		servletD = serviceDaoImpl.getList("WebBackground", "servlet", "参考文献");
		servletO = serviceDaoImpl.getList("WebBackground", "servlet", "其它资料");

		jspV = serviceDaoImpl.getList("WebBackground", "jsp", "视频资料");
		jspS = serviceDaoImpl.getList("WebBackground", "jsp", "学习笔记");
		jspB = serviceDaoImpl.getList("WebBackground", "jsp", "电子书类");
		jspD = serviceDaoImpl.getList("WebBackground", "jsp", "参考文献");
		jspO = serviceDaoImpl.getList("WebBackground", "jsp", "其它资料");

		struts2V = serviceDaoImpl.getList("WebBackground", "struts2", "视频资料");
		struts2S = serviceDaoImpl.getList("WebBackground", "struts2", "学习笔记");
		struts2B = serviceDaoImpl.getList("WebBackground", "struts2", "电子书类");
		struts2D = serviceDaoImpl.getList("WebBackground", "struts2", "参考文献");
		struts2O = serviceDaoImpl.getList("WebBackground", "struts2", "其它资料");

		hibernateV = serviceDaoImpl.getList("WebBackground", "hibernate",
				"视频资料");
		hibernateS = serviceDaoImpl.getList("WebBackground", "hibernate",
				"学习笔记");
		hibernateB = serviceDaoImpl.getList("WebBackground", "hibernate",
				"电子书类");
		hibernateD = serviceDaoImpl.getList("WebBackground", "hibernate",
				"参考文献");
		hibernateO = serviceDaoImpl.getList("WebBackground", "hibernate",
				"其它资料");
		springV = serviceDaoImpl.getList("WebBackground", "spring", "视频资料");
		springS = serviceDaoImpl.getList("WebBackground", "spring", "学习笔记");
		springB = serviceDaoImpl.getList("WebBackground", "spring", "电子书类");
		springD = serviceDaoImpl.getList("WebBackground", "spring", "参考文献");
		springO = serviceDaoImpl.getList("WebBackground", "spring", "其它资料");
		return SUCCESS;
	}
}
