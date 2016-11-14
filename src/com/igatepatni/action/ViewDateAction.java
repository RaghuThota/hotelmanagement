package com.igatepatni.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.igatepatni.bean.Booking;
import com.igatepatni.bean.Hotel;
import com.igatepatni.bean.LoginBean;
import com.igatepatni.bean.ViewDate;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ViewDateAction  extends ActionSupport implements SessionAware,ModelDriven 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ViewDate viewDate=new ViewDate();
	HotelService hotelService=new HotelService();
	ArrayList<ViewDate> dateList=new ArrayList<ViewDate>();
	
	
	public ArrayList<ViewDate> gethList() {
		return dateList;
	}

	public void sethList(ArrayList<ViewDate> hList) {
		this.dateList = dateList;
	}
	Map session;
	
	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	@Override
	public String execute()
	{
		
		dateList=hotelService.getDateList(viewDate);
		if(dateList!=null)
		{
			session.put("list", dateList);
			return SUCCESS;
		} 
		else
		{
			
			return ERROR;
		}
		
	}
public Object getModel() {
		
		return viewDate;
	}




}
