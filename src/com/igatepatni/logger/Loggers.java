package com.igatepatni.logger;

import java.io.FileOutputStream;
import org.apache.log4j.Logger;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.WriterAppender;
public class Loggers 
{
	public Loggers() {
		//creating object for logger class to log the data
		Logger logger = Logger.getLogger(Logger.class);
		
		//creating an object html layout 
		HTMLLayout objLayout = new HTMLLayout();
		
		//create an object 
		WriterAppender objAppender = null;
		try {
			
			//create an object for file output			
			FileOutputStream objFileOut = new FileOutputStream("d:\\HotelLog.html");
			
			objAppender = new WriterAppender(objLayout,objFileOut);		
			//log the data into the file EmployeeLog.html
			logger.addAppender(objAppender); 
			System.out.println("Hotel Management system loaded......Ready to use");
			} catch(Exception e) {} 	
	}
}
