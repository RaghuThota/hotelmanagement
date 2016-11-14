package com.igatepatni.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.igatepatni.bean.Hotel;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;

public class GuestListAction extends ActionSupport implements RequestAware
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Map<String, Object> application;
	List<Hotel> hotelList=new ArrayList<Hotel>();
	 HotelService hotelService=new HotelService(); 	
	 public String execute(){ 
         
         
	    	hotelList=hotelService.gethotelName();
	        
	       application.put("list",hotelList);
	       
	        if(hotelList!=null)
	   
	            return SUCCESS; 
	        else
	        	return "input";
	        
	    }

		

		public List<Hotel> getHotelList() {
		return hotelList;
	}



	public void setHotelList(List<Hotel> hotelList) {
		this.hotelList = hotelList;
	}



		@Override
		public void setRequest(Map<String, Object> arg0) {
			// TODO Auto-generated method stub
			application=arg0;
		}
}
