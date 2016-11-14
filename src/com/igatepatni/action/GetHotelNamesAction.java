package com.igatepatni.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.igatepatni.bean.Hotel;
import com.igatepatni.bean.Rooms;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GetHotelNamesAction  extends ActionSupport implements ModelDriven,SessionAware {

	Hotel hotel=new Hotel();
	HotelService hotelService=new HotelService();
	List<Hotel> hotelList=new ArrayList<Hotel>();
	List<Rooms> roomTypeList=new ArrayList<Rooms>();
	
	public List<Rooms> getRoomTypeList() {
		return roomTypeList;
	}


	public void setRoomTypeList(List<Rooms> roomTypeList) {
		this.roomTypeList = roomTypeList;
	}


	Map session;
	public Map getSession() {
		return session;
	}


	public void setSession(Map session) {
		this.session = session;
	}


	public Hotel getHotel() {
		return hotel;
	}


	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}


	public HotelService getHotelService() {
		return hotelService;
	}


	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}


	public List<Hotel> getHotelList() {
		return hotelList;
	}


	public void setHotelList(List<Hotel> hotelList) {
		this.hotelList = hotelList;
	}


	public String execute()
	{
		hotelList=hotelService.searchHotelNames();
		
		if(hotelList!=null)
		{
			//session.put("list", hotelList);
			return SUCCESS;
		}
		else
		{
		    return ERROR;
		}
	}
	
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return 	hotel;
	}



}
