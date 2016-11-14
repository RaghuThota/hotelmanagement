package com.igatepatni.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	public Connection getConnection()  
	{
		String url="jdbc:oracle:thin:@10.212.74.18:1521:testdb";
		String uname="fbp10";
		String password="fbp10";
		String connection="oracle.jdbc.driver.OracleDriver";
		Connection con=null;
		
			try {
				Class.forName(connection);
				con=DriverManager.getConnection(url,uname,password );
				
				
				
			}
	        catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
	         	e1.printStackTrace();
	          }                                 //2. load register driver
	catch (SQLException e) {
				e.printStackTrace();
			}  
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		
		return con;
		
	}
}
