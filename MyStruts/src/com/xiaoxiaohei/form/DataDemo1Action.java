package com.xiaoxiaohei.form;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DataDemo1Action extends ActionSupport {
	private String username;
	private String password;
	private String address;
	

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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(username + "---" + password + "---" + address);
		
		ActionContext context = ServletActionContext.getContext();
		Map<String, Parameter> map = context.getParameters();
		
		System.out.println("username=" + map.get("username"));
		
		return NONE;
	}
	
}
