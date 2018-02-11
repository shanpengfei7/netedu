package com.bigdata.action.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.bigdata.dao.impl.ServiceDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Web前端开发
 * 
 * @author 单鹏飞
 *
 */
@Scope("prototype")
public class WebFront extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServiceDaoImpl serviceDaoImpl;
	private List html5V;
	private List html5S;
	private List html5B;
	private List html5D;
	private List html5O;
	private List cssV;
	private List cssS;
	private List cssB;
	private List cssD;
	private List cssO;
	private List javascriptV;
	private List javascriptS;
	private List javascriptB;
	private List javascriptD;
	private List javascriptO;
	private List jqueryV;
	private List jqueryS;
	private List jqueryB;
	private List jqueryD;
	private List jqueryO;
	private List ajaxV;
	private List ajaxS;
	private List ajaxB;
	private List ajaxD;
	private List ajaxO;

	public List getHtml5O() {
		return html5O;
	}

	public void setHtml5O(List html5o) {
		html5O = html5o;
	}

	public List getCssO() {
		return cssO;
	}

	public void setCssO(List cssO) {
		this.cssO = cssO;
	}

	public List getJavascriptO() {
		return javascriptO;
	}

	public void setJavascriptO(List javascriptO) {
		this.javascriptO = javascriptO;
	}

	public List getJqueryO() {
		return jqueryO;
	}

	public void setJqueryO(List jqueryO) {
		this.jqueryO = jqueryO;
	}

	public List getAjaxO() {
		return ajaxO;
	}

	public void setAjaxO(List ajaxO) {
		this.ajaxO = ajaxO;
	}

	public List getHtml5V() {
		return html5V;
	}

	public void setHtml5V(List html5v) {
		html5V = html5v;
	}

	public List getHtml5S() {
		return html5S;
	}

	public void setHtml5S(List html5s) {
		html5S = html5s;
	}

	public List getHtml5B() {
		return html5B;
	}

	public void setHtml5B(List html5b) {
		html5B = html5b;
	}

	public List getHtml5D() {
		return html5D;
	}

	public void setHtml5D(List html5d) {
		html5D = html5d;
	}

	public List getCssV() {
		return cssV;
	}

	public void setCssV(List cssV) {
		this.cssV = cssV;
	}

	public List getCssS() {
		return cssS;
	}

	public void setCssS(List cssS) {
		this.cssS = cssS;
	}

	public List getCssB() {
		return cssB;
	}

	public void setCssB(List cssB) {
		this.cssB = cssB;
	}

	public List getCssD() {
		return cssD;
	}

	public void setCssD(List cssD) {
		this.cssD = cssD;
	}

	public List getJavascriptV() {
		return javascriptV;
	}

	public void setJavascriptV(List javascriptV) {
		this.javascriptV = javascriptV;
	}

	public List getJavascriptS() {
		return javascriptS;
	}

	public void setJavascriptS(List javascriptS) {
		this.javascriptS = javascriptS;
	}

	public List getJavascriptB() {
		return javascriptB;
	}

	public void setJavascriptB(List javascriptB) {
		this.javascriptB = javascriptB;
	}

	public List getJavascriptD() {
		return javascriptD;
	}

	public void setJavascriptD(List javascriptD) {
		this.javascriptD = javascriptD;
	}

	public List getJqueryV() {
		return jqueryV;
	}

	public void setJqueryV(List jqueryV) {
		this.jqueryV = jqueryV;
	}

	public List getJqueryS() {
		return jqueryS;
	}

	public void setJqueryS(List jqueryS) {
		this.jqueryS = jqueryS;
	}

	public List getJqueryB() {
		return jqueryB;
	}

	public void setJqueryB(List jqueryB) {
		this.jqueryB = jqueryB;
	}

	public List getJqueryD() {
		return jqueryD;
	}

	public void setJqueryD(List jqueryD) {
		this.jqueryD = jqueryD;
	}

	public List getAjaxV() {
		return ajaxV;
	}

	public void setAjaxV(List ajaxV) {
		this.ajaxV = ajaxV;
	}

	public List getAjaxS() {
		return ajaxS;
	}

	public void setAjaxS(List ajaxS) {
		this.ajaxS = ajaxS;
	}

	public List getAjaxB() {
		return ajaxB;
	}

	public void setAjaxB(List ajaxB) {
		this.ajaxB = ajaxB;
	}

	public List getAjaxD() {
		return ajaxD;
	}

	public void setAjaxD(List ajaxD) {
		this.ajaxD = ajaxD;
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
		html5V = serviceDaoImpl.getList("WebFront", "html5", "视频资料");
		html5S = serviceDaoImpl.getList("WebFront", "html5", "学习笔记");
		html5B = serviceDaoImpl.getList("WebFront", "html5", "电子书类");
		html5D = serviceDaoImpl.getList("WebFront", "html5", "参考文献");
		html5O = serviceDaoImpl.getList("WebFront", "html5", "其它资料");

		cssV = serviceDaoImpl.getList("WebFront", "css", "视频资料");
		cssS = serviceDaoImpl.getList("WebFront", "css", "学习笔记");
		cssB = serviceDaoImpl.getList("WebFront", "css", "电子书类");
		cssD = serviceDaoImpl.getList("WebFront", "css", "参考文献");
		cssO = serviceDaoImpl.getList("WebFront", "css", "其它资料");

		javascriptV = serviceDaoImpl.getList("WebFront", "javascript", "视频资料");
		javascriptS = serviceDaoImpl.getList("WebFront", "javascript", "学习笔记");
		javascriptB = serviceDaoImpl.getList("WebFront", "javascript", "电子书类");
		javascriptD = serviceDaoImpl.getList("WebFront", "javascript", "参考文献");
		javascriptO = serviceDaoImpl.getList("WebFront", "javascript", "其它资料");

		jqueryV = serviceDaoImpl.getList("WebFront", "jquery", "视频资料");
		jqueryS = serviceDaoImpl.getList("WebFront", "jquery", "学习笔记");
		jqueryB = serviceDaoImpl.getList("WebFront", "jquery", "电子书类");
		jqueryD = serviceDaoImpl.getList("WebFront", "jquery", "参考文献");
		jqueryO = serviceDaoImpl.getList("WebFront", "jquery", "其它资料");

		ajaxV = serviceDaoImpl.getList("WebFront", "ajax", "视频资料");
		ajaxS = serviceDaoImpl.getList("WebFront", "ajax", "学习笔记");
		ajaxB = serviceDaoImpl.getList("WebFront", "ajax", "电子书类");
		ajaxD = serviceDaoImpl.getList("WebFront", "ajax", "参考文献");
		ajaxO = serviceDaoImpl.getList("WebFront", "ajax", "其它资料");

		return SUCCESS;
	}
}
