package com.igatepatni.action;


import org.apache.struts2.interceptor.SessionAware;


import com.igatepatni.bean.LoginBean;
import com.igatepatni.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.Map;
public class LoginAction extends ActionSupport implements ModelDriven<LoginBean>,SessionAware
{
   private LoginBean loginBean=new LoginBean();
   LoginService loginService=null;
   String userType="invalid";
   String userName="";
   private Map<String, Object> session;
   

	public String execute()
   {
	   loginService=new LoginService();
		userType=loginService.checkLogin(loginBean);
		if(userType.equals("Admin"))
		{
			System.out.println("fck");
			return "admin";
		} 
		else if (userType.equals("Employee")|| userType.equals("Customer"))
        {
			userName=loginService.getUserName(loginBean);
			getSession().put("userName", userName);
			return "custemp";
		}
		else if (userType.equals("invalid"))
		{
			
			System.out.println("IN ACTION NULL");
			return "error";
		}
	
		return "input";

	}
   
   @Override
   public LoginBean getModel() 
   {
	
	return loginBean;
   }
   
   @Override
	public void setSession(Map<String, Object> arg0) {
		
		session=arg0;
	}

	public Map<String, Object> getSession()
	{
		return session;
	}
   
}
