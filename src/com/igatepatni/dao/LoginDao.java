package com.igatepatni.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;


import com.igatepatni.bean.LoginBean;

public class LoginDao
{

	DBConnection dbConnection=new DBConnection();
	Logger logger = Logger.getLogger(Logger.class);	
	
	
	public String checkLogin(LoginBean loginBean) 
	{
	
		Connection con = dbConnection.getConnection();
		String userType = "invalid";

		try 
		{
		    PreparedStatement pst = con.prepareStatement("select * from Users_table");
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) 
			{
			
				if (loginBean.getUserId().equals(rs.getString("user_id")) && loginBean.getPassword().equals(rs.getString("password"))) 
				{
					userType = rs.getString("role");
					logger.info(userType+" user logged in");
					break;
				} 
			}

		} 
		catch (SQLException e) 
		{
			logger.error("Error while checkLogin ");
			
		}
		
		return userType;
	}



	public String getUserName(LoginBean loginBean) 
	{
		
		Connection con = dbConnection.getConnection();
		String userName = "";
		
		try 
		{
			PreparedStatement pst = con.prepareStatement("select user_name from users_table where user_id=?");
			
			pst.setString(1, loginBean.getUserId());
			ResultSet rs = pst.executeQuery();
					
			while (rs.next()) 
			{
				  userName = rs.getString(1);
				  logger.info(userName+"  logged in");
			}
            
            loginBean.setUserName(userName);
		} 
		catch (SQLException e) 
		{
			logger.error("Error while getUserName ");
		}
		return userName;
	}



	public String addUser(LoginBean login) {
		// TODO Auto-generated method stub
		Connection con = dbConnection.getConnection();
		int res = 0;
		String sql = "insert into users_table values(sequence_userId_item1.nextval,?,?,?,?,?,?,?)";
		String res1 = null;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, login.getPassword());
			ps.setString(2, login.getRole());
			ps.setString(3, login.getUserName());
			ps.setString(4, login.getMobNo());
			ps.setString(5, login.getPhNo());
			ps.setString(6, login.getAddress());
			ps.setString(7, login.getEmail());
			res = ps.executeUpdate();
			
			if (res > 0) 
			{
				String sql2 = "select sequence_userId_item1.currval from dual";
				PreparedStatement ps1 = con.prepareStatement(sql2);
				ResultSet rs2 = null;
				rs2 = ps1.executeQuery();
				rs2.next();
				
				res1=rs2.getString(1);
			
				
			}
			logger.info("New user "+login.getUserName()+" added successfully");
		} 
		catch (SQLException e) 
		{
			logger.error("Error while inserting new users");
		}
		return res1;

		
	}

}
