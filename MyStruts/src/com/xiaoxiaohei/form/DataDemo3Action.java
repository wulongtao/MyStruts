package com.xiaoxiaohei.form;

import com.opensymphony.xwork2.ActionSupport;

public class DataDemo3Action extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	
	
	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(user);
		return NONE;
	}

}
