package com.igatepatni.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.igatepatni.bean.LoginBean;

public class LoginDao
{

	
	  private Connection getConnection() 
	  {
		Connection con = null;
		String url = "jdbc:oracle:thin:@10.212.74.18:1521:testdb";
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "fbp10", "fbp10");
			System.out.println("connection successful");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return con;

	} 
	
	
	
	public String checkLogin(LoginBean loginBean) 
	{
	
		Connection con = getConnection();
		String userType = "invalid";

		try 
		{
		    PreparedStatement pst = con.prepareStatement("select * from Users_table");
			ResultSet rs = pst.executeQuery();
			System.out.println(loginBean.getUserId());
			System.out.println(loginBean.getPassword());
			while (rs.next()) 
			{
				System.out.println(rs.getString(1) + " " + rs.getString(2));
				if (loginBean.getUserId().equals(rs.getString("user_id")) && loginBean.getPassword().equals(rs.getString("password"))) 
				{
					userType = rs.getString("role");
					System.out.println(userType);
					break;
				} 
			}

		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		return userType;
	}



	public String getUserName(LoginBean loginBean) 
	{
		
		Connection con = getConnection();
		String userName = "";

		try 
		{
			PreparedStatement pst = con.prepareStatement("select user_name from Users where user_id=?");
			pst.setString(1, loginBean.getUserId());
			ResultSet rs = pst.executeQuery();
			System.out.println(loginBean.getUserId());
			System.out.println(loginBean.getPassword());
			while (rs.next()) 
			{
				  userName = rs.getString("");
			}

		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return userName;
	}

}
