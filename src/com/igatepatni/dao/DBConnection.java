package com.igatepatni.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class DBConnection 
{
	Logger logger = Logger.getLogger(Logger.class);	
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
				
				logger.info("Connection established successfully");
				
			}
	        catch (ClassNotFoundException e1) 
	        {
	        	logger.error("Error occured while connecting");
	        }
	        catch (SQLException e) 
	        {
	        	logger.error("Error occured while connecting");
			}  
			catch(Exception e)
			{
				logger.error("Error occured while connecting");
			}
			
		
		return con;
		
	}
}
