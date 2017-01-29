package com.xiaoxiaohei.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction {
	

	public String execute() {
		return "ok";
	}
	
	public String test() {
		System.out.println("test");
		return "test";
	}
	
	public String noneTest() {
		System.out.println("return none");
		return ActionSupport.NONE;
	}
}
