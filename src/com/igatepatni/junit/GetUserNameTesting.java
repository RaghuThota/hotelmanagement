package com.igatepatni.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.igatepatni.bean.LoginBean;
import com.igatepatni.dao.LoginDao;

public class GetUserNameTesting {
	@Test
	public void testGetUserName()
	{
	    LoginBean login=new LoginBean();
	    LoginDao loginDao=new LoginDao();
	    assertNotNull(loginDao.getUserName(login));
	}

}
