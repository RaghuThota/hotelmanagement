package com.igatepatni.service;

import com.igatepatni.bean.LoginBean;
import com.igatepatni.dao.LoginDao;

public class LoginService 
{
	LoginDao loginDao=null;
	String userType="invalid";
	String userName="";
	
	public String checkLogin(LoginBean loginBean) 
	{
		loginDao = new LoginDao();
	    userType = loginDao.checkLogin(loginBean);   	
		return userType;
	}

	public String getUserName(LoginBean loginBean) 
	{
		loginDao = new LoginDao();
	    userName = loginDao.getUserName(loginBean); 	
		return null;
	}

	
}
