package com.igatepatni.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.igatepatni.bean.Hotel;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class RetrieveForModifyAction  extends ActionSupport implements ModelDriven,SessionAware
{
	Hotel hotel=new Hotel();
	Map session;
	HotelService hotelService=new HotelService();
	ArrayList<Hotel> hList=new ArrayList<Hotel>();
	String hotelNo=null;
	
	@Override
	public String execute()
	{
		hotelNo=hotel.getHotelId();
		hList=hotelService.retrieveForModify(hotelNo);
		if(hList!=null)
		{
			
			session.put("list", hList);
			return SUCCESS;
		}
		else 
		{
			
			return INPUT;
		}
		
	}
	
	@Override
	public Object getModel() 
	{
		
		return hotel;
	}

	public Map getSession() {
		return session;
	}


	public void setSession(Map session) {
		this.session = session;
	}
}
