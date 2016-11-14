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

public class BookRoomAction  extends ActionSupport implements ModelDriven,SessionAware 
{
	Hotel hotel=new Hotel();
	Rooms room=new Rooms();
	
	


	HotelService hotelService=new HotelService();
	List<Rooms> roomTypeList=new ArrayList<Rooms>();
	
	List<Rooms> avilRoomTypeList=new ArrayList<Rooms>();
	
	List<Integer> adultList=new ArrayList<Integer>();
	List<Integer> childList=new ArrayList<Integer>();
	
	Map session;
	
	

	public Rooms getRoom1() {
		return room;
	}


	public void setRoom1(Rooms room) {
		this.room = room;
	}


	public Map getSession() {
		return session;
	}


	public void setSession(Map session) {
		this.session = session;
	}


	/*public Hotel getHotel() {
		return hotel;
	}


	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}*/


	public HotelService getHotelService() {
		return hotelService;
	}


	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}


	public List<Rooms> getRoomTypeList() {
		return roomTypeList;
	}


	public void setRoomTypeList(List<Rooms> roomTypeList) {
		this.roomTypeList = roomTypeList;
	}


	@Override
	public String execute()
	{
		
	      
		String result;
		String description="";
		String hotelId=room.getHotelId();
		roomTypeList=hotelService.searchRoomTypeByHotel(hotelId);
		description=hotelService.getDescription(hotelId);
	
		session.put("description", description);
		session.put("hotelId", hotelId);
		
		
			
		if(roomTypeList.size()>0)
		{
			 return SUCCESS;
		}
		else
		{
			 return ERROR;	
		}
		   
	}
	
	


/*	public Hotel getRoom() {
		return room;
	}


	public void setRoom(Hotel room) {
		this.room = room;
	}*/


	public List<Integer> getAdultList() {
		return adultList;
	}


	public void setAdultList(List<Integer> adultList) {
		this.adultList = adultList;
	}


	public List<Integer> getChildList() {
		return childList;
	}


	public void setChildList(List<Integer> childList) {
		this.childList = childList;
	}


	@Override
	public Object getModel() 
	{
		// TODO Auto-generated method stub
		return room;
	}


	
	
	
}
