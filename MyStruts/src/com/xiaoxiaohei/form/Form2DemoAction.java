package com.xiaoxiaohei.form;

import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.tribes.util.Arrays;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Form2DemoAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("req", "reqValue");
		
		HttpSession session = request.getSession();
		session.setAttribute("sess", "sessionValue");
		
		ServletContext context = ServletActionContext.getServletContext();
		context.setAttribute("context", "contextValue");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		
		
		System.out.println(username + ":" + password + ":" + address);
		
		return NONE;
	}
}
