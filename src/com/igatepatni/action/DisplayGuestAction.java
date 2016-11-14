package com.igatepatni.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.igatepatni.bean.Booking;
import com.igatepatni.bean.Hotel;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DisplayGuestAction extends ActionSupport implements SessionAware,ModelDriven
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Hotel hotel=new Hotel();
	Booking booking=new Booking();
	String hotelId;
	HotelService hotelService=new HotelService();
	ArrayList<Booking> hList=new ArrayList<Booking>();
	
	
	public ArrayList<Booking> gethList() {
		return hList;
	}

	public void sethList(ArrayList<Booking> hList) {
		this.hList = hList;
	}
	Map session;
	
	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	@Override
	public String execute(){
		hotelId=hotel.getHotelId();
		hList=hotelService.DisplayGuestList(hotelId);
		if(hList!=null){
			session.put("list", hList);
			return SUCCESS;
		} else{
			
			return ERROR;
		}
		
	}
public Object getModel() {
		
		return hotel;
	}
}
