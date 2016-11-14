package com.igatepatni.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.igatepatni.bean.Hotel;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;

public class RetrieveHotelAction  extends ActionSupport implements SessionAware{

	Hotel hotel=new Hotel();
	HotelService hotelService=new HotelService();
	ArrayList<Hotel> hList=new ArrayList<Hotel>();
	Map session;
	
	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	@Override
	public String execute(){
		
		hList=hotelService.retrieveHotel();
		if(hList!=null){
			session.put("list", hList);
			return SUCCESS;
		} else{
			
			return ERROR;
		}
		
	}
}
