package com.igatepatni.action;

import com.igatepatni.bean.Rooms;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModifyRoomAction extends ActionSupport implements ModelDriven{

	Rooms room=new Rooms();
	HotelService hotelService=new HotelService();
	
	@Override
	public String execute(){
		
		hotelService.modifyRoom(room);
		return SUCCESS;
	}
	
	@Override
	public Object getModel() {
		
		return room;
	}
}
