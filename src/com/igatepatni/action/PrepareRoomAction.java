package com.igatepatni.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PrepareRoomAction extends ActionSupport implements RequestAware{


	/**
	 * 
	 */
	Map<String, Object> application;
	private static final long serialVersionUID = 1L;
	List<String> hotelList=new ArrayList<String>();
	 HotelService hotelService=new HotelService(); 	
	   

	 
		@Override 
	    public String execute(){ 
	            
	                
	    	hotelList=hotelService.gethotelId();
	        
	       application.put("list",hotelList);
	       
	        if(hotelList!=null)
	   
	            return SUCCESS; 
	        else
	        	return "input";
	        
	    }

		public List<String> getHotelList() {
			return hotelList;
		}

		public void setHotelList(List<String> hotelList) {
			this.hotelList = hotelList;
		}

		@Override
		public void setRequest(Map<String, Object> arg0) {
			// TODO Auto-generated method stub
			application=arg0;
		}
		
		
}
