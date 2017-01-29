package com.xiaoxiaohei.ognl;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.xiaoxiaohei.form.User;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	
	
	private String name;
	private User user = new User();
	private List<User> list = new ArrayList<>();
	
	
	
	
	
	public List<User> getList() {
		return list;
	}



	public void setList(List<User> list) {
		this.list = list;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//1.....
		ActionContext context = ActionContext.getContext();
		ValueStack stack1 = context.getValueStack();
		stack1.set("username", "xiaoxiaohei");
		//2...
		stack1.push("nnnnnn");
		
		//3...
		name = "abbbbbb";
		
		list.add(user);
		list.add(user);
		list.add(user);
		
		return "success";
	}



	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
