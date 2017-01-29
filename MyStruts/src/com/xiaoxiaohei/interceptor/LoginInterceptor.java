package com.xiaoxiaohei.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.xiaoxiaohei.form.User;

public class LoginInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		Object obj = request.getSession().getAttribute("user");
		Object username = request.getSession().getAttribute("username");
		System.out.println(obj);
		System.out.println(username);
		
		if(obj != null && obj instanceof User && ((User)obj).getUsername().equals("admin")) {
			return invocation.invoke();
		}
		
		return "failed";
	}

}
