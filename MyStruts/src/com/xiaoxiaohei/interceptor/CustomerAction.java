package com.xiaoxiaohei.interceptor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xiaoxiaohei.form.User;

public class CustomerAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();
	
	private File file;
	private String fileFileName;
	private String fileContentType;
	
	private Map<String, Object> map = new HashMap<>();
	
	
	
	
	
	public Map<String, Object> getMap() {
		return map;
	}


	public void setMap(Map<String, Object> map) {
		this.map = map;
	}


	public File getFile() {
		return file;
	}


	public void setFile(File file) {
		this.file = file;
	}

	
	public String getFileFileName() {
		return fileFileName;
	}


	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	
	public String getFileContentType() {
		return fileContentType;
	}


	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return NONE;
	}
	
	
	public String login() throws Exception {
		System.out.println(user);
		
		if ("admin".equals(user.getUsername())) {
			//session
			ServletActionContext.getRequest()
				.getSession().setAttribute("user", user);
			ServletActionContext.getRequest()
			.getSession().setAttribute("username", user.getUsername());
			
			map.put("abc", "aaaaa");
			
			String root = ServletActionContext.getServletContext().getRealPath("/upload");
			InputStream is = new FileInputStream(file);
			OutputStream os = new FileOutputStream(new File(root, fileFileName));
			
			System.out.println("fileFileName=" + fileFileName);
			
			System.out.println("File:" + file.getName());
			System.out.println("file:" + file.getPath());
			
			byte[] buffer = new byte[500];
			int length = 0;
			while(-1 != (length=is.read(buffer, 0, buffer.length))) {
				os.write(buffer, 0, length);
			}
			os.close();
			is.close();
			
			return "login";
		} else {
			ServletActionContext.getRequest()
			.getSession().removeAttribute("user");
			ServletActionContext.getRequest()
			.getSession().removeAttribute("username");
			return "failed";
		}
	}
	
	public String loginSuccess() {
		return "login";
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
