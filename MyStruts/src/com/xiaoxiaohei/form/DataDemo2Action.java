package com.xiaoxiaohei.form;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DataDemo2Action extends ActionSupport implements ModelDriven<User> {
	private User user = new User();
	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.user);
		return NONE;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return this.user;
	}
}
