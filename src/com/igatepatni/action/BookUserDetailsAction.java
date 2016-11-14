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

public class BookUserDetailsAction  extends ActionSupport implements ModelDriven,SessionAware{

	Hotel hotel = new Hotel();
	HotelService hotelService=new HotelService();
	List<Rooms> roomTypeList=new ArrayList<Rooms>();
	Rooms room=new Rooms();
	Map session;
	
	public Map getSession() {
		return session;
	}


	public void setSession(Map session) {
		this.session = session;
	}


	@Override
	public String execute(){
		
		//roomTypeList=hotelService.searchRoomType();
		
		
		String result;
		
		room=hotelService.selectRoomType(room);
		
		System.out.println("The type is :"+room.getRoomType());
		
		
		
		String availability=room.getAvailability();
		
	
		
		session.put("roomId", room.getRoomId());
		session.put("roomNo", room.getRoomNo());
		
		
			
			if(availability!=null && availability.equalsIgnoreCase("yes"))
				return SUCCESS;
			else
				return "input";
				
			
		}
//			else
//			return "ERROR";
	
	
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return room;
	}
	
	
}
