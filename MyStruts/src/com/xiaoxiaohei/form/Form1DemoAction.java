package com.xiaoxiaohei.form;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.tribes.util.Arrays;
import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Form1DemoAction extends ActionSupport implements ServletRequestAware {
	private HttpServletRequest request;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("start");
		//1.get ActionContext
		ActionContext context = ActionContext.getContext();
		//2.get params
		Map<String,Parameter> map = context.getParameters();
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			Parameter obj = map.get(key);
			
			System.out.println(key + "=" + Arrays.toString(obj.getMultipleValues()));
		}
		
		return NONE;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
}
