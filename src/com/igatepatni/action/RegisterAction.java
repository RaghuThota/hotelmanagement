package com.igatepatni.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;


import com.igatepatni.bean.LoginBean;
import com.igatepatni.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport implements ModelDriven,SessionAware
{
	LoginBean login=new LoginBean();
	LoginService addUserService=new LoginService();
	String userNo=null;
	Map session;
	
	@Override
	public String execute(){
		
		userNo=addUserService.addUser(login);
		session.put("key",userNo);
		if(userNo!=null)
		{
		return "success";
		}
		else{
			return "input";
			
			}
		}
	
	@Override
	public Object getModel() {
		
		return login;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}
}
